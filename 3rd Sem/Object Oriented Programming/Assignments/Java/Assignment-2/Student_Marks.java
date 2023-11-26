public class Student_Marks {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        if(num>90 && num<=100){
            System.out.println("Outstanding");
        }
        else if(num>80 && num<=90){
            System.out.println("Excellent");
        }
        else if(num>70 && num<=80){
            System.out.println("Very Good");
        }
        else if(num>60 && num<=70){
            System.out.println("Good");
        }
        else if(num>50 && num<=60){
            System.out.println("Average");
        }
        else if(num>40 && num<=50){
            System.out.println("Satisfactory");
        }
        else if(num==40){
            System.out.println("Marginal");
        }
        else if(num<40){
            System.out.println("Fail");
        }
        else{
            System.out.println("Enter Valid Marks");
        }
    }
}
