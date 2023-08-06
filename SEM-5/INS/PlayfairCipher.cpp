#include<iostream>
using namespace std;


int main()
{

    char plainText[30],matrix[5][5],key[10],tempKey[25],tempMatrix[25],cipher[25],decAry[25],temp[25];

    int k=0,len=0,plen=0,part=0,index1Row,index1Column,index2Row,index2Column,cIndex=0;
    int indexAry[30];
    bool flag,flag1;;

    cout<<"Enter plaintext : ";
    cin>>plainText;

    cout<<"Enter key : ";
    cin>>key;

    for(int i=0; plainText[i]!=NULL; i++)
    {
        if(plainText[i]>='A' && plainText[i]<='Z')
        {
            plainText[i]=plainText[i]+32;
        }
        temp[i]=plainText[i];
        if(plainText[i]=='j' || plainText[i]=='J')
        {
            plainText[i]='i';
        }

        plen++;
        if(i%2==0)
        {
            part++;
        }
    }

    for(int i=0; key[i]!=NULL; i++)
    {
        if(key[i]>='A' && key[i]<='Z')
        {
            key[i]=key[i]+32;
        }

        if(key[i]=='j' || key[i]=='J')
        {
            key[i]='i';
        }
    }


    for(int i=0; key[i]!=NULL; i++)
    {
        flag=false;
        for(int j=0; tempKey[j]!=NULL; j++)
        {
            if((tempKey[j]+32)==key[i])
            {
                flag=true;
                break;
            }
        }
        if(!flag)
        {
            tempKey[k]=key[i]-32;
            k++;
        }
    }

    len=k;
    for(char i='A'; i<='Z'; i++)
    {
        if(i=='J')
        {
            i++;
        }

        flag=false;
        for(int j=0; tempKey[j]!=NULL; j++)
        {
            if(i==tempKey[j])
            {
                flag=true;
                break;
            }
        }

        if(!flag)
        {
            tempKey[k]=i;
            k++;
        }
    }

    len=0;
    for(int i=0; i<5; i++)
    {
        for(int j=0; j<5; j++)
        {
            matrix[i][j]=tempKey[len++];
        }

    }

    cout<<"\n\n-----Matrix-----"<<endl<<endl;

    for(int i=0; i<5; i++)
    {
        for(int j=0; j<5; j++)
        {
            cout<<matrix[i][j]<<" ";
        }
        cout<<endl;
    }

    cout<<"\n\n----------Plaintext divide in 2 char ---------"<<endl<<endl;
    k=0;
    for(int i=0; plainText[i]!=NULL; i++)
    {
        if(plainText[i]==plainText[i+1])
        {
            plen++;
            for(int j=plen; j >= i+1; j--)
            {
                plainText[j]=plainText[j-1];
            }
            if(plainText[i] == 'x')
            {
                plainText[i+1]='y';
            }
            else
            {
                plainText[i+1]='x';
            }
            indexAry[k]=i;
            k++;
        }
        i++;
    }

    if(plen % 2 != 0)
    {
        if(plainText[plen - 1] == 'x')
        {
            plainText[plen]='y';
        }
        else
        {
            plainText[plen]='x';
        }
        plen++;
    }

    for(int i=0; i<plen; i++)
    {
        if(i%2==0 && i!=0)
        {
            cout<<" ";
        }
        plainText[i]-=32;
        cout<<plainText[i];
    }


    for(int i=0; plainText[i]!=NULL; i++)
    {
        flag=flag1=false;
        for(int j=0; j<5; j++)
        {
            for(int l=0; l<5; l++)
            {
                if(plainText[i] == matrix[j][l])
                {
                    index1Row=j;
                    index1Column=l;
                    flag=true;
                }
                if(plainText[i+1] == matrix[j][l])
                {
                    index2Row=j;
                    index2Column=l;
                    flag1=true;
                }
                if(flag && flag1)
                {
                    break;
                }
            }
            if(flag && flag1)
            {
                break;
            }
        }


        if(index1Row==index2Row)
        {
            if(index1Column==4)
            {
                cipher[cIndex]=matrix[index1Row][0];
                cIndex++;
                cipher[cIndex]=matrix[index2Row][index2Column+1];
                cIndex++;
            }
            else if(index2Column==4)
            {
                cipher[cIndex]=matrix[index1Row][index1Column+1];
                cIndex++;
                cipher[cIndex]=matrix[index2Row][0];
                cIndex++;
            }
            else
            {
                cipher[cIndex]=matrix[index1Row][index1Column+1];
                cIndex++;
                cipher[cIndex]=matrix[index2Row][index2Column+1];
                cIndex++;
            }
        }
        else if(index1Column==index2Column)
        {
            if(index1Row==4)
            {
                cipher[cIndex]=matrix[0][index1Column];
                cIndex++;
                cipher[cIndex]=matrix[index2Row+1][index2Column];
                cIndex++;
            }
            else if(index2Row==4)
            {
                cipher[cIndex]=matrix[index1Row+1][index1Column];
                cIndex++;
                cipher[cIndex]=matrix[0][index2Column];
                cIndex++;
            }
            else
            {
                cipher[cIndex]=matrix[index1Row+1][index1Column];
                cIndex++;
                cipher[cIndex]=matrix[index2Row+1][index2Column];
                cIndex++;
            }
        }
        else
        {
            cipher[cIndex]=matrix[index1Row][index2Column];
            cIndex++;
            cipher[cIndex]=matrix[index2Row][index1Column];
            cIndex++;
        }

        flag=flag1=false;
        i++;

    }

    cout<<"\n\n-----Plaintext to Ciphertext-----"<<endl<<endl;
    cout<<"Plain text  : ";
    for(int i=0;i<plen; i++)
    {
       cout<<temp[i];
    }
    cout<<endl;
    cout<<"Key         : "<<key<<endl;
    cout<<"Cipher text : ";
    for(int i=0;i<plen; i++)
    {
       cout<<cipher[i];
    }
    cout<<endl;

    cIndex=0;
    cout<<"\n\n-----Ciphertext to Plaintext-----"<<endl<<endl;
    cout<<"Cipher text    : ";
    for(int i=0;i<plen; i++)
    {
       cout<<cipher[i];
    }
    cout<<endl;
    cout<<"Key            : "<<key<<endl;

    for(int i=0; cipher[i]!=NULL; i++)
    {
        flag=flag1=false;
        for(int j=0; j<5; j++)
        {
            for(int l=0; l<5; l++)
            {
                if(cipher[i] == matrix[j][l])
                {
                    index1Row=j;
                    index1Column=l;
                    flag=true;
                }
                if(cipher[i+1] == matrix[j][l])
                {
                    index2Row=j;
                    index2Column=l;
                    flag1=true;
                }
                if(flag && flag1)
                {
                    break;
                }
            }
            if(flag && flag1)
            {
                break;
            }
        }


        if(index1Row==index2Row)
        {
            if(index1Column==0)
            {
                decAry[cIndex]=matrix[index1Row][4];
                cIndex++;
                decAry[cIndex]=matrix[index2Row][index2Column-1];
                cIndex++;
            }
            else if(index2Column==0)
            {
                decAry[cIndex]=matrix[index1Row][index1Column-1];
                cIndex++;
                decAry[cIndex]=matrix[index2Row][4];
                cIndex++;
            }
            else
            {
                decAry[cIndex]=matrix[index1Row][index1Column-1];
                cIndex++;
                decAry[cIndex]=matrix[index2Row][index2Column-1];
                cIndex++;
            }
        }
        else if(index1Column==index2Column)
        {
            if(index1Row==0)
            {
                decAry[cIndex]=matrix[4][index1Column];
                cIndex++;
                decAry[cIndex]=matrix[index2Row-1][index2Column];
                cIndex++;
            }
            else if(index2Row==0)
            {
                decAry[cIndex]=matrix[index1Row-1][index1Column];
                cIndex++;
                decAry[cIndex]=matrix[4][index2Column];
                cIndex++;
            }
            else
            {
                decAry[cIndex]=matrix[index1Row-1][index1Column];
                cIndex++;
                decAry[cIndex]=matrix[index2Row-1][index2Column];
                cIndex++;
            }
        }
        else
        {
            decAry[cIndex]=matrix[index1Row][index2Column];
            cIndex++;
            decAry[cIndex]=matrix[index2Row][index1Column];
            cIndex++;
        }

        flag=flag1=false;
        i++;

    }
    cout<<"Retrived text  : ";
    for(int i=0;i<plen; i++)
    {
        decAry[i]=decAry[i]+32;
        cout<<decAry[i];
    }
    cout<<endl;


    return 0;
}
