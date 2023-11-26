import java.util.Scanner;
public class Order {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter First number: ");
        double x = in.nextDouble();
        System.out.print("Enter Second number: ");
        double y = in.nextDouble();
       System.out.print("Enter Third number: ");
        double z = in.nextDouble();
        if (x < y && y < z)
        {
            System.out.println("Increasing order");
        }
        else if (x > y && y > z)
        {
            System.out.println("Decreasing order");
        }
        else
        {
            System.out.println("Neither increasing or decreasing order");
        }
    }
}
