#include<iostream>
using namespace std;
bool isPrime(int);
int main()
{
    int num;
        cout<<"Enter a Number: ";
        cin>>num;
        if(isPrime(num))
            cout<<" Prime Number";
        else
            cout<<"Not a Prime no";
        return 0;
}

bool isPrime(int num)
{

    for(int i=2; i<= num/2 ;  i++)
    {
        if(num % i == 0)
        {
             return false;
        }
    }
        return true;

}