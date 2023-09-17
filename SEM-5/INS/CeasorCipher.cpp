#include<iostream>
using namespace std;

char cipherAry[20];

void plainTextToCipherTextCeasorCipher(string plainText,int key)
{
    int cipher,num;

    for(int i=0; plainText[i]!=NULL; i++)
    {
        if(plainText[i]>=65 && plainText[i]<=90)
        {
            num = plainText[i]-65;
        }
        else if(plainText[i]>=97 && plainText[i]<=122)
        {
            num = plainText[i]-97;
        }

        cipher =(num + key)%26;
        cipherAry[i]=cipher+65;
        cout<<cipherAry[i];
    }

}

void cipherTextToPlainTextCeasorCipher(int key)
{
    int cipher,num;
    char plainText[20];

    for(int i=0; cipherAry[i]!=NULL; i++)
    {
        if(cipherAry[i]>=65 && cipherAry[i]<=90)
        {
            num = cipherAry[i]-65;
        }
        else if(cipherAry[i]>=97 && cipherAry[i]<=122)
        {
            num = cipherAry[i]-97;
        }

        cipher =(num - key)%26;
        plainText[i]=cipher+97;
        cout<<plainText[i];
    }

}

int main()
{

    string plainText,cipherText;
    int key =0;


    cout<<"Enter plaintext : ";
    cin>>plainText;

    cout<<"Enter key : ";
    cin>>key;

    cout<<"\n\nPlaintext to Ciphertext"<<endl<<endl;
    cout<<"Plain text  : "<<plainText<<endl;
    cout<<"Key         : "<<key<<endl;
    cout<<"Cipher text : ";
    plainTextToCipherTextCeasorCipher(plainText,key);
    cout<<endl;


    cout<<"\n\nCiphertext to Plaintext"<<endl<<endl;
    cout<<"Cipher text  : ";
    plainTextToCipherTextCeasorCipher(plainText,key);
    cout<<endl;
    cout<<"Key          : "<<key<<endl;
    cout<<"Plain text   : ";
    cipherTextToPlainTextCeasorCipher(key);
    cout<<endl;



    return 0;
}
