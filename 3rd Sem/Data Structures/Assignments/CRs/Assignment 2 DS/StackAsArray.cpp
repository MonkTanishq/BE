#include <iostream>
using namespace std;
int stack[150], n=150, top=-1;
void enter(int value) {
   if(top>=n-1)
   cout<<"Stack is full"<<endl;
   else {
      top++;
      stack[top]=value;
   }
}
void remove() {
   if(top<=-1)
   cout<<"Stack is empty"<<endl;
   else {
      cout<<"The removed element is "<< stack[top] <<endl;
      top--;
   }
}
void display() {
   if(top>=0) {
      cout<<"Stack elements are:";
      for(int i=top; i>=0; i--)
      cout<<stack[i]<<" ";
      cout<<endl;
   } else
   cout<<"Stack is empty\n";
}
int main() {
   int choice, value;
   cout<<"1) Enter in stack"<<endl;
   cout<<"2) Remove from stack"<<endl;
   cout<<"3) Display stack"<<endl;
   cout<<"4) Exit"<<endl;
   do {
      cout<<"Enter choice: "<<endl;
      cin>>choice;
      switch(choice) {
         case 1: {
            cout<<"Enter value to be pushed:"<<endl;
            cin>>value;
            enter(value);
            break;
         }
         case 2: {
            remove();
            break;
         }
         case 3: {
            display();
            break;
         }
         case 4: {
            cout<<"Exit"<<endl;
            break;
         }
         default: {
            cout<<"Invalid Choice"<<endl;
         }
      }
   }while(choice!=4);
   return 0;
}