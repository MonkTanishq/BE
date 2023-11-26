import java.util.Random;
public class RandomAverage 
{
    public static void main(String[] args) 
    {   
        int sum=0;
        Random ran =new Random();
        System.out.println("Random Numbers are: ");
        for(int i=1;i<=8;i++)
        {
          int x = ran.nextInt();
          System.out.println(x);
          sum = sum+x;  
        }   
        int average = sum/8;
        System.out.println("Average of 8 Random Numbers is: "+ average);
    }
    
}
