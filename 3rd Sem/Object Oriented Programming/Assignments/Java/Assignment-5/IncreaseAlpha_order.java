import java.util.*;
public class IncreaseAlpha_order {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = new String[5];

        for(int i=0; i<5; i++)
        {
            System.out.print("Enter the "+ (i+1) + "th Word:");
            s[i] = sc.nextLine();
        }

        Arrays.sort(s);
        System.out.println();

        System.out.println("The Words in Increasing Order: ");

        for(int i=0; i<5; i++)
        {
            System.out.print(s[i] + " ");
        }
        sc.close();
    }
}
