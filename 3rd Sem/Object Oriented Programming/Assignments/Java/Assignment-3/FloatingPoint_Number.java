import java.util.Scanner;
public class FloatingPoint_Number {
    public static void main(String[] args) {
        float f;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Floating Point Number:");
        f = sc.nextFloat();

        if(f==0)
        {
            System.out.print("Zero");
        }
        else if(f>0)
        {
            if(f>1000000)
            {
                System.out.print("Large Positive");
            }
            else if(f<1)
            {
                System.out.print("Small Positive");
            }
            else
            {
                System.out.print("Positive");
            }
        }
        else
        {
            if(f>-1)
            {
                System.out.print("Small Negative");
            }
            else if(f<(-1000000))
            {
                System.out.print("Large Negative");
            }
            else
            {
                System.out.print("Negative");
            }
        }
        sc.close();
    }   
}
