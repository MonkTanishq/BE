import java.util.*;
public class Month {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter the Name of the Month:");
        String ech = sc.nextLine();
        System.out.println();
        System.out.println("Echoing the Input: " + ech);

        String mon = ech.substring(0,3);
        mon = mon.toUpperCase();
        System.out.println(mon);

        switch(mon)
        {
            case "JAN" :
            System.out.println("1st Month of the Calendar");
            System.out.println("The Number of Days in Month is: 31");
            break;

            case "FEB" :
            System.out.println("2nd Month of the Calendar");
            System.out.println("The Number of Days in Month is: 28/29");
            break;

            case "MAR" :
            System.out.println("3rd Month of the Calendar");
            System.out.println("The Number of Days in Month is: 31");
            break;

            case "APR" :
            System.out.println("4th Month of the Calendar");
            System.out.println("The Number of Days in Month is: 30");
            break;

            case "MAY" :
            System.out.println("5th Month of the Calendar");
            System.out.println("The Number of Days in Month is: 31");
            break;

            case "JUN" :
            System.out.println("6th Month of the Calendar");
            System.out.println("The Number of Days in Month is: 30");
            break;

            case "JUL" :
            System.out.println("7th Month of the Calendar");
            System.out.println("The Number of Days in Month is: 31");
            break;

            case "AUG" :
            System.out.println("8th Month of the Calendar");
            System.out.println("The Number of Days in Month is: 31");
            break;

            case "SEP" :
            System.out.println("9th Month of the Calendar");
            System.out.println("The Number of Days in Month is: 30");
            break;

            case "OCT" :
            System.out.println("10th Month of the Calendar");
            System.out.println("The Number of Days in Month is: 31");
            break;

            case "NOV" :
            System.out.println("11th Month of the Calendar");
            System.out.println("The Number of Days in Month is: 30");
            break;

            case "DEC" :
            System.out.println("12th Month of the Calendar");
            System.out.println("The Number of Days in Month is: 31");
            break;

            default:
            System.out.println("Enter Valid Input");
            break;
        }
        sc.close();
    }
}
