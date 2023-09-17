#include<iostream>
using namespace std;
int reverse(int);
int main()
{
    int num, reverseNum;
        cout<<"Enter a Number: ";
        cin>>num;
        reverseNum = reverse(num);
        cout<<reverseNum;
        return 0;
}

int reverse(int num)
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