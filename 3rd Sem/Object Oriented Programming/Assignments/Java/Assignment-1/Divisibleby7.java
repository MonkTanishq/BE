public class Divisibleby7 {
    public static void main(String[] args) {
        int sum=0;
        for(int i=100; i<=200; i++)
        {
            if(i%7==0){
                sum=sum+i;
            }
        }

        System.out.print("Sum of all integers is :"+sum);
    }
}
