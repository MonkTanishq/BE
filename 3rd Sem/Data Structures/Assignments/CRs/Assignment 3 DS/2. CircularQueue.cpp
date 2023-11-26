#include <bits/stdc++.h>
using namespace std;
#define Size 10
int Queue[Size], front=-1, rear=-1;
void ADDQ(int element){
    if((front==0 && rear==Size-1) || front==rear+1) {
        cout << "The queue is full\n";
    }
    else{
        if (front == -1) front = 0;
        rear = (rear + 1) % Size;
        Queue[rear] = element;
        cout << "Element inserted\n";
    }
}
int DELETEQ(){
    if(front==-1) {
        cout << "The queue is empty\n";
        return -1;
    }
    else{
        int element;
        element = Queue[front];
        if (front == rear) {
            front = -1;
            rear = -1;
        }
        else if(front==Size-1)
            front=0;
        else
            front = (front + 1) % Size;
        cout << "Element deleted\n";
        return element;
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
        for(i = front; i != rear; i= (i+1) % Size)
        {
            cout << Queue[i] << "\t";
        }
        cout << Queue[i];
        cout << endl << "Rear -> " << rear << endl;
    }
}
int main(){
    cout << "Enter choice\n";
    cout << "1.Insert Element 2.Delete Element 3.Display Queue 4.Exit\n";
    int choice;
    do{
        cin >> choice;
        switch(choice){
            case 1: cout << "Enter element to be inserted: ";
                    int element; cin >> element;
                    ADDQ(element);
                    break;
            case 2: cout << "Enter element to be deleted: ";
                    DELETEQ();
                    break;
            case 3: display();
                    break;
            case 4: exit(0);
            default: cout << "Enter a valid choice\n";
        }
        cout << "Enter your choice: ";
    }while(choice!=4);
return 0;
}
 
