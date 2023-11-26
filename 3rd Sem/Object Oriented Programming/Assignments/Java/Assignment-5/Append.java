import java.util.*;
public class Append {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First String: ");
        String s1 = sc.nextLine();
        System.out.print("Enter the Second String: ");
        String s2 = sc.nextLine();
        sc.close();

        int l1 = s1.length();
        int l2 = s2.length();

        if(l1==l2)
        {
            System.out.println(s1.concat(s2));
        }
        else if(l1>l2)
        {
            System.out.println(s1.substring(l1-l2).concat(s2));
        }
        else
        {
            System.out.println(s1.concat(s2.substring(l2-l1)));
        }
    }
}
