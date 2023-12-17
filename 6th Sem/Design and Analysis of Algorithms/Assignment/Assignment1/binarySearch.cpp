#include<iostream>
#include<iomanip>
#include<time.h>
using namespace std;

int binarySearch(int arr[], int size, int key)
{
    int start = 0;
    int end = size - 1;
    int mid = start + (end - start) / 2;

    while(start <= end)
    {
        if(arr[mid] == key)
        {
            return mid;
        }

        if(key > arr[mid])
        {
            start = mid + 1;
        }
        else{
            end = mid - 1;
        }
        mid = start + (end - start) / 2;
    }
    return -1;
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

    int key;
    cout << "Enter the element to search for: ";
    cin >> key;

    int result = binarySearch(arr, n, key); 

    if(result == -1)
        cout<<"Element is not present."<<endl;
    else
        cout<<"Element is present on Index: "<<result<<endl;

    time(&end);

    double time_taken = double(end - start);
    cout << "Time taken by program is : " << fixed
        << time_taken << setprecision(5);
    cout << " sec " << endl;

    return 0;
}