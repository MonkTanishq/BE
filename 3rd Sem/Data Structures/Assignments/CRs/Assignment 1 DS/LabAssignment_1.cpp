//Binary search
#include <bits/stdc++.h>
using namespace std;
int main(){
int n, x;
cout << "Enter the number of digits in array: ";
cin >> n ;
cout << "Enter the digit to be found: ";
cin >> x;
int a[n];
cout << "Enter the elements of array: ";
for(int i=0; i<n; i++){
    cin >> a[i];
}
int lower=0, upper=n-1, mid, b=0;
while(lower<=upper){
    mid=ceil((lower+upper)/2);
    if(x>a[mid]) lower=mid+1;
    else if(x<a[mid]) upper=mid-1;
    else {b=1; break;}
}
if(b==0) cout << "NOT FOUND!";
else cout <<"The digit is at position " <<  mid+1;;
return 0;
}