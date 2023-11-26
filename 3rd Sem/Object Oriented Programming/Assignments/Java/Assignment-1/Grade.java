import java.util.Random;
public class Grade {
    public static void main(String[] args) {
        Random random = new Random(); 
        int innerbound=59, upperbound = 100;
        int rand = random.nextInt(innerbound, upperbound);  
        System.out.println("Random integer between 60 to 99 is: "+ rand);
        if(rand>=60 && rand<=63){
            System.out.println("The grade is C-");
        }
        if(rand>=64 && rand<=67){
            System.out.println("The grade is C");
        }
        if(rand>=68 && rand<=71){
            System.out.println("The grade is C+");
        }
        if(rand>=72 && rand<=75){
            System.out.println("The grade is B-");
        }
        if(rand>=76 && rand<=79){
            System.out.println("The grade is B");
        }
        if(rand>=80 && rand<=84){
            System.out.println("The grade is B+");
        }
        if(rand>=85 && rand<=89){
            System.out.println("The grade is A-");
        }
        if(rand>=90 && rand<=94){
            System.out.println("The grade is A");
        }
        if(rand>=95 && rand<=99){
            System.out.println("The grade is A+");
        }
    }
}
