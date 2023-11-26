import java.util.Arrays;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class Q8tkgweight {
       
        int t,kg,g ;
         int r ;
         Q8tkgweight(int a,int b,int c)
        {
            t=a ;
            kg=b ;
            g=c ;
            r=(t*1000000 )+ (kg*1000)+ g ;
        }
        Q8tkgweight(int h)
        {
            int t,kg,g ;
             int r ;
        }
        void backto( int n)
        {
            int M=n/1000000 ;
            n=n%1000000 ;
            int Ce=n/1000 ;
            n=n%1000 ;
            t=M ;
            kg=Ce ;
            g=n ; 
        }
        void Display(Q8tkgweight a)
        {
            System.out.println(a.t+" tons "+a.kg+" kilograms "+a.g+" grams ") ;
        }
        void subs(Q8tkgweight a1,Q8tkgweight a2)
        { int p= 0 ;
            Q8tkgweight y=new Q8tkgweight(p) ;
            y.r=a1.r - a2.r ;
            y.backto(y.r) ;
            Display(y) ;}
        void add(Q8tkgweight a1,Q8tkgweight a2)
        { int p= 0 ;
            Q8tkgweight y=new Q8tkgweight(p) ;
            y.r=a1.r + a2.r ;
            y.backto(y.r) ;
            Display(y) ;
        }
        void Mul(Q8tkgweight a1,int n)
        {   
            Q8tkgweight y=new Q8tkgweight(n*a1.t,n*a1.kg,n*a1.g) ;
            y.backto(y.r);
            Display(y);
            }
        void Div(Q8tkgweight a1,int n)
        {
            int p=0 ;
            Q8tkgweight y=new Q8tkgweight(p) ;
            y.r=(a1.r /n) ;
            y.backto(y.r) ;
            Display(y); 
        }
        void compare(Q8tkgweight a1,Q8tkgweight a2)
        {
            if(a1.r>a2.r)
            {
            System.out.print("Object "+a1.t+"ton "+a1.kg+"kg "+a1.g+"g is bigger than "+a2.t+"ton "+a2.kg+"kg "+a2.g+"g") ;
            }
            else
            { 
                System.out.print("Object "+a2.t+"ton "+a2.kg+"kg "+a2.g+"g is bigger than "+a1.t+"ton "+a1.kg+"kg "+a1.g+"g ") ;
            }
        }
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in) ;
    int m1,m2,cm1,cm2,mm1,mm2 ;
    System.out.println("Enter value for object 1 in ton ,kilogram,gram ") ;
    m1=sc.nextInt() ;
    cm1=sc.nextInt() ;
    mm1=sc.nextInt() ;
    System.out.println("Enter value for object 2 in ton ,kilogram,gram ") ;
    m2=sc.nextInt() ;
    cm2=sc.nextInt() ;
    mm2=sc.nextInt() ;
    Q8tkgweight a1=new Q8tkgweight(m1,cm1,mm1) ;
    Q8tkgweight a2=new Q8tkgweight(m2,cm2,mm2) ;
    System.out.print("Ans of addition is : ") ;
    a1.add(a1,a2) ;
    System.out.print("Ans of substraction is : ") ;
    a1.subs(a1,a2) ;
    System.out.print("Enter no. thorugh which Multiplication is to ber performed with object1 ") ;
    m1=sc.nextInt() ;
    System.out.print("Ans of Multiplication is : ") ;
    a1.Mul(a1, m1) ;
    System.out.print("Enter no. thorugh which Division is to ber performed with object1 ") ;
    m1=sc.nextInt() ;
    System.out.print("Ans of Division is : ") ;
    a1.Div(a1, m1) ;
    System.out.print("Ans of Comparison is : ") ;
    a1.compare(a1, a2);
}
}