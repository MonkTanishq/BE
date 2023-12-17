#include<bits/stdc++.h>
#include<time.h>
#include<iostream>
using namespace std;

void findMaxMin(int arr[], int low, int high, int &maxval, int &minval)
{
    if(low == high)
    {
        maxval = arr[low];
        minval = arr[low];
    }
    else if(high - low == 1)
    {
        if(arr[low] < arr[high])
        {
            maxval = arr[high];
            minval = arr[low];
        }
        else
        {
            maxval = arr[low];
            minval = arr[high];
        }
    }
    else
    {
        int mid = (low + high) / 2;
        int maxval1, maxval2, minval1, minval2;

        findMaxMin(arr, low, mid, maxval1, minval1);
        findMaxMin(arr, mid+1, high, maxval2, minval2);

        if(maxval1 > maxval2)
            maxval = maxval1;
        else
            maxval = maxval2;

        if(minval1 < minval2)
            minval = minval1;
        else    
            minval = minval2;
    }
}

int main()
{
    time_t start, end;
    time(&start);

    int arr[] = {48,9,20,12,30,37,5,19,36,7};
    int n = sizeof(arr)/sizeof(arr[0]);
    int maxval, minval;
    findMaxMin(arr, 0, n-1, maxval, minval);
    cout<<minval<<endl;
    cout<<maxval<<endl;

    time(&end);

    double time_taken = double(end - start);
    cout << "Time taken by program is : "<<fixed
        << time_taken << setprecision(2);
    cout << " sec " << endl;
    return 0;
}