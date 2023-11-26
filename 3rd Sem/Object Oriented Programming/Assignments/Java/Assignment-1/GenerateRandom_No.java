import java.util.Random;
public class GenerateRandom_No {
    public static void main(String[] args) {
        Random obj=new Random();
        System.out.println("Random number between 1 to 100");
        int upperbound=101;
        for(int i=1;i<=5;i++){
            System.out.println(i + " Random Integer Between 1 to 100 is: " + obj.nextInt(upperbound));
        }
    }
    
}
