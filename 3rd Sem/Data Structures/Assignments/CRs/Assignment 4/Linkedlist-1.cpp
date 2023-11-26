#include <bits/stdc++.h>
using namespace std;
template <class T>
class Linkedlist;
template <class T>
class node
{

    friend class Linkedlist<T>;
    T data;
    node *next;

public:
    node(T data = 0, node<T> *n = NULL)
    {
        this->data = data;
        next = n;
    }
};

template <class T>
class Linkedlist
{
    node<T> *first;

public:
    Linkedlist(node<T> *n = NULL)
    {
        first = n;
    }
    void InsertFront(T &dat)
    {
        if (first == NULL)
            first = new node<T>(dat);

        else
        {
            node<T> *n = new node<T>(dat, first);

            first = n;
        }
    }

    void InsertEnd(T &dat)
    {
        if (first == NULL)
            InsertFront(dat);

        else
        {
            node<T> *temp = first;
            while (temp->next != NULL)
            {
                temp = temp->next;
            }
            node<T> *n = new node<T>(dat);
            temp->next = n;
        }
    }

    void InsertAt(int index, T &dat)
    {
        node<T> *temp = first;
        if (index == 1)
        {
            InsertFront(dat);
            return;
        }
        int count = 1;
        while (count != index - 1)
        {
            temp = temp->next;
            count++;
        }
        node<T> *n = new node<T>(dat, temp->next);
        temp->next = n;
    }

    void DeleteAt(int index)
    {
        node<T> *temp = first;

        int count = 1;
        while (count != index - 1)
        {
            temp = temp->next;
            count++;
        }
        node<T> *t = temp->next;
        temp->next = temp->next->next;
        delete t;
    }

    void display()
    {
        node<T> *temp = first;
        while (temp != NULL)
        {
            cout << temp->data;
            if (temp->next != NULL)
            {
                cout << "->";
            }

            temp = temp->next;
        }
    }

    void Invert()
    {
        node<T> *current = first;
        node<T> *prev = 0;
        node<T> *upcoming;

        while (current != NULL)
        {
            upcoming = current->next;
            if (upcoming == NULL)
            {
                first = current;
            }

            current->next = prev;
            prev = current;
            current = upcoming;
        }
    }
    node<T> *concatinate(Linkedlist<T> l)
    {
        if (!first)
        {
            node<T> *newfirst = l.first;
            return newfirst;
        }

        node<T> *temp = first;
        while (temp->next != NULL)
        {
            temp = temp->next;
        }
        temp->next = l.first;
        return first;
    }
};

int main()
{
    cout << "This is the example of an linked list of integer data type.\n";
    cout << "Enter the elements of linked list.\nFor simplicity I have selected insertion at end\n";
    cout << "press -1 when you are done.\n";
    Linkedlist<int> List;
    int element;
    do
    {
        cin >> element;
         if (element != -1)
        List.InsertEnd(element);
    } while (element != -1);
    cout << "Entered linked list is:\n";
    List.display();

    cout << "\n Now lets invert the list. Resulting list after invertion is:\n";
    List.Invert();
    List.display();

    cout << "\n Enter the list to be concatinated with first one. press -1 when done.\n";
    Linkedlist<int> list2;
    do
    {
        cin >> element;
        if (element != -1)
            list2.InsertEnd(element);
    } while (element != -1);
    cout << "Entered list2 is:\n";
    list2.display();

    cout << "\nAfter merging the new list is:\n";
    List.Invert();
    Linkedlist<int> list3 = List.concatinate(list2);
    list3.display();
}