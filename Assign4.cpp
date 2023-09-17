#include<iostream>
using namespace std;
bool isPrime(int);
int main()
{
    int num1, num2;
        cout<<"Enter a range:  ";
        cin>>num1>>num2;
        
    for(int i=num1; i<= num2 ;  i++)
    {
        if(isPrime(i))
            cout<< i<< " ";
        
    }
        return 0;
}

bool isPrime(int num1)
{

        for(int j = 2 ;j<= num1/2 ;j++)
        {
             if(num1 % j == 0)
             {
                 return false;
             }
        }
                return true;
 }

