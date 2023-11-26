#include <bits/stdc++.h>
using namespace std;

class PQueue
{
    int *array;
    int capacity, terms;

public:
    PQueue(int capacity)
    {
        this->capacity = capacity + 1;
        array = new int[this->capacity];
        terms = 0;
    }
    void Enqueue(int data)
    {
        if (terms == capacity - 1)
        {
            cout << "Capacity reached!\n";
            throw "Capacity reached";
            return;
        }
        array[++terms] = data;
    }

    void Dequeue()
    {
        if (terms == 0)
        {
            cout << "Queue is empty\n";
            return;
        }
        int max = -1, mark;
        for (int i = 1; i <= terms; i++)
        {
            if (array[i] > max)
            {
                max = array[i];
                mark = i;
            }
        }
        for (int i = mark; i < terms; i++)
        {
            array[i] = array[i + 1];
        }
        terms--;
    }

    void display()
    {
        for (int i = 1; i <= terms; i++)
        {
            cout << array[i] << " ";
        }
        cout << endl;
    }
};

int main()
{
    cout << "Enter the size of the queue\n";
    int size;
    cin >> size;
    PQueue q(size);
    char key = 'c';
    while (key != 's')
    {

        cout << "Press 'i' to insert elements, 'd' to delete element, 's' to terminate the program\n";

        cin >> key;
        switch (key)
        {
        case 'i':
            cout << "Enter the elements in queue, press -1 to stop\n";
            int k;
            do
            {
                cin >> k;
                if (k != -1)
                {
                    q.Enqueue(k);
                }

            } while (k != -1);
            cout << "Entered queue is:\n";
            q.display();

            break;
        case 'd':
            q.Dequeue();
            cout << "queue after deletion :\n";
            q.display();
            break;

        case 's':
            break;
        default:
            cout << "Enter a appropriate key!\n";
            break;
        }
    }
    return 0;
}