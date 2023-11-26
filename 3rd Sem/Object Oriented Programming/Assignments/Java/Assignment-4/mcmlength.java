import java.util.Arrays;
import java.util.Scanner;
import javax.lang.model.util.ElementScanner14;

public class mcmlength {
    int m,cm,mm,r;
    mcmlength(int a,int b,int c)
    {
        m = a;
        cm = b;
        mm = c;
        r = (m*1000 ) + (cm*10) + mm;       
    }
    mcmlength(int h)
    {
        int m,cm,mm,r;
    }
    void backto(int n)
    {
        int M = n/1000;
        n = n%1000;
        int Ce = n/10;
        n = n%10;
        m= M;
        cm = Ce;
        mm = n; 
    }
    void Display(mcmlength a)
    {
        System.out.println(a.m+" meter "+a.cm+" centimeter "+a.mm+" milimeter ");
    }

    void subs(mcmlength a1,mcmlength a2)
    { 
        int p = 0;
        mcmlength y=new mcmlength(p);
        y.r = a1.r - a2.r;
        y.backto(y.r);
        Display(y);
    }

    void add(mcmlength a1,mcmlength a2)
    { 
        int p = 0;
        mcmlength y = new mcmlength(p);
        y.r = a1.r + a2.r;
        y.backto(y.r);
        Display(y);
    }

    void Mul(mcmlength a1,int n)
    {
        mcmlength y = new mcmlength(n*a1.m,n*a1.cm,n*a1.mm);
        y.backto(y.r);
        Display(y);
    }
        
        
    void Div(mcmlength a1,int n)
    {
        int p = 0;
        mcmlength y = new mcmlength(p);
        y.r = (a1.r /n);
        y.backto(y.r);
        Display(y); 
    }
        

    void area(mcmlength a1,mcmlength a2)
    {
        int p=0;
        mcmlength y = new mcmlength(p);
        y.r = (a1.r)*(a2.r);
        System.out.println("Area is: "+y.r+" sq mm");
    }

    void compare(mcmlength a1,mcmlength a2)
    {
        if(a1.r>a2.r)
        {
            System.out.print("Object "+a1.m+"m "+a1.cm+"cm "+a1.mm+"mm is bigger than "+a2.m+"m "+a2.cm+"cm "+a2.mm+"mm ") ;
        }
        else
        { 
            System.out.print("Object "+a2.m+"m "+a2.cm+"cm "+a2.mm+"mm is bigger than "+a1.m+"m "+a1.cm+"cm "+a1.mm+"mm ");
        }
    }

    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        int m1,m2,cm1,cm2,mm1,mm2;
        System.out.println("Enter value for object 1 in Meter ,Centimeter,Millimeter ");
        m1=sc.nextInt();
        cm1=sc.nextInt();
        mm1=sc.nextInt();
        System.out.println("Enter value for object 2 in Meter ,Centimeter,Millimeter ");
        m2=sc.nextInt();
        cm2=sc.nextInt();
        mm2=sc.nextInt();
        mcmlength a1=new mcmlength(m1,cm1,mm1);
        mcmlength a2=new mcmlength(m2,cm2,mm2);
        System.out.print("Ans of addition is : ");
        a1.add(a1,a2);
        System.out.print("Ans of substraction is : ");
        a1.subs(a1,a2);
        System.out.print("Enter no. thorugh which Multiplication is to ber performed with object1 ");
        m1=sc.nextInt();
        System.out.print("Ans of Mulitiplication is : ");
        a1.Mul(a1, m1);
        System.out.print("Enter no. thorugh which Division is to ber performed with object1 ");
        m1=sc.nextInt();
        System.out.print("Ans of Division is : ");
        a1.Div(a1, m1);
        System.out.print("Ans of area enclosed by object 1 and object 2 is : ");
        a1.area(a1, a2);
        System.out.print("Ans of Comparison is : ");
        a1.compare(a1, a2);
    }     
}
