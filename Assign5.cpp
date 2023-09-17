#include<iostream>
using namespace std;
int isPlindrome(int);
int main()
{
    int num, result;
        cout<<"Enter a Number: ";
        cin>>num;

    result = isPlindrome(num);
        if(result == num)
            cout<<num<<" is a Palindrome Number";
        else
            cout<<num<<" is not a Palindrome Number";
        
        return 0;
}

int isPlindrome(int num)
{
    int lastDigit, result=0, temp = num;

    while(temp>0)
    {
        lastDigit = temp % 10 ;
        result = result * 10 + lastDigit;
        temp = temp / 10; 
    }
       
    return result;
}