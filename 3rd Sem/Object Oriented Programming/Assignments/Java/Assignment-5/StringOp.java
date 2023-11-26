import java.util.*;
public class StringOp {
    public static void main(String[] args) {
        String s = "Help me God";
        System.out.println(s);
        System.out.println(s.length());
        System.out.println(s.charAt(0));
        System.out.println(s.indexOf("me"));   
        System.out.println(s.substring(0,3));
        
        int count=0, ctr=0;

        char[] p = s.toCharArray();
        for(int i=0; i<s.length(); i++)
        {
            count = 1;
            for(int j=i+1; j<s.length(); j++)
            {
                if(s.charAt(i) == s.charAt(j))
                {
                    count++;
                    p[j] = '0';
                }
            }

            if(count>1 && s.charAt(i)!='0')
            {
                ctr++;
                System.out.print(p[i] + " ");
            }
        }
        System.out.print("Number of Dublicates: " + ctr);
        System.out.println();  
    }
}

