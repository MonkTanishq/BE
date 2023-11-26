#include <bits/stdc++.h>
using namespace std;

class CBT
{
    int capacity;
    int terms;
   
   int *array;

public:
    CBT(int capacity = 0)
    {
        this->capacity = capacity + 1;
        array = new int[capacity];
        terms = 0;
        array[0]=-1;
    }

    void Add(int data)
    {
        if (terms == capacity - 1)
        {
            cout << "Capacity is reached\n";
            return;
        }
        else
        {
            array[++terms] = data;
        }
    }

    void DELETE()
    {
        if (terms == 0)
        {
            cout << "Tree is empty\n";
        }
        else
        {

            terms--;
        }
    }

    int PARENT(int index)
    {
        if (index<1||index / 2 < 1)
        {
           return -1;
        }
        else
        {
           return array[index/2];
        }
    }

    int LCHILD(int index)
    {
        if (index<1||2*index>capacity-1)
        {
           
            return -1;
        }
        else
        {
           return array[2*index];
        }
        
    }
     int RCHILD(int index)
     {
         if (index<1||2*index+1>capacity-1)
         {
             return -1;
         }
         else
         {
             return array[2*index+1];
         }
         
     }
     void display(){
       for (int i = 1; i < capacity; i++)
       {
        cout<<array[i]<<" ";
       
       }
       cout<<terms;
     }
   
   void INORDER(){
      stack<int> st;
     
      int current = 1;
      while (1)
      {
         while (current<capacity)
         {
             st.push(current);
             current=current*2;
         }
         if (st.empty())
         {
             return;
         }
         
         current=st.top();
         st.pop();
         cout<<array[current]<<" ";
         current = 2*current + 1;

         
         
      }
      
   }

};



int main(){

   cout<<"Enter the number of elements in the tree\n";
   int cap;
   cin>>cap;
   CBT tree(cap);

   cout<<"Enter the elements in binary tree following the linear order\n";
   cout<<"Press -1 to stop\n";
   int key;
   do
   {
       cin>>key;
       if(key!=-1)
       tree.Add(key);
   } while (key!=-1);
   
   
}