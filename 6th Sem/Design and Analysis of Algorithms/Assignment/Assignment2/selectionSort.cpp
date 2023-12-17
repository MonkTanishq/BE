#include <bits/stdc++.h>
#include<iostream>
using namespace std;

void selectionSort(int arr[], int n)
{   
    for(int i = 0; i<n-1; i++)
    {
        int minIndex = i;
        for(int j = i+1; j<n; j++)
        {
            if(arr[j] < arr[minIndex])
            {
                minIndex = j;
            }
        }
        swap(arr[minIndex], arr[i]);
    }
}

int main()
{
     time_t start, end;
    time(&start);

    int n;
    cout<<"Enter the Size of the Array: ";
    cin>>n;
    int arr[n];
    for(int i=0; i<n; i++)
        cin>>arr[i];

    selectionSort(arr, n);
    for(int i=0; i<n; i++)
    {
        cout<<arr[i]<<" ";
    }cout<<endl;

    time(&end);

    double time_taken = double(end - start);
    cout << "Time taken by program is : " << fixed
        << time_taken << setprecision(2);
    cout << " sec " << endl;
    return 0;
}