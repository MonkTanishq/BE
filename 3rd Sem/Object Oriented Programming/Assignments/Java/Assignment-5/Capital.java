import java.util.*;
public class Capital {
    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        s = sc.nextLine();

        char[] c;
        String e = s.toLowerCase();
        c = e.toCharArray();
        c[0] = Character.toUpperCase(c[0]);

        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i)==32)
            {
                c[i+1] = Character.toUpperCase(c[i+1]);
            }
        }

        for(int i=0; i<s.length(); i++)
        {
            System.out.print(c[i]);
        }

        sc.close();
    }
}
