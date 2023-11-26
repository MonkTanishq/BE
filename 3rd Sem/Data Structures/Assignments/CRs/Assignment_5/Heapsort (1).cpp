#include <iostream>
using namespace std;
void heapify(int arr[], int n, int key)
{
     int current=key;
       int data = arr[key];
       while (current!= 1&&arr[current/2]<arr[key])
       {
          arr[current]=arr[current/2];
          current = current/2;
       }
       arr[current]=data;

}

void adjust(int arr[], int n, int i)
{
int root = arr[1];
       int Lterm = arr[(n+1)-i];
       int current = 1;
       int child = 2;
       while (child<(n+1)-i)
       {
          if (arr[child]<arr[child+1])
          {
             child = child+1;
          }
          if (Lterm>arr[child])
          {
             break;
          }
          else
          {
              arr[current]=arr[child];
              current = child;
              child*=2;
          }
          
       }
       arr[current]=Lterm;
       arr[(n+1)-i]=root;
}

void printArray(int array[], int n){
   for (int i = 1; i < n+1; i++)
   {
      cout<<array[i]<<" ";
   }
   cout<<endl;
}

int main(){
    int n;
    cout<<"Enter the size of array\n";
    cin>>n;

    int array[n+1];
     cout<<"Enter the elements of array\n";
    for (int i = 1; i < n+1; i++)
    {
        cin>>array[i];
    }
    cout<<"Array before heapification\n";
    printArray(array,n);
    cout<<endl;
    for (int i = 1; i < n+1; i++)
    {
      heapify(array,n,i);
    }
    cout<<"Array after heapification\n";
    printArray(array,n);
    cout<<endl;
   
   
   for (int i = 1; i < n; i++)
   {
       adjust(array,n,i);
        
  
   }
   cout<<"Array after adjustement, sorting\n";
    printArray(array,n);
   
    return 0;
    
}