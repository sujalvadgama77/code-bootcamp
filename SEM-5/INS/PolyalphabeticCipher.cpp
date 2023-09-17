#include<iostream>
using namespace std;

void vegenere(){
    int kSize,pSize,cipher,p,k,pTemp,kTemp,choice=0;
    char plainText[30],key[20],cipherText[30];


    cout<<"Enter PlainText : ";
    cin>>plainText;



    cout<<"Enter key : ";
    cin>>key;

    for(pSize=0; plainText[pSize]!=NULL; pSize++);
    for(kSize=0; key[kSize]!=NULL; kSize++);
    pTemp=pSize;
    kTemp=kSize;

    for(int i=0; i<pSize; i++)
    {
        if(plainText[i]>='A' && plainText[i]<='Z')
        {
            plainText[i]=plainText[i]+32;
        }
    }

    for(int i=0; i<kSize; i++)
    {
        if(key[i]>='A' && key[i]<='Z')
        {
            key[i]=key[i]+32;
        }
    }

    if(pSize<kSize)
    {
        for(int i=pSize,ptr=0; i!=kSize; i++)
        {
            plainText[i]=plainText[ptr++];
        }
        pSize=kSize;
    }
    else if(kSize<pSize)
    {
        for(int i=kSize,ptr=0; i!=pSize; i++)
        {
            key[i]=key[ptr++];
        }
        kSize=pSize;
    }

    for(int i=0; i<pSize; i++)
    {
        p=plainText[i]-97;
        k=key[i]-97;
        cipher=(p+k)%26;
        cipherText[i]=cipher+65;
    }



    cout<<"\n\nPlaintext to Ciphertext"<<endl<<endl;
    cout<<"Plain text  : ";
    for(int i=0; i<pTemp; i++)
    {
        cout<<plainText[i];
    }
    cout<<endl;

    cout<<"key         : ";
    for(int i=0; i<kTemp; i++)
    {
        cout<<key[i];
    }
    cout<<endl;

    cout<<"Cipher text : ";
    for(int i=0; i<pSize; i++)
    {
        cout<<cipherText[i];
    }
    cout<<endl<<endl;

    cout<<"\n\nCipherText to Plaintext"<<endl<<endl;
    cout<<"Cipher text : ";
    for(int i=0; i<pSize; i++)
    {
        cout<<cipherText[i];
    }
    cout<<endl;

    cout<<"key         : ";
    for(int i=0; i<kTemp; i++)
    {
        cout<<key[i];
    }
    cout<<endl;

    for(int i=0; i<pSize; i++)
    {
        p=cipherText[i]-65;
        k=key[i]-97;
        cipher=(p-k)%26;
        cipherText[i]=cipher+97;
    }

    cout<<"Plain text  : ";
    for(int i=0; i<pTemp; i++)
    {
        cout<<plainText[i];
    }
    cout<<endl<<endl;
}

void vernum(){

        int kSize,pSize,cipher,p,k,pTemp,kTemp,plainText[30],key[20],cipherText[30];



    cout<<"Enter size of plaintext : ";
    cin>>pSize;
    pTemp=pSize;

    for(int i=0;i<pSize;i++){
        cout<<"Enter bit "<<(i+1)<<" : ";
        cin>>plainText[i];
    }

    cout<<"Enter size of key : ";
    cin>>kSize;
    kTemp=kSize;

    for(int i=0;i<kSize;i++){
        cout<<"Enter bit "<<(i+1)<<" : ";
        cin>>key[i];
    }

     if(pSize<kSize)
    {
        for(int i=pSize,ptr=0; i!=kSize; i++)
        {
            plainText[i]=plainText[ptr++];
        }
        pSize=kSize;
    }
    else if(kSize<pSize)
    {
        for(int i=kSize,ptr=0; i!=pSize; i++)
        {
            key[i]=key[ptr++];
        }
        kSize=pSize;
    }

    for(int i=0; i<pSize; i++)
    {
        cipherText[i]=plainText[i]^key[i];
    }

    cout<<"\n\nPlaintext to Ciphertext"<<endl<<endl;
    cout<<"Plain text  : ";
    for(int i=0; i<pTemp; i++)
    {
        cout<<plainText[i];
    }
    cout<<endl;

    cout<<"key         : ";
    for(int i=0; i<kTemp; i++)
    {
        cout<<key[i];
    }
    cout<<endl;

    cout<<"Cipher text : ";
    for(int i=0; i<pSize; i++)
    {
        cout<<cipherText[i];
    }
    cout<<endl<<endl;

     cout<<"\n\nCipherText to Plaintext"<<endl<<endl;
    cout<<"Cipher text : ";
    for(int i=0; i<pSize; i++)
    {
        cout<<cipherText[i];
    }
    cout<<endl;

    cout<<"key         : ";
    for(int i=0; i<kTemp; i++)
    {
        cout<<key[i];
    }
    cout<<endl;


    for(int i=0; i<pSize; i++)
    {
        cipherText[i]=cipherText[i]^key[i];
    }

    cout<<"Plain text  : ";
    for(int i=0; i<pTemp; i++)
    {
        cout<<plainText[i];
    }
    cout<<endl<<endl;
}

int main(){

    cout<<"1-> vegenere ciphet\n2-> vernum cipher\n";
    int choice;
    cin>>choice;

    if(choice==1){
        vegenere();
    }else if(choice==2){
        vernum();
    }else{
        cout<<"Inavlid choice";
    }

    return 0;
}
