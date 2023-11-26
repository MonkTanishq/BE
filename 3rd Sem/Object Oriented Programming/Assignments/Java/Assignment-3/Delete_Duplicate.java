import java.util.Scanner;
import java.util.Arrays;
public class Delete_Duplicate {
    public static void main(String[] args) {
        int arr[], arr2[];
        int n,p=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Size of Array:");
        n=sc.nextInt();
        arr=new int[n];
        arr2=new int[n];
        System.out.print("Enter the Elements of Array:");
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i=0; i<n-1; i++)
        {
            if(arr[i]!=arr[i+1])
            {
                arr2[p]=arr[i];
                p++;
            }
        }
        arr2[p] = arr[n-1];

        System.out.print("Array After Deleting Duplicate form Array:");
        for(int i=0; i<=p; i++)
        {
            System.out.print(arr2[i] + " ");
        }
    }
}
