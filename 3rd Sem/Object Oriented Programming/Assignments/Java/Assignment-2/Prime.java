public class Prime {
    public static void main(String[] args) 
    {
        int n=Integer.parseInt(args[0]);
        int count=0;
        for(int i=2; i<n; i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }
        if(count==0)
        {
            System.out.print("The number is prime.");
        }
        else
        {
            System.out.print("The number is not prime.");
        }

    }
}
