import java.util.Arrays;
import java.util.Scanner;
public class tkgweight {
    int t,kg,g;
    int r;

    tkgweight(int a,int b,int c)
    {
        t=a;
        kg=b;
        g=c;
        r=(t * 1000000) + (kg * 1000) + g;
    }

    tkgweight(int h)
    {
        int t,kg,g;
        int r;
    }

    void backto(int n)
    {
        int M = n/1000000;
        n = n%1000000;
        int Ce = n/1000;
        n = n%1000;
        t = M;
        kg = Ce;
        g = n; 
    }

    void Display(tkgweight a)
    {
        System.out.println(a.t+" Tons "+a.kg+" Kilograms "+a.g+" Grams ");
    }

    void subs(tkgweight a1,tkgweight a2)
    { 
        int p= 0;
        tkgweight y = new tkgweight(p);
        y.r = a1.r - a2.r;
        y.backto(y.r);
        Display(y);
    }

    void add(tkgweight a1,tkgweight a2)
    { 
        int p= 0;
        tkgweight y=new tkgweight(p);
        y.r = a1.r + a2.r;
        y.backto(y.r);
        Display(y);
    }

    void Mul(tkgweight a1,int n)
    {   
        tkgweight y=new tkgweight(n*a1.t,n*a1.kg,n*a1.g);
        y.backto(y.r);
        Display(y);
    }

    void Div(tkgweight a1,int n)
    {
        int p=0;
        tkgweight y=new tkgweight(p);
        y.r=(a1.r /n);
        y.backto(y.r);
        Display(y); 
    }

    void compare(tkgweight a1,tkgweight a2)
    {
        if(a1.r>a2.r)
        {
            System.out.print("Object "+a1.t+"ton "+a1.kg+"kg "+a1.g+"g is bigger than "+a2.t+"ton "+a2.kg+"kg "+a2.g+"g ");   
        }
        else
        { 
            System.out.print("Object "+a2.t+"ton "+a2.kg+"kg "+a2.g+"g is bigger than "+a1.t+"ton "+a1.kg+"kg "+a1.g+"g ");
        }
    }

    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        int m1,m2,cm1,cm2,mm1,mm2;
        System.out.println("Enter Value for Object 1 in Ton,Kilogram,Gram:");
        m1=sc.nextInt();
        cm1=sc.nextInt();
        mm1=sc.nextInt();
        System.out.println("Enter Value for Object 2 in Ton,Kilogram,Gram:");
        m2=sc.nextInt();
        cm2=sc.nextInt();
        mm2=sc.nextInt();
        tkgweight a1=new tkgweight(m1,cm1,mm1);
        tkgweight a2=new tkgweight(m2,cm2,mm2);
        System.out.print("Ans of Addition is:") ;
        a1.add(a1,a2);
        System.out.print("Ans of Substraction is:");
        a1.subs(a1,a2);
        System.out.print("Enter no. Thorugh which Multiplication is to be Performed with Object1:");
        m1=sc.nextInt();
        System.out.print("Ans of Multiplication is:");
        a1.Mul(a1, m1);
        System.out.print("Enter no. thorugh which Division is to be Performed with Object1:");
        m1=sc.nextInt();
        System.out.print("Ans of Division is:");
        a1.Div(a1, m1);
        System.out.print("Ans of Comparison is:");
        a1.compare(a1, a2);
    }       
}
