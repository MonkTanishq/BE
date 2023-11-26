#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <stdbool.h>
#define MAX 6

int intArray[MAX];
int itemCount = 0;

int peek()
{
    return intArray[itemCount - 1];
}

bool isEmpty()
{
    return itemCount == 0;
}

bool isFull()
{
    return itemCount == MAX;
}

int size()
{
    return itemCount;
}

void enque(int data)
{
    int i = 0;

    if (!isFull())
    {
        if (itemCount == 0)
        {
            intArray[itemCount++] = data;
        }
        else
        {
            for (i = itemCount - 1; i >= 0; i--)
            {
                if (data > intArray[i])
                {
                    intArray[i + 1] = intArray[i];
                }
                else
                {
                    break;
                }
            }

            intArray[i + 1] = data;
            itemCount++;
        }
    }
}

int dequeue()
{
    return intArray[--itemCount];
}

int main()
{
    enque(3);
    enque(5);
    enque(9);
    enque(1);
    enque(12);

    enque(15);
    if (isFull())
    {
        printf("Queue is full!\n");
    }

    int num = dequeue();
    printf("Element removed: %d\n", num);
    enque(16);
    enque(17);
    enque(18);

    printf("Element at front: %d\n", peek());

    printf("index : 5 4 3 2  1  0\n");
    printf("Queue:  ");

    while (!isEmpty())
    {
        int n = dequeue();
        printf("%d ", n);
    }
}