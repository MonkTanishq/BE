//Polynomial Addition
#include <bits/stdc++.h>
using namespace std;
int main(){
int m, n;
cout << "Enter number of terms in polynoimal 1 and 2: ";
cin >> m >> n;
int a[2*m+1], b[2*n+1], c[2*(m+n)+1];
a[0]=m; b[0]=n;
cout << "Enter degree and accompying coeffecients of terms of polynomial 1: ";
for(int i=1; i<=2*m; i++){
    cin >> a[i];
}
cout << "Enter degree and accompying coeffecients of terms of polynomial 2: ";
for(int i=1; i<=2*n; i++){
    cin >> b[i];
}
int p=1, q=1, r=1;
while(p<=2*m && q<=2*n){
    if(a[p]==b[q]) {
        c[r+1]=a[p+1]+b[q+1];
        if(c[r+1]!=0) {
            c[r]=a[p];
            r+=2;
         }
         p+=2; q+=2;
    }
    else if(a[p]<b[q]){
        c[r+1]=b[q+1];
        c[r]=b[q];
        q+=2; r+=2;
    }
    else{
        c[r+1]=a[p+1];
        c[r]=a[p];
        p+=2; r+=2;
    }
}
while(p<=2*m){
    c[r+1]=a[p+1];
    c[r]=a[p];
    r+=2; p+=2;
}
while(q<=2*n){
    c[r+1]=b[q+1];
    c[r]=b[q];
    r+=2; q+=2;
}
c[0]=r/2;
cout << "The polynomial after addition is: ";
for(int i=1, j=0; j<c[0]; i+=2, j++){
    cout << c[i+1] << "x^" << c[i] << " ";
    if(j!=c[0]-1) cout << "+ ";
}
return 0;
}