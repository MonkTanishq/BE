import java.util.*;
public class NonRepeating_Char {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String s;
        s = sc.nextLine();
        sc.close();  
        
        s = s.toLowerCase();

        char[] p = s.toCharArray();
        Map<Character, Integer> mp = new HashMap<Character, Integer>();

        for(int i=0; i<s.length(); i++)
        {
            if(mp.containsKey(p[i]))
            {
                mp.put(p[i], mp.get(p[i]) + 1);
            }
            else
            {
                mp.put(p[i], 1);
            }
        }
        int j;
        for(j=0; j<s.length(); j++)
        {
            if(mp.get(p[j])==1 && p[j]!=32)
            {
                System.out.print("The First Non Repeating Character is: " + p[j]);
                break;
            }
        }
        if(j == s.length())
        {
            System.out.println("No Non Repeating Character");
        }
    }
}
