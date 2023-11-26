#include <iostream>
using namespace std;
template <class T> class CList;

template<class T> class node{
    friend class CList<T>;
    T data;
    node<T>* next;
    public:
    node(T data, node<T>* next=NULL){
        this->data = data;
        this->next = next;
    
    }

};

template<class T> class CList{
node<T>* first;

public:
CList(){
    first=NULL;
}

void insert_Front(T dat){
    if (first==NULL)
    {
      first = new node<T>(dat);
      node<T>* temp = first;
      first->next = temp;
      return;

    }
    node<T>* temp= first;

    while (temp->next!=first)
    {
      temp=temp->next;
    }
    node<T>* n = new node<T>(dat,temp->next);
    temp->next=n;
    first = n;
}

int length(){
    if (first==NULL)
    {
        return 0;
    }
    int len=0;
    node<T>* temp=first;
    do
    {
        temp=temp->next;
        len++;
    } while (temp!=first);
    
    return len;

}
void display(){
    node<T>* temp=first;
    do
    {
       cout<<temp->data;
       if (temp->next!=first)
       {
          cout<<"->";
       }
       else if (temp->next==first)
       {
           cout<<"->first";
       }
       
       temp=temp->next;
    } while (temp!=first);
    
  
}


};

int main(){
    CList<int> list;
    cout<<"Enter elements into circular list. It is done by insert at front mode\n, press -1 to stop\n";
   int key;

   do
   {
      cin>>key;
      if (key!=-1)
      {
        list.insert_Front(key);
      }
      
   } while (key!=-1);
   
   cout<<"List is : \n";
   list.display();

   cout<<"\n length of list: "<<list.length()<<endl;
   
}