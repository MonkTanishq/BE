#include <iostream>
using namespace std;

class element{
   friend class Queue;
   int data;
   element* next;
   public:
   element(int data, element* next=NULL){
       this->data=data;
       this->next=next;
   }
};

class Queue{
    element* rear;
    element* front;

    public:
    Queue(){
        rear=NULL;
        front=NULL;

    }
    bool isEmpty(){
        return rear==NULL;
    }
    void push(int dat){
        if (isEmpty())
        {
           rear = new element(dat);
           front = rear;
           return;
        }
      element* n = new element(dat);
      rear->next= n;
      rear=n; 
    }
    void pop(){
        if (isEmpty())
        {
            cout<<"Queue is empty!"<<endl;
            return;
        }
    element* remove = front;
    front=front->next;
    delete remove;
    }

    void read(){
        element* temp = front;
        while (temp!=NULL)
        {
          cout<<temp->data;
          if (temp->next!=NULL)
          {
              cout<<"->";
          }
          
          temp=temp->next;
        }
        
    }
};


int main(){
    Queue list;
cout<<"Enter the elements to be pushed into queue, press -1 to stop\n";
int key;
do
{
    cin>>key;
    if (key!=-1)
    {
        list.push(key);
    }
    
} while (key!=-1);
 cout<<"The queue is:\n";
 list.read();

 cout<<"\nNow let's try popping a element.";
  list.pop();
  cout<<"\n now queue: \n";
  list.read();


}