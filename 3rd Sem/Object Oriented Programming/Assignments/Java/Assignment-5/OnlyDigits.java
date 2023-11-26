import java.util.*;
public class OnlyDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String s = sc.nextLine();
        char p[] = s.toCharArray();
        sc.close();

        int count=0;

        for(int i=0; i<s.length(); i++)
        {
            if(p[i]>=48 && p[i]<=57)
            {
                count++;
            }
        }

        if(count == s.length())
        {
            System.out.println("The String Contains Only Digits");
        }
        else if(count == 0)
        {
            System.out.println("The String Does Not Contain Digits");
        }
        else
        {
            System.out.println("The String Does Not Exclusively Contain Digits");
        }
    }
}
