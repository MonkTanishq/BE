public class Sum_Product {
    public static void main(String[] args) 
    {
        int num=Integer.parseInt(args[0]);
        int sum=0, product=1;
        while(num>0)
        {
            sum+=num%10;
            product*=num%10;
            num/=10;
        }
        System.out.println("Sum of entered number is: " + sum);
        System.out.println("Product of entered number is: " + product);

    }
}
