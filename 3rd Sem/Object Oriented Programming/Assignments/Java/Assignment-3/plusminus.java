import java.util.Scanner;
public class plusminus {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number:");
        n = sc.nextInt();

        if(n<0)
        {
            System.out.print("Negative Number");
        }
        else if(n>0)
        {
            System.out.print("Positive Number");
        }
        else
        {
            System.out.print("Zero");
        }
        sc.close();
    }

}
