#include <iostream>
using namespace std;

int returnIndex(int a[], int x, int length)
{
    int count = 0;
    for (int i = 0; i < length; i++)
    {
        if (a[i] == x)
        {
            return i;
            count = 0;
            break;
        }
        else
        {
            count++;
        }
    }
    if (count != 0)
    {
        return -1;
    }
}

int store(int a[], int index, int value, int length)
{
    a[index] = value;
    for (int i = 0; i < length; i++)
    {
        cout << a[i] << " ";
    }
}

int enter(int a[], int index, int value, int length)
{

    int size = length + 1;
    int b[size];
    for (int i = 0; i < size; i++)
    {
        if (i < index)
        {
            b[i] = a[i];
        }
        if (i == index)
        {
            b[i] = value;
        }
        if (i > index)
        {
            b[i] = a[i - 1];
        }
    }

    for (int j = 0; j < size; j++)
    {
        cout << b[j] << " ";
    }
}

int remove(int a[], int index, int length)
{
    int size = length - 1;
    int b[size];
    for (int i = 0; i < length; i++)
    {
        if (i < index)
        {
            b[i] = a[i];
        }
        if (i > index)
        {
            b[i - 1] = a[i];
        }
    }

    for (int j = 0; j < size; j++)
    {
        cout << b[j] << " ";
    }
}

int main()
{
    int array[6] = {11, 22, 33, 44, 55, 66};
    for (int i = 0; i < 6; i++)
    {
        cout << array[i] << " ";
    }
    cout << endl;
    int length = sizeof(array) / sizeof(array[0]);
    cout << "length  of entered list is: " << length << endl;
    cout << "the index of enterd element is: " << returnIndex(array, 55, length) << endl;
    cout << "the list after storing is: ";
    store(array, 2, 77, length);
    cout << endl;
    cout << "the list after insertion is: ";
    enter(array, 2, 88, length);
    cout << endl;
    cout << "the list after deletion is: ";
    remove(array, 3, length);
}