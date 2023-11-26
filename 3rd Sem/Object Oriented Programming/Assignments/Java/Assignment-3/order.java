import java.util.Scanner;
public class order {
    public static void main(String[] args) {
        int x,y,z;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Number:");
        x = sc.nextInt();
        System.out.print("Enter the Second Number:");
        y = sc.nextInt();
        System.out.print("Enter the Third Number:");
        z = sc.nextInt();

        if(x>y && y>z)
        {
            System.out.print("Decreasing");
        }
        else if(x<y && y<z)
        {
            System.out.print("Increasing");
        }
        else
        {
            System.out.print("Neither Increasing nor Decreasing");
        }
        sc.close();
    }    
}
