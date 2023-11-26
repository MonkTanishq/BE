import java.util.Arrays;
import java.util.Scanner;
class coordinates{
public int x ;
public int y ;
};
public class Q6Rectangle{
        Scanner sc= new Scanner(System.in) ;
        coordinates bl=new coordinates() ;
        coordinates br=new coordinates() ;
        coordinates tl=new coordinates() ;
        coordinates tr=new coordinates() ;
        void cords()
        {
            System.out.println("Enter the coords of Bottom left corner : ") ;
            System.out.print("x: ") ;
            bl.x=sc.nextInt() ;
            System.out.print("y: ") ;
            bl.y=sc.nextInt() ;
            System.out.println("Enter the coords of Top Right corner : ") ;
            System.out.print("x: ") ;
            tr.x=sc.nextInt() ;
            System.out.print("y: ") ;
            tr.y=sc.nextInt() ;
            
            
        }
        Q6Rectangle()
        {
            cords() ;
            tl.x=bl.x ;
            tl.y=tr.y ;
            br.x=tr.x ;
            br.y=bl.y ;
        }
        
        Q6Rectangle(int a)
        {
        }
        void Displayc()
        {
            System.out.print("Bottom left : ("+bl.x+","+bl.y+")"+"Top right : ("+tr.x+","+tr.y+")") ;
        }
        Q6Rectangle(Q6Rectangle a,Q6Rectangle b,Q6Rectangle c,Q6Rectangle d)
        { int p=0 ;
          Q6Rectangle e=new Q6Rectangle(p) ;
            e.bl.x=Math.min(a.bl.x,b.bl.x) ;
            e.bl.x=Math.min(e.bl.x,c.bl.x) ;
            e.bl.x=Math.min(e.bl.x,d.bl.x) ;
            e.tl.x=e.bl.x ;
            e.bl.y=Math.min(a.bl.y,b.bl.y) ;
            e.bl.y=Math.min(e.bl.y,c.bl.y) ;
            e.bl.y=Math.min(e.bl.y,d.bl.y) ;
            e.br.y=e.bl.y ;
            e.tr.x=Math.max(a.tr.x,b.tr.x) ;
            e.tr.x=Math.max(e.tr.x,c.tr.x) ;
            e.tr.x=Math.max(e.tr.x,d.tr.x) ;
            e.br.x=e.tr.x ;
            e.tr.y=Math.max(a.tr.y,b.tr.y) ;
            e.tr.y=Math.max(e.tr.y,c.tr.y) ;
            e.tr.y=Math.max(e.tr.y,d.tr.y) ;
            e.tl.y=e.tr.y;
            e.Displayc();
            }
        
public static void main(String[] args) {
    Q6Rectangle a=new Q6Rectangle() ;
    Q6Rectangle b=new Q6Rectangle() ;
    Q6Rectangle c=new Q6Rectangle() ;
    Q6Rectangle d=new Q6Rectangle() ;
    System.out.println("The Defining points of Enclosing Rectangle are :");
    Q6Rectangle e=new Q6Rectangle(a,b,c,d) ;
}
}