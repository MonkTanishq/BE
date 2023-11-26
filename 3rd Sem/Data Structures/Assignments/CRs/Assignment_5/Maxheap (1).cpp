#include <bits/stdc++.h>
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
    Maxheap h(6);
    h.Insert(1);
    h.Insert(2);
    h.Insert(3);
    h.Insert(4);
    h.Insert(5);
    h.Insert(6);
    h.Linear();
   
    return 0;

}