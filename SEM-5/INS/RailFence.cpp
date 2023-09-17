#include <iostream>
using namespace std;

string encryption(string plain_text , int depth)
{
    int length=plain_text.length();
    string cipher_text="";

    int index=0;
    int main_jump=(depth-1)*2;
    int minus_two_jump = main_jump + 2;
    int alter_jump;

    int k=0;

    for(int level=1 ; level<=depth ; level++)
    {
        k=0;

        //cout<<"level="<<level<<endl;
        index=level-1;
        minus_two_jump-=2;
        alter_jump = main_jump - minus_two_jump;

        while( index <= length-1 )
        {
            cipher_text+=plain_text[index];
            //cout<<"i="<<index<<" ch="<<plain_text[index];

            if(level==1 || level==depth)
            {
                index+=main_jump;
                //cout<<" next i="<<index<< "main_jump="<<main_jump<<endl;
            }
            else
            {
                if(k==0)
                {
                    index+=minus_two_jump;
                    //cout<<" next i="<<index<<" minus_two_jump="<<minus_two_jump<<endl;
                    k=!k;
                }
                else if(k==1)
                {
                    index+=alter_jump;
                    //cout<<" next i="<<index<<" alter_jump="<<alter_jump<<endl;;
                    k=!k;
                }

            }
        }
    }

    return cipher_text;

}



int main()
{
    string plain_text;
    cout<<"------Rail Fence------\n";

    cout<<"Enter Plain-Text(String with No space): ";
    cin>>plain_text;

    int depth;

    cout<<"Enter Depth:(If Depth=1 => Ceipher-Text= Plain-Text): ";
    cin>>depth;

    string ceipher_text=encryption(plain_text , depth);
    cout<<"------Encryption------\n";

    cout<<"Ceipher-Text: "<<ceipher_text<<endl;

    return 0;
}
