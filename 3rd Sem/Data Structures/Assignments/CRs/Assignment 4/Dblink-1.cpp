#include <iostream>
using namespace std;

class node
{
    friend class Dblist;
    node *next;
    node *prev;
    int data;

public:
    node(int data, node *next = NULL, node *prev = NULL)
    {
        this->data = data;
        this->next = next;
        this->prev = prev;
    }
};
class Dblist
{
    node *first;
    node* last;
    int nodes;

public:
    Dblist()
    {
        first = NULL;
        last = NULL;
        nodes= 0;
    }
    void insertFront(int k)
    {
        if (first == NULL)
        {
            first = new node(k);
            last= first;
        }
        else
        {
            node *n = new node(k, first);
            first->prev = n;
            first = n;
        }
        nodes++;
    }
    void insertEnd(int k){
        if(first==NULL)
        insertFront(k);

        else
        {
            

           node* n = new node(k,NULL,last);
           last->next = n;
           last= n;
        }
        nodes++;
    }

    void insertAt(int index, int k)
    {
       node* temp;
       int count;
       if (index==1)
       {
           insertFront(k);
           return;
       }
       
     else
     {
           int count = 1;
           temp=first;
       while (temp->next!=NULL&&count<index)
       {
           count++;
          temp=temp->next;
         
       }
     }
     

       node* n = new node(k,temp,temp->prev);
       temp->prev->next = n;
       temp->prev = n;
       nodes++;
    }
    void deleteAt(int index)
    {
        if (index==1)
        {
           node* temp = first;
           temp->next->prev = NULL;
           first = temp->next;
           delete temp;
        }
        
         node* temp = first;
       int count = 1;
       while (temp!=NULL&&count<=index)
       {
          temp=temp->next;
          count++;
       }
      temp->prev->next=temp->next;
      temp->next->prev=temp->prev;

      delete temp;
      nodes--;

    }

    void readForward(){
        node* temp = first;
        while (temp!=NULL)
        {
            cout<<temp->data<<" ";
            temp=temp->next;
        }
        
    }
    void readBackward(){
        node* temp = last;
        while (temp!=NULL)
        {
           cout<<temp->data<<" ";
           temp = temp->prev;
        }
        
    }
    
    
};

int main(){
    Dblist list;

    cout<<"Here I have pre added some elements to list before taking input:\n";
    for (int i = 10; i < 21 ; i++)
    {
        list.insertEnd(i);
    }
    list.readForward();

    cout<<"\n Now enter a element which will be added to front of list.\n";
    int key;
    cin>>key;
    list.insertFront(key);

    cout<<"Enter a element which will be added to end of the list :\n";
    cin>>key;
    list.insertEnd(key);

    cout<<"Now enter an index then after the element which is to be inserted at that index: \n";
    int index;
    cin>>index>>key;
    list.insertAt(index,key);

    cout<<"list after above modifications is:\n";
    list.readForward();
    
   
   
}