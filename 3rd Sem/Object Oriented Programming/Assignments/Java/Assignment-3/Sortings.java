import java.util.*;
public class Sortings {
    public static void main(String[] args) 
    {
        int array[];
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of Elements in Array:");
        n = sc.nextInt();
        array = new int[n];
        System.out.print("Enter the Elements:");
        for(int i=0; i<n; i++)
        {
            array[i] = sc.nextInt();
        }
        System.out.print("Array Before Sorting:");
        for(int i=0; i<n; i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int choice=0;
        System.out.println("Available Choices:");
        System.out.println("1. Bubble Sort: ");
        System.out.println("2. Insertion Sort: ");
        System.out.println("3. Selection Sort: ");
        System.out.println("4. Exit: ");

        while(choice!=4)
        {
            System.out.println("Enter Your Choice: ");
            choice = sc.nextInt();

            switch(choice)
            {
                case 1: bubblesort(array,n);
                System.out.println();
                break;

                case 2: insertionsort(array,n);
                System.out.println();
                break;

                case 3: selectionsort(array,n);
                System.out.println();
                break;

                case 4: System.out.print("Exit!");
                break;

                default:
                System.out.println("Enter Valid Choice:");
            }
        }
        sc.close();
    }
    static void bubblesort(int array[], int n)
    {
        int f=1;
        while(f!=0)
        {
            f=0;
            for(int i=0; i<n-1; i++)
            {
                if(array[i]>array[i+1])
                {
                    int t = array[i];
                    array[i] = array[i+1];
                    array[i+1] = t;
                    f++;
                }
            }
        }
        System.out.println("Array after Bubble Sort is: ");
        for(int i=0; i<n; i++)
        {
            System.out.print(array[i] + " ");
        }
    }
    
    static void insertionsort(int array[], int n)
    {
        for(int i=1; i<n; i++)
        {
            for(int j=i-1; j>=0; j--)
            {
                if(array[i]<array[j])
                {
                    int t = array[i];
                    array[i] = array[j];
                    array[j] = t;
                }
            }
        }
        System.out.println("Array after Insertion Sort is: ");
        for(int i=0; i<n; i++)
        {
            System.out.print(array[i] + " ");
        }
    }

    static void selectionsort(int array[], int n)
    {
        int min=10000000;
        for(int i=0; i<n; i++)
        {
            for(int j=i; j<n; j++)
            {
                if(array[j]<min)
                {
                    min = array[i];
                    int t = array[i];
                    array[i] = min;
                    array[j] = t;
                }
            }
        }
        System.out.println("Array after Selection Sort is: ");
        for(int i=0; i<n; i++)
        {
            System.out.print(array[i] + " ");
        }
    }   
}
