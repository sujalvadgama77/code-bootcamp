#include<iostream>
using namespace std;

int main()
{
    char plaintext[100], key[100], ciphertext[100];
    int plaintext_count = 0, key_count = 0, k = 1, row_count = 0, p = 0, index = 0;

    cout<<"-----Coloumn Transposition Cipher-----";
    cout<<"\n\nEnter PlainText (Without Space) : ";
    cin>>plaintext;

    cout<<"Enter Key : ";
    cin>>key;

    for(int i = 0; plaintext[i] != NULL; i++)
    {
        if(plaintext[i] >= 'A' && plaintext[i] <= 'Z')
        {
            plaintext[i] = plaintext[i] + 32;
        }
        plaintext_count++;
    }

    for(int i = 0; key[i] != NULL; i++)
    {
        if(key[i] >= 'A' && key[i] <= 'Z')
        {
            key[i] = key[i] + 32;
        }
        key_count++;
    }
    char cipher[key_count][100];


    cout<<"\n\n.....ENCRYPTION.....\n";
    cout<<"Plain Text : ";
    for(int i = 0; i < plaintext_count; i++)
    {
        cout<<plaintext[i];
    }
    cout<<"\nKey : ";
    for(int i = 0; i < key_count; i++)
    {
        cout<<key[i];
    }

    for(int i = 0; i < key_count; i++)
    {
        cipher[0][i] = key[i];
    }
    int r;
    for(r = 0; p < plaintext_count; r++)
    {
        cipher[k][r] = plaintext[p] - 32;
        p++;
        if(r == key_count - 1)
        {
            k++;
            r = -1;
        }
    }

    for(int i = r; r != 0 && i < key_count; i++)
    {
        cipher[k][i] = 'X';
    }

    cout<<"\n\nTable for encryption : \n-----------------------\n";
    if(r == 0) k--;
    for(int i = 0; i <= k; i++)
    {
        for(int j = 0; j < key_count; j++)
        {
            cout<<cipher[i][j]<<" ";
        }
        cout<<"\n";
    }

    for(int i = 48; i <= 57 ; i++)
    {
        for(int j = 0; j < key_count; j++)
        {
            if(cipher[0][j] == i)
            {
                for(int s = 1; s <= k; s++)
                {
                    ciphertext[index] = cipher[s][j];
                    index++;
                }
            }
        }
    }

    cout<<"\n\nCipher Text : ";
    for(int i = 0; i < index; i++)
    {
        cout<<ciphertext[i];
    }

    cout<<"\n\n";

    return 0;
}
