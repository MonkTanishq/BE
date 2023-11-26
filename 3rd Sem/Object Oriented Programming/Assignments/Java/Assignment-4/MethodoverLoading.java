import java.util.Arrays;
import java.util.Scanner;
public class MethodoverLoading {
    void areaandperi(float a)
        {
            System.out.println("Area of Square is : "+ Math.pow(a,2));
            System.out.println("Perimeter of Square is : "+ 4*a);
            System.out.println();
        }
        void areaandperi(float a,float b)
        {
            System.out.println("Area of Rectangle is : "+a*b);
            System.out.println("Perimeter of Rectangle is : "+ 2*(a+b));
            System.out.println();
        }
        void areaandperi(double a)
        {
            System.out.println("Area of Circle is : "+ 3.14*(Math.pow(a,2)));
            System.out.println("Perimeter of Circle is : "+ 3.14*2*a);
            System.out.println();
        }
        void areaandperi(double a,double b)
        {
            System.out.println("Area of Cone is : "+ 3.14*a*(a+b));
            System.out.println("Perimeter of Cone is : "+ 3.14*2*a);
            System.out.println();
        }
        void areaandperi(float a,float b,double h)
        {
            System.out.println("Area of parallelogram is : "+ b*h);
            System.out.println("Perimeter of Parallelogram is : "+ 2*(a+b));
            System.out.println();
        }
        public static void main(String[] args) 
        {
            MethodoverLoading a=new MethodoverLoading() ;
            a.areaandperi(4) ;
            a.areaandperi(11,4) ;
            a.areaandperi(4.0) ;
            a.areaandperi(4.0,5.0) ;
            a.areaandperi(5,2,6.0) ;

        }   
}
