//Merging sorted array
#include<bits/stdc++.h>
using namespace std;
int main()
{
    int m,n;
    cout<<"Enter number of elements in array 1 and 2: ";
    cin>>m>>n;
    cout<<"Enter terms of 1st array: ";
    int a[m];
    for(int i=0; i<m; i++)
        cin>>a[i];
    cout<<"Enter terms of 2nd array: ";
    int b[n],c[m+n];
    for(int i=0;i<n;i++)
        cin>>b[i];
    int p=0,q=0,r=0;
    while(p<m && q<n)
    {
        if(a[p]==b[q])
        {
            c[r]=a[p];
            c[r+1]=b[q];
            p++;
            q++;
            r+=2;
        }
        else if(a[p]>b[q])
        {
            c[r]=b[q];
            r++;
            q++;
        }
        else
        {
            c[r]=a[p];
            p++;
            r++;
        }
    }
    while(p<m)
    {
        c[r]=a[p];
        r++;
        p++;
    }
    while(q<n)
    {
        c[r]=b[q];
        q++;
        r++;
    }
    cout<<"Merged array: ";
    for(int i=0;i<m+n;i++)
    {
        cout<<c[i]<<" ";
    }
    return 0;
}
