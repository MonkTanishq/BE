import java.util.*;
public class FrequentChar {
    public static void main(String[] args) {
        int max=0, newmax=0; 
        String s;
        char p[], k=' ';
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        s = sc.nextLine(); 
        s = s.toLowerCase();
        p = s.toCharArray();
        Map<Character, Integer>mp = new HashMap<Character,Integer>();

        for(int i=0; i<s.length(); i++)
        {
            if(mp.containsKey(p[i]) && p[i] != ' ')
            {
                mp.put(p[i], mp.get(p[i]) + 1);
            }
            else{
                if(p[i] != ' ')
                {
                    mp.put(p[i], 1);
                }
            }
        }
        for(char i : mp.keySet())
        {
            if(mp.get(i)>max)
            {
                max = mp.get(i);
            }
        }
        for(char i : mp.keySet())
        {
            if(mp.get(i)<max && mp.get(i)>=newmax)
            {
                k = i;
                newmax = mp.get(i);
            }
        }
        System.out.println("Second Most Frequent Character is: ");
        for(char i : mp.keySet())
        {
            if(mp.get(i) == mp.get(k))
            {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}
