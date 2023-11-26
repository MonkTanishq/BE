import java.util.*;
public class Q3inventory{

        float price ;
        int stock ;
        String authorname ,title,publisher ;
    Q3inventory(String t,String an,int st,String pub,float p)
    {  
        price= p;
        stock=st ;
        authorname=an ;
        title=t ;
        publisher=pub ; ;
    }
   
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Q3inventory c1=new Q3inventory("Computer Fundamentals","Deepak",200,"prakashan",300) ; 
    Q3inventory c2=new Q3inventory("data structures and algorithms using c++","Adam",150,"drodzek",200) ;
    Q3inventory c3=new Q3inventory("The object oriented thought process","matt",200,"weisfeld",320) ;
    Q3inventory c4=new Q3inventory("the development of arab mathematics: b/w arithematic and algebra","roshdi",120,"rashed",230) ;
    System.out.println("Enter Title ") ;
    String ti=sc.nextLine() ;
    System.out.println("Enter Author ") ;
    String Au=sc.nextLine() ;
    if((c1.title).equalsIgnoreCase(ti) && (c1.authorname).equalsIgnoreCase(Au) )
    {
        System.out.println("Book Details ") ;
        System.out.println("Title: "+c1.title) ;
        System.out.println("Author: "+c1.authorname) ;
        System.out.println("Publisher: "+c1.publisher) ;
        System.out.println("Price: "+c1.price) ;
        System.out.println("Stock: "+c1.stock) ;
        System.out.println("Enter req copies ") ;
        float r=sc.nextFloat() ;
        if(c1.stock -(int)r>=0)
        {r=r*c1.price;
        System.out.println("Total price: "+r) ;
        }
        else
        System.out.println("Required copies currently unavailable") ;
    }
    else if((c2.title).equalsIgnoreCase(ti) && (c2.authorname).equalsIgnoreCase(Au) )
    {
        System.out.println("Book Details ") ;
        System.out.println("Title: "+c2.title) ;
        System.out.println("Author: "+c2.authorname) ;
        System.out.println("Publisher: "+c2.publisher) ;
        System.out.println("Price: "+c2.price) ;
        System.out.println("Stock: "+c2.stock) ;
        
        System.out.println("Enter req copies ") ;
        float r=sc.nextFloat() ;
        if(c2.stock -(int)r>=0)
        {r=r*c2.price;
        System.out.println("Total price: "+r) ;
        }
        else
        System.out.println("Required copies not in stock") ;
    }
    else if((c3.title).equalsIgnoreCase(ti) && (c3.authorname).equalsIgnoreCase(Au) )
    {
        System.out.println("Book Details ") ;
        System.out.println("Title: "+c3.title) ;
        System.out.println("Author: "+c3.authorname) ;
        System.out.println("Publisher: "+c3.publisher) ;
        System.out.println("Price: "+c3.price) ;
        System.out.println("Stock: "+c3.stock) ;
        
        System.out.println("Enter req copies ") ;
        float r=sc.nextFloat() ;
        if(c3.stock -(int)r>=0)
        {r=r*c3.price;
        System.out.println("Total price: "+r) ;
        }
        else
        System.out.println("Required copies not in stock") ;
    }
    else if((c4.title).equalsIgnoreCase(ti) && (c4.authorname).equalsIgnoreCase(Au) )
    {
        System.out.println("Book Details ") ;
        System.out.println("Title: "+c4.title) ;
        System.out.println("Author: "+c4.authorname) ;
        System.out.println("Publisher: "+c4.publisher) ;
        System.out.println("Price: "+c4.price) ;
        System.out.println("Stock: "+c4.stock) ;
        
        System.out.println("Enter req copies ") ;
        float r=sc.nextFloat() ;
        if(c4.stock -(int)r>=0)
        {r=r*c4.price;
        System.out.println("Total price: "+r) ;
        }
        else
        System.out.println("Required copies not in stock") ;
    }
    else
    System.out.println("Book Not found ") ;

}
}