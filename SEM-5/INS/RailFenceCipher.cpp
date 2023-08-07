#include<iostream>
#include<string.h>
using namespace std;

void encrypt(char plainText[], int key)
{
    int msgLength = strlen(plainText);
    cout<<msgLength;
    char railFence[key][msgLength];
    int i, j, k = 0;

    for(i = 0; i < key; i++)
    {
        for(j = 0; j < 3; j++)
        {
            railFence[i][j] = plaintext[k];
        }
    }
cout<<railFence[][];
}

int main()
{
    char plainText[25];
    char cipherText[25];
    int key;

    cout<<"---Rail-Fence Cipher---\n\n";
    cout<<"Enter Key (Depth) : ";
    cin>>key;

    cout<<"\n\nEnter plain text : ";
    cin>>plainText;

    encrypt(plainText,key);

    int div;
    div = plainText % key;
    if(div != 0)
    {
        div = div + 1;
    }

}
