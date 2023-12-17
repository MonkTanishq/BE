#include <bits/stdc++.h>
using namespace std;

void insertionSort(int n, int arr[]){
    for(int i=1; i<n; i++)
    {   
        int temp = arr[i];
        int j = i-1;
        for(; j>=0; j--)
        {
            if(arr[j] > temp)
            {
                //shift
                arr[j+1] = arr[j];
            }
            else{
                break;
            }
        }

        arr[j+1] = temp;
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

    insertionSort(n, arr);
    for(int i=0; i<n; i++)
    {
        cout<<arr[i]<<" ";
    }cout<<endl;

    time(&end);

    double time_taken = double(end - start);
    cout << "Time taken by program is : "
        << time_taken << setprecision(2);
    cout << " sec " << endl;
    return 0;
}