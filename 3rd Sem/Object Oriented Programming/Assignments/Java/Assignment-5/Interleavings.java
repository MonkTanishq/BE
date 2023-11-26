import java.util.*;
import java.util.HashSet;
import java.util.Set;
public class Interleavings {
    public static void allInterleavings(String res, String F, String S, Set < String > out) 
    {
        if(F.length() == 0 && S.length() == 0)
        {
            out.add(res);
            return;
        }
        if(F.length() > 0)
        {
            allInterleavings(res + F.charAt(0), F.substring(1), S, out);

        }
        if(S.length() > 0)
        {
            allInterleavings(res + S.charAt(0), F, S.substring(1), out);

        }
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First String: ");
        String F = sc.nextLine();
        System.out.print("Enter Second String: ");
        String S = sc.nextLine();

        System.out.println("The Given Strings are: " + F + " " + S + "\n");
        System.out.println("The Interleavings Strings are: ");
        Set < String > out = new HashSet < > ();
        
        allInterleavings("", F, S, out);

        out.stream().forEach(System.out::println);

    }
}
