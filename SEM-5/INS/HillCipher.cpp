#include<iostream>
#include<cmath>

using namespace std;

float e[3][1], d[3][1], a[3][3], b[3][3], ms[3][1], m[3][3];
void getKey() {
   int i, j;
   char me[3];
   cout<<"----- Hill Cipher -----";
   cout<<"\n\nEnter 3x3 matrix for key (should have inverse):\n";
   for(i = 0; i < 3; i++)
   for(j = 0; j < 3; j++) {
      cin>>a[i][j];
      m[i][j] = a[i][j];
   }
   cout<<"\nEnter a string of 3 letter(use A through Z): ";
   cin>>me;
   for(i = 0; i < 3; i++)
   ms[i][0] = me[i] - 65;
}
void encryption() {
   int i, j, k;
   for(i = 0; i < 3; i++)
   for(j = 0; j < 1; j++)
   for(k = 0; k < 3; k++)
   e[i][j] = e[i][j] + a[i][k] * ms[k][j];
   cout<<"\n-> Encrypted Text : ";
   for(i = 0; i < 3; i++)
   cout<<(char)(fmod(e[i][0], 26) + 65);
}
void inverse() {
   int i, j, k;
   float p, q;
   for(i = 0; i < 3; i++)
   for(j = 0; j < 3; j++) {
      if(i == j)
         b[i][j]=1;
      else
         b[i][j]=0;
   }
   for(k = 0; k < 3; k++) {
      for(i = 0; i < 3; i++) {
         p = m[i][k];
         q = m[k][k];
         for(j = 0; j < 3; j++) {
            if(i != k) {
               m[i][j] = m[i][j]*q - p*m[k][j];
               b[i][j] = b[i][j]*q - p*b[k][j];
            }
         }
      }
   }
   for(i = 0; i < 3; i++)
   for(j = 0; j < 3; j++)
   b[i][j] = b[i][j] / m[i][i];
   cout<<"\n\n----- Inverse Matrix -----\n";
   for(i = 0; i < 3; i++) {
      for(j = 0; j < 3; j++)
      cout<<b[i][j]<<" ";
      cout<<"\n";
   }
}
void decryption() {
   int i, j, k;
   inverse();
   for(i = 0; i < 3; i++)
   for(j = 0; j < 1; j++)
   for(k = 0; k < 3; k++)
   d[i][j] = d[i][j] + b[i][k] * e[k][j];
   cout<<"\n-> Decrypted Text : ";
   for(i = 0; i < 3; i++)
   cout<<(char)(fmod(d[i][0], 26) + 65);
   cout<<"\n";
}
int main() {
   getKey();
   encryption();
   decryption();
}
