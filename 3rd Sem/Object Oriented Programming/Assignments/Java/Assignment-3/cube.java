import java.util.*;
public class cube {
    public static void main(String[] args) {
        int n;
        System.out.print("Enter a Number:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        
        for(int i=1; i<=n; i++)
        {
            System.out.println("The cube of "+i+" is: "+(i*i*i));
        }
        sc.close();
    }
}
