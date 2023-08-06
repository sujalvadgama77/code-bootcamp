#include<iostream>
using namespace std;

int main()
{
    char plainText[20],cipherText[20],cipher[26],key[25],smpAry[26],decAry[26];
    int k=0,p=0;
    bool flag;
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
    }

    for(int i=0; key[i]!=NULL; i++)
    {
        if(key[i]>='A' && key[i]<='Z')
        {
            key[i]=key[i]+32;
        }
    }

    for(int i=0; key[i]!=NULL; i++)
    {
        flag=false;
        for(int j=0; cipher[j]!=NULL; j++)
        {
            if((cipher[j]+32)==key[i])
            {
                flag=true;
                break;
            }
        }
        if(!flag)
        {
            cipher[k]=key[i]-32;
            k++;
        }
    }
    for(int i=0; i<26; i++)
    {
        smpAry[i]=65+i;
    }
    cout<<endl<<endl;
    for(int i=0; i<26; i++)
    {
        cout<<smpAry[i]<<" ";
    }
    for(int i=0; i<26; i++)
    {
        flag=false;
        for(int j=0; cipher[j]!=NULL; j++)
        {
            if(cipher[j]==smpAry[i])
            {
                flag=true;
                break;
            }
        }
        if(!flag)
        {
            cipher[k++]=smpAry[i];
        }

    }
    cipher[k]=NULL;

    cout<<endl;
    for(int i=0; cipher[i]!=NULL; i++)
    {
        cout<<cipher[i]<<" ";
    }

    for(int i=0; plainText[i]!=NULL; i++)
    {
        for(int j=0; j<26; j++)
        {
            if((plainText[i]-32)== smpAry[j])
            {
                cipherText[p++]=cipher[j];
            }
        }
    }
    cipherText[p]=NULL;
    p=0;
    for(int i=0; cipherText[i]!=NULL; i++)
    {
        for(int j=0; j<26; j++)
        {
            if(cipherText[i]== cipher[j])
            {
                decAry[p++]=smpAry[j];
            }
        }
    }
    decAry[p]==NULL;
    cout<<"\n\n-----Plaintext to Ciphertext-----"<<endl<<endl;
    cout<<"Plain text  : "<<plainText<<endl;
    cout<<"Key         : "<<key<<endl;
    cout<<"Cipher text : "<<cipherText<<endl;;
    cout<<endl;
    cout<<"\n\n-----Ciphertext to Plaintext-----"<<endl<<endl;
    cout<<"Cipher text    : "<<cipherText<<endl;;
    cout<<"Key            : "<<key<<endl;
    cout<<"Retrived text  : "<<decAry<<endl;
    cout<<endl;
    return 0;
}
