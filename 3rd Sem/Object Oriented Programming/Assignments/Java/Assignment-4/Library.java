import java.util.Arrays;
import java.util.Scanner;
public class Library {
    String authorname ,title,publisher ;
    String issue;
    Library(String t,String an,String pub,String id)
    {  
        authorname=an ;
        title=t ;
        publisher=pub ;
        issue=id ;
    }
    
    Library(String t,String an,String pub)
    {  
        authorname=an ;
        title=t ;
        publisher=pub ;
        issue="Null" ;
    }
    
    void issuebook()
    {

    }
   
    public static void main(String[] args) 
    {
        Library [] c ;
        c = new Library[17];
        Scanner sc = new Scanner(System.in);
        c[1]=new Library("Fundamentals of C","Deepak","Balaji") ; 
        c[2]=new Library("Fundamentals of C++","Dheeraj","Balaji") ;
        c[3]=new Library("Concepts of Java","Lalu","Balaji","20C3181") ;
        c[4]=new Library("Easy Cp","Bhiya","Balaji","20C3182") ;
        c[5]=new Library("Concepts of C","Janvi","Retry","20C2183") ; 
        c[6]=new Library("Getting Ready for CS","Shastri","Cengage") ;
        c[7]=new Library("HTMl The Basics","Abhishek","Cengage") ;
        c[8]=new Library("OOPS Made Easy","Vivek","Balaji") ;
        c[9]=new Library("Fundamentals of Node","Deepak","Balaji") ; 
        c[10]=new Library("Starting with CP","Dheeraj & Bhiyu","Arihant") ;
        c[11]=new Library("DS in Java","Lata Parikh","Balaji") ;
        c[12]=new Library("Algorithms CLRS","CLRS","Pearson") ;
        c[13]=new Library("SQL Database","Joseph","ReLearn","203001") ; 
        c[14]=new Library("Concepts of CSS","Deepak","Cengage") ;
        c[15]=new Library("Wed Dev Basics","Ahirvar","Balaji","20C3184") ;
        c[16]=new Library("OOPS Advanced","Vivek","Pearson") ;

        System.out.println("Enter your ID:") ;
        String id=sc.nextLine() ;
        System.out.println("Enter Title of Book You Want to Issue:") ;
        String T=sc.nextLine() ;
        for(int i=1;i<17;i++)
        {   
            if((c[i].issue).equalsIgnoreCase(id))
            {
                System.out.println("A Book is Already issued by Your Id:"+c[i].title) ;
                break ;
            }
            else if((c[i].title).equalsIgnoreCase(T) && c[i].issue=="Null")
            {
                c[i].issue=id ;
                System.out.println("Book Issued by:"+id);
            }
        
        }
        System.out.println("Want to Return a Book? ") ;
        Scanner s=new Scanner(System.in);
        String t=s.nextLine() ;
        if(t.equalsIgnoreCase("y"))
        {  
            System.out.println("Enter Title of Book You Want to Return:") ;
        }
        String R=s.nextLine() ;
        System.out.println("Enter No. of Days late:") ;
        int n=s.nextInt();
        System.out.println("Fine: "+n*5) ;

        for(int i=1;i<17;i++)
        {
            if((c[i].title).equalsIgnoreCase(R))
            {
                c[i].issue="Null" ;
            }
        }
        System.out.println("The Book Record is:");
    
        for(int i=1; i<17; i++)
        {
            System.out.println("Title:" + c[i].title);
            System.out.println("Author:" + c[i].authorname);
            System.out.println("Publisher:" + c[i].publisher);
            System.out.println("Issued By:" + c[i].issue);
            System.out.println();
        }
        
    }
}
