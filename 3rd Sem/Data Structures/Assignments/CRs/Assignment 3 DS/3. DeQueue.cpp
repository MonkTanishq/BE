#include <bits/stdc++.h>
using namespace std;
#define size 10
int deQueue[size], front=-1, rear=0;
//Inserting element at front end
void InsFront(int element){
    if((front==0 && rear==size-1) || front==rear+1) {
        cout << "The queue is full\n";
    }
    else{
        if(front==-1) {
            front=0;
            rear=0;
        }
        else if(front==0){
            front=size-1;
        }
        else{
            front--;
        }
        deQueue[front]=element;
    }   
}
//Inserting element at rear end
void InsRear(int element){
     if((front==0 && rear==size-1) || front==rear+1) {
        cout << "The queue is full\n";
    }
    else{
        if(front==-1){
            front=0;
            rear=0;
        }
        else if(rear==size-1) rear=0;
        else{
            rear++;
        }
        deQueue[rear]=element;
    }
}
//Deleting element at front end
void DelFront(){
    if(front==-1){
        cout << "The queue is empty\n";
    }
    else{
        if (front == rear) {
            front = -1;
            rear = -1;
        }
        else if(front==size-1) {
            front=0;
        }
        else{
            front++;
        }
    }
}
//Deleting element at rear end
void DelRear(){
    if(front==-1){
        cout << "The queue is empty\n";
    }
    else{
        if (front == rear) {
            front = -1;
            rear = -1;
        }
        else if(rear==0) {
            rear=size-1;
        }
        else{
            rear--;
        }
    }
}
void display(){
    if(front==-1){
        cout << "The queue is empty\n";
    }
    else{
        int i;
        cout << endl << "Front -> " << front;
        cout << endl << "Elements -> ";
        for(i = front; i != rear; i= (i+1) % size)
        {
            cout << deQueue[i] << "\t";
        }
        cout << deQueue[i];
        cout << endl << "Rear -> " << rear << endl;
    }
}
int main(){
cout << "Enter choice\n";
    cout << "1.Insert Element from Front End 2.Insert Element from Rear end\n3. Delete element from Front End 4. Delete element from Rear End 5.Display Queue 6.Exit\n";
    int choice;
    do{
        cin >> choice;
        switch(choice){
            case 1: cout << "Enter element to be inserted: ";
                    int element; cin >> element;
                    InsFront(element);
                    break;
            case 2: cout << "Enter element to be inserted: ";
                    cin >> element;
                    InsRear(element);
                    break;
            case 3: DelFront();
                    break;
            case 4: DelRear();
                    break;
            case 5: display();
                    break;
            case 6: exit(0);
            default: cout << "Enter a valid choice\n";
        }
        cout << "Enter your choice: ";
    }while(choice!=6);
return 0;
}