#include <iostream>
using namespace std;

class Maxheap
{
    int *array;
    int capacity;
    int terms;

public:
    Maxheap(int capacity)
    {
        this->capacity = capacity + 1;
        array = new int[capacity];
        terms = 0;
    }

    void Insert(int data)
    {
        if (terms==capacity-1)
        {
           cout<<" Tree is full\n";
           throw " Tree is full";
        }
        
        int current = ++terms;

        while (current != 1 && array[(current / 2)] < data)
        {
            array[current] = array[current / 2];
            current = current / 2;
        }

        array[current] = data;
      
    }

    void Delete(){
        if(terms==0){
        cout<<" tree empty \n";
        return ;
        }
        int current = 1;
        int child = 2;
        int LTerm = array[terms];
        terms--;
        while (child<=terms)
        {
            if (array[child]<array[child+1])
            {
                child++;
            }
          if (LTerm>array[child])
          {
             break;
          }
           else{
               array[current]=array[child];
               current = child;
               child = child*2;
           }
            
        }
        cout<<current<<endl;
        array[current] = LTerm;
       
    }
    
   void Linear(){
       for (int i = 1; i < terms+1; i++)
       {
           cout<<array[i]<<" ";
       }
       cout<<endl;
   }
};


int main(){
    cout<<"Enter the size of the queue:\n";
    int size;
    cin>>size;
    Maxheap h(size);
    char key='c';

    while (key!='s')
    {
       cout<<"Press 'I' to start inserting elements in Queue, 'D' to delete, 'P' to print, 's' to stop\n";
       cin>>key;

       switch (key)
       {
       case 'I':
           cout<<"Start inserting the elements in the queue, press -1 to stop\n";
           int k;
           do
           {
               cin>>k;
               if (k!=-1)
               {
                  h.Insert(k);
               }
               
           } while (k!=-1);
           
           break;
       case 'D':
       h.Delete();
       break;
       case 'P':
       h.Linear();
       break;
       case 's':
       break;
       default:
       cout<<"Enter a appropriate key!\n";
           break;
       } 
    }
    return 0;
}