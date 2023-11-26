import java.util.Arrays;
import java.util.Scanner;
public class Q5Methodoverloading{
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
public static void main(String[] args) {
    Q5Methodoverloading a=new Q5Methodoverloading() ;
    a.areaandperi(3) ;
    a.areaandperi(12,4) ;
    a.areaandperi(5.0) ;
    a.areaandperi(5.0,3.0) ;
    a.areaandperi(4,2,7.0) ;

}
}