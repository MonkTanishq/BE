import java.util.*;
public class SumDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String s = sc.nextLine();
        char p[] = s.toCharArray();
        sc.close();
        
        int sum=0;
        for(int i=0; i<s.length(); i++)
        {
            if(p[i]>48 && p[i]<=57)
            {
                sum = sum + p[i]-48;            }
        }
        System.out.println("The Sum of the Digits is: " + sum);
    }
}
