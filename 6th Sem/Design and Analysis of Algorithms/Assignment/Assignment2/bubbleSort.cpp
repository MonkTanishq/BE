#include <bits/stdc++.h> 
#include<iostream>
using namespace std;
void bubbleSort(int arr[], int n)
{  
    //For round 1 to n-1
   for(int i = 1; i < n; i++)
   {
       bool swapped = false;
       for(int j = 0; j<n-i; j++)
       {    
           //process element till n-i th index
           if(arr[j] > arr[j+1])
           {
               std::swap(arr[j], arr[j+1]);
               swapped = true;
           }
       }

       if(swapped == false)
       //already sorted
        break;
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

    bubbleSort(arr, n);
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