#include <bits/stdc++.h>
using namespace std;
#define size 10
int top1, top2, Stack[size];
void AddElement(int element){
    int choice;
    if(top1==top2-1){
        cout << "Stack is full\n";
    }
    cout << "1.Add element in stack 1 2.Add element in stack 2\n";
    cout << "Enter choice: ";
    cin >> choice;
    if(choice==1)
        Stack[++top1]=element;
    else
        Stack[--top2]=element;
    cout << "Element inserted\n";
}
void DelElement()
{
    int element,choice;
    cout << "1.Delete element from stack 1 2.Delete element from stack 2\n";
    cout << "Enter choice: ";
    cin >> choice;
    if(choice==1){
        if(top1==-1){
            cout << "Stack is empty\n";
        }
        else 
            cout << "Element deleted\n";
        element=Stack[top1];
        Stack[top1--]=0;
        cout << "Element deleted\n";
    }
    else{
        if(top2==size){
            cout << "Stack is empty\n";
        }
        else 
            cout << "Element deleted\n";
        element=Stack[top2];
        Stack[top2++]=0; 
    }
}
void display(){
    if (top1 == -1){
        cout << "Stack one is empty\n";
    }
    else{
        cout << "Elements of stack 1: ";
        for (int i = 0; i <= top1; i++){
            cout << Stack[i] << " ";
        }  
        cout << endl;     
    }
    if (top2 == size){
         cout << "Stack two is empty\n";
    }
    else{
        cout << "Elements of stack 2: ";
        for (int i = size-1; i >= top2; i--){
            cout << Stack[i] << " ";
        }  
        cout << endl;  
    }
}
int main(){
    top1=-1,top2=size;
    cout << "Enter choice\n";
    cout << "1.Insert Element 2.Delete Element 3.Display Stack 4.Exit\n";
    int choice;
    do{
        cin >> choice;
        switch (choice){
            case 1: cout << "Enter element to be inserted: ";
                    int element; cin >> element;
                    AddElement(element);
                    break;
            case 2: DelElement();
                    break;
            case 3: display();
                    break;
            case 4: exit(0);
            default: cout << "Enter valid choice\n";
        }
        cout << "Enter your choice: ";
    }while(choice!=4);
return 0;
}

