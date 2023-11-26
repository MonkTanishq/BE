#include <bits/stdc++.h>
using namespace std;
#define size 10
int Queue[size];
int front=-1,rear=-1;
void isEmpty(){
    if(front==rear) cout << "The queue is empty\n";
    else cout << "the queue is not empty\n";
}
void FrontDisplay(){
    if(front==-1)cout << "The queue is empty\n";
    else cout << Queue[front] << endl;
}
void AddElement(int element){
    if(rear==size-1) cout << "The queue is full\n";
    else {
      if(front == -1)
	  front = 0;
      rear++;
      Queue[rear] = element;
      cout << "Element inserted\n";
    }
}
void DelElement(){
    if(front==rear) cout << "The queue is empty\n";
    else{
      front++;
      if(front == rear)
	  front = rear = -1;
      cout << "Element deleted\n";
    }
}
void display(){
    if(rear == -1)
      cout << "Queue is Empty\n";
   else{
      int i;
      for(i=front; i<=rear; i++)
	  cout << Queue[i] << " ";
   }
   cout << endl;
}
int main(){
cout << "Enter your choice\n";
cout << "1.Check for emptiness 2.Insert Element 3.Delete Element 4.Display Top Element 5.Display Queue 6.EXIT\n";
int choice; 
do{
    cin >> choice;
    switch(choice){
        case 1: isEmpty();
                break;
        case 2: cout << "Enter the element to be inserted: ";
                int element; cin >> element;
                AddElement(element);
                break;
        case 3: DelElement();
                break;
        case 4: FrontDisplay();
                break;
        case 5: display();
                break;
        case 6: exit(0);
        default: cout << "Enter a valid choice\n";
    }
    cout << "Enter yoour choice: ";
}while(choice!=6);
return 0;
}