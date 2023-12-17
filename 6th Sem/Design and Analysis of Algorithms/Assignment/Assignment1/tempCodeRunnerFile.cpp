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

    bool found =  search(arr, n, key);

    if (found)
        cout << "Key is present." <<endl;
    else
        cout << "Key is not present." <<endl;

    time(&end);

    double time_taken = double(end - start);
    cout << "Time taken by program is : " << fixed
        << time_taken << setprecision(2);
    cout << " sec " << endl;
    return 0;
}