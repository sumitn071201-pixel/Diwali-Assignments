#include <iostream>
using namespace std;
double add(double a, double b){
    return a + b;
}

int main(){

    double a, b;
    cout << "Enter first number" << endl;
    if (!(cin>> a)){
        cin.clear();
        char ch;
        cin >> ch;
        a=static_cast<double>(ch);
        cout<<"You did not enter a number. Using ASCII value of"<<ch<<"="<<a<<endl;
    }
    cout << "Enter second number" << endl;
   if (!(cin>> b)){
        cin.clear();
        char ch2;
        cin >> ch2;
        b=static_cast<double>(ch2);
        cout<<"You did not enter a number. Using ASCII value of"<<ch2<<"="<<b<<endl;
    
   }
   cout << "The sum is: " << add(a, b) << endl;
   return 0;
}
