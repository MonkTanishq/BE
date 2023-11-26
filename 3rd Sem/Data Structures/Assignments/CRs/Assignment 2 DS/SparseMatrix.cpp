#include <bits/stdc++.h>
using namespace std;
int main()
{   int n;
cout << "Enter order of matrix:" ;
    cin >> n;
    int a = 0, b = 0, c, x = n, y = n;
    int arr[x][y];

    cout << "\nEnter elements of matrix:\n";
    for (int i = 0; i < x; i++)
    {
        for (int j = 0; j < y; j++)
        {
            cout << "\narr[" << i << "][" << j << "]=  ";
            cin >> arr[i][j];
        }
    }

    int sparse_matrix[x * y][n];
    for (int i = 0; i < x; i++)
    {
        for (int j = 0; j < y; j++)
        {
            if (arr[i][j] > 0)
            {
                sparse_matrix[a][0] = i;

                sparse_matrix[a][1] = j;

                sparse_matrix[a][2] = arr[i][j];

                a++;
            }
        }
    }

    cout << " sparse matrix:" << endl;
    for (int i = 0; i < a; i++)
    {

        cout << sparse_matrix[i][0] << " ";

        cout << sparse_matrix[i][1] << " ";

        cout << sparse_matrix[i][2] << " ";
        cout << endl;
    }

    cout << " transposed matrix:" << endl;
    for (int i = 0; i < a; i++)
    {

        cout << sparse_matrix[i][1] << " ";

        cout << sparse_matrix[i][0] << " ";

        cout << sparse_matrix[i][2] << " ";
        cout << endl;
    }
}