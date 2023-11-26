import java.util.Scanner;
public class WeekDay {
    public static void main(String[] args) {
        int n;
        System.out.print("Enter a Number Between 1 to 7: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        switch(n)
        {
            case 1 : System.out.print("Monday");
            break;

            case 2 : System.out.print("Tuesday");
            break;

            case 3 : System.out.print("Wednesday");
            break;

            case 4 : System.out.print("Thursday");
            break;

            case 5 : System.out.print("Friday");
            break;

            case 6 : System.out.print("Saturday");
            break;

            case 7 : System.out.print("Sunday");
            break;

            default: System.out.print("Enter Valid Number");
            break;
        }
        sc.close();
    }    
}
