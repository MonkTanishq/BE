import java.util.Scanner;
public class Vowels {
    public static void main(String[] args) {
        int n=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String:");
        String s = sc.nextLine();

        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i)=='A' || s.charAt(i)=='a' || s.charAt(i)=='E' || s.charAt(i)=='e' || s.charAt(i)=='I' || s.charAt(i)=='i')
            {
                n++;
            }
            if(s.charAt(i)=='O' || s.charAt(i)=='o' || s.charAt(i)=='U' || s.charAt(i)=='u')
            {
                n++;
            }
        }
        System.out.print("The number of Vowels: " + n);
        System.out.println();
    }
}
