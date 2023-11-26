public class Armstrong_No {
    public static void main(String[] args) {
        int n=Integer.parseInt(args[0]);
        int temp=n, arm=0;
        while(temp>0)
        {
            int k=(temp%10)*(temp%10)*(temp%10);
            arm+=k;
            temp/=10;
        }
        if(arm==n)
        {
            System.out.print("The given number is an armstrong number");
        }
        else
        {
            System.out.print("The given number is not an armstrong number");
        }

    }
}
