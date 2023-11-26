//Magic Square
#include <bits/stdc++.h>
using namespace std;
int main(){
int n;
cout << "Enter the number of which magic square is to be created: ";
cin >> n;
if(n%2==0) cout << "INPUT ERROR";
else {
    cout << "The magic sqaure is \n";
    int a[n][n];
for(int i=0; i<n; i++){
    for(int j=0; j<n; j++){
        a[i][j]=0;
    }
}
a[0][(n-1)/2]=1;
int key=2, i=0, j=(n-1)/2;
while(key <= (n*n)){
    int k=(i-1)%n, l=(j-1)%n;
    if(k<0) k=n-1;
    if(k>n-1)k=0;
    if(l<0) l=n-1;
    if(l>n-1) l=0;
    if(a[k][l]!=0){
        i=(i+1)%n;
    }
    else{
        i=k;
        j=l;
    }
    a[i][j]=key;
    key++;
}
for(int i=0; i<n; i++){
    for(int j=0; j<n; j++){
        cout << a[i][j] << " ";
    }
    cout << endl;
}
}
return 0;
}