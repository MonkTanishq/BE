#include<bits/stdc++.h>
using namespace std;

int main()
{
    time_t start, end;
    time(&start);

    int n,m,p;
    cin>>n>>m; //Dimension of 1st Array Matrix
    cin>>m>>p; //Dimension of 2nd Array Marix

    int matrix1[n][m];
    int matrix2[m][p];
    int result[n][p];

    //Input Element of 1st Matrix
    for(int i=0; i<n; i++)
    {
        for(int j=0; j<m; j++)
            cin>>matrix1[i][j];
    }

    //Input Element of 2nd Matrix
    for(int i=0; i<m; i++)
    {
        for(int j=0; j<p; j++)
            cin>>matrix2[i][j];
    }

    //Multiplying
    for(int i=0; i<n; i++)
    {
        for(int j=0; j<p; j++)
        {
            result[i][j] = 0;

            for(int k=0; k<m; k++)
                result[i][j] += matrix1[i][k] * matrix2[k][j];
        }
    }

    //Printing the Resultant Matrix
    for(int i=0; i<n; i++)
    {
        for(int j=0; j<p; j++)
        {
            cout<<result[i][j]<<" ";
        }cout<<endl;
    }


    time(&end);

    double time_taken = double(end - start);
    cout << "Time taken by program is : " << fixed
        << time_taken << setprecision(5);
    cout << " sec " << endl;


    return 0;
}