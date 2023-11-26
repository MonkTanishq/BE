import java.util.*;
public class Inventory {
    float price ;
    int stock ;
    String authorname ,title,publisher ;
    Inventory(String t,String an,int st,String pub,float p)
    {  
        price= p;
        stock=st ;
        authorname=an ;
        title=t ;
        publisher=pub;
    }
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Inventory c1=new Inventory("Computer Fundamentals","Gupta",200,"Prakashan",300); 
        Inventory c2=new Inventory("Data Structures and Algorithms using C++","E.Balagurusami",150,"MChill",200);
        Inventory c3=new Inventory("The Object Oriented Thought Process","Matt",200,"Weisfeld",320);
        Inventory c4=new Inventory("The Development of Arab Mathematics: b/w Arithematic and Algebra","Roshdi",120,"Rashed",230);
        System.out.println("Enter Title:");
        String ti=sc.nextLine();
        System.out.println("Enter Author:");
        String Au=sc.nextLine();
        if((c1.title).equalsIgnoreCase(ti) && (c1.authorname).equalsIgnoreCase(Au) )
        {
            System.out.println("------Book Details-----") ;
            System.out.println("Title: "+c1.title) ;
            System.out.println("Author: "+c1.authorname) ;
            System.out.println("Publisher: "+c1.publisher) ;
            System.out.println("Price: "+c1.price) ;
            System.out.println("Stock: "+c1.stock) ;
            System.out.println("Enter req copies: ") ;
            float r=sc.nextFloat() ;
            if(c1.stock -(int)r>=0)
            {
                r=r*c1.price;
                System.out.println("Total price: "+r) ;
            }
            else
            System.out.println("Required copies currently unavailable") ;
        }
        else if((c2.title).equalsIgnoreCase(ti) && (c2.authorname).equalsIgnoreCase(Au) )
        {
            System.out.println("------Book Details-----") ;
            System.out.println("Title: "+c2.title) ;
            System.out.println("Author: "+c2.authorname) ;
            System.out.println("Publisher: "+c2.publisher) ;
            System.out.println("Price: "+c2.price) ;
            System.out.println("Stock: "+c2.stock) ;
            
            System.out.println("Enter req copies: ") ;
            float r=sc.nextFloat() ;
            if(c2.stock -(int)r>=0)
            {
                r=r*c2.price;
                System.out.println("Total price: "+r) ;
            }
            else
            System.out.println("Required copies not in stock") ;
        }
        else if((c3.title).equalsIgnoreCase(ti) && (c3.authorname).equalsIgnoreCase(Au) )
        {
            System.out.println("------Book Details-----") ;
            System.out.println("Title: "+c3.title) ;
            System.out.println("Author: "+c3.authorname) ;
            System.out.println("Publisher: "+c3.publisher) ;
            System.out.println("Price: "+c3.price) ;
            System.out.println("Stock: "+c3.stock) ;
            
            System.out.println("Enter req copies: ") ;
            float r=sc.nextFloat() ;
            if(c3.stock -(int)r>=0)
            {
                r=r*c3.price;
                System.out.println("Total price: "+r) ;
            }
            else
            System.out.println("Required copies not in stock") ;
        }
        else if((c4.title).equalsIgnoreCase(ti) && (c4.authorname).equalsIgnoreCase(Au) )
        {
            System.out.println("------Book Details-----") ;
            System.out.println("Title: "+c4.title) ;
            System.out.println("Author: "+c4.authorname) ;
            System.out.println("Publisher: "+c4.publisher) ;
            System.out.println("Price: "+c4.price) ;
            System.out.println("Stock: "+c4.stock) ;
            
            System.out.println("Enter req copies: ") ;
            float r=sc.nextFloat() ;
            if(c4.stock -(int)r>=0)
            {
                r=r*c4.price;
                System.out.println("Total price: "+r) ;
            }
            else
            System.out.println("Required copies not in stock") ;
        }
        else
        System.out.println("Book Not found ") ;

    }
}
