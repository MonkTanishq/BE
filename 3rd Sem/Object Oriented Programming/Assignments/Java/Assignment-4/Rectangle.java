import java.util.Arrays;
import java.util.Scanner;

class coordinates
{
    public int x;
    public int y;
};

public class Rectangle {
    Scanner sc= new Scanner(System.in);
    coordinates bl=new coordinates();
    coordinates br=new coordinates();
    coordinates tl=new coordinates();
    coordinates tr=new coordinates();

    void cords()
    {
        System.out.println("Enter the Coords of Bottom Left Corner : ");
        System.out.print("x: ");
        bl.x=sc.nextInt();
        System.out.print("y: ");
        bl.y=sc.nextInt();
        System.out.println("Enter the Coords of Top Right Corner : ");
        System.out.print("x: ");
        tr.x=sc.nextInt();
        System.out.print("y: ");
        tr.y=sc.nextInt();            
    }

    Rectangle()
    {
        cords();
        tl.x=bl.x;
        tl.y=tr.y;
        br.x=tr.x;
        br.y=bl.y;
    }
    Rectangle(int a)
    {

    }
    void Displayc()
    {
        System.out.print("Bottom left : ("+bl.x+","+bl.y+")"+"Top right : ("+tr.x+","+tr.y+")") ;
    }

    Rectangle(Rectangle a,Rectangle b,Rectangle c,Rectangle d)
    { 
        int p=0 ;
        Rectangle e=new Rectangle(p) ;
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
        
        
        
    public static void main(String[] args) 
    {
        Rectangle a=new Rectangle() ;
        Rectangle b=new Rectangle() ;
        Rectangle c=new Rectangle() ;
        Rectangle d=new Rectangle() ;
        System.out.println("The Defining points of Enclosing Rectangle are :");
        Rectangle e=new Rectangle(a,b,c,d) ;
    }
}


