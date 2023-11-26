public class Palindrome {
    public static void main(String[] args) 
    {
        int n=Integer.parseInt(args[0]);
        int t=n, rev=0;
        while(t>0)
        {
            rev=rev*10 + t%10;
            t/=10;
        }
        if(rev==n)
        {
            System.out.println("The given number is a palindrome");
        }
        else
        {
            System.out.println("The given number is not a palindrome");
        }

    }
}
