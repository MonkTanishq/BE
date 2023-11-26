import java.util.Arrays;
import java.util.Scanner;
public class Q4library{
        String authorname ,title,publisher ;
        String issue;
    Q4library(String t,String an,String pub,String id)
    {  
        authorname=an ;
        title=t ;
        publisher=pub ;
        issue=id ;
    }
    Q4library(String t,String an,String pub)
    {  
        authorname=an ;
        title=t ;
        publisher=pub ;
        issue="Null" ;
    }
    void issuebook()
    {

    }
   
public static void main(String[] args) {
    Q4library [] c ;
    c = new Q4library[17];
    Scanner sc = new Scanner(System.in);
     c[1]=new Q4library("Fundamentals of c","Deepak","Balaji") ; 
     c[2]=new Q4library("Fundamentals of c++","Dheeraj","Balaji") ;
     c[3]=new Q4library("Concepts of Java","Lalu","Balaji","20c3029") ;
     c[4]=new Q4library("Easy Cp","Bhiya","Balaji","20c3022") ;
     c[5]=new Q4library("Concepts of c","janvi","Retry","20c2011") ; 
    c[6]=new Q4library("getting ready for CS","Shastri","Cengage") ;
    c[7]=new Q4library("HTMl the basics","Abhishek","Cengage") ;
    c[8]=new Q4library("Oops made easy","vivek","Balaji") ;
    c[9]=new Q4library("Fundamentals of Node","Deepak","Balaji") ; 
    c[10]=new Q4library("Starting with cp","Dheeraj & Bhiyu","Arihant") ;
    c[11]=new Q4library("DS in Java","Lata parikh","Balaji") ;
    c[12]=new Q4library("Algorithms CLRS","CLRS","pearson") ;
    c[13]=new Q4library("SQL Database","Joseph","ReLearn","203001") ; 
    c[14]=new Q4library("Concepts of CSS","Deepak","Cengage") ;
    c[15]=new Q4library("Wed Dev basics","Ahirvar","Balaji","20c30058") ;
    c[16]=new Q4library("Oops advanced","vivek","pearson") ;

    System.out.println("Enter your ID ") ;
    String id=sc.nextLine() ;
    System.out.println("Enter title of book you want to issue ") ;
    String T=sc.nextLine() ;
        for(int i=1;i<17;i++)
    {   if((c[i].issue).equalsIgnoreCase(id))
        {System.out.println("A book is Already issued by your Id "+c[i].title) ;
        break ;
        }
        else if((c[i].title).equalsIgnoreCase(T) && c[i].issue=="Null")
        {
            c[i].issue=id ;
            System.out.println("Book issued by "+id);
        }
        
    }
System.out.println("Want to Return a Book? ") ;
Scanner s=new Scanner(System.in);
String t=s.nextLine() ;
if(t.equalsIgnoreCase("y"))
{  System.out.println("Enter title of book you want to return ") ;

String R=s.nextLine() ;
System.out.println("Enter No. of Days late: ") ;
int n=s.nextInt();
System.out.println("Fine: "+n*5) ;

for(int i=1;i<17;i++)
    {
        if((c[i].title).equalsIgnoreCase(R))
        {
            c[i].issue="Null" ;
        }
    }
}

System.out.println("The Book Record is :") ;
for(int i=1;i<17;i++)
{
    System.out.println("Title: "+c[i].title);
    System.out.println("Author: "+c[i].authorname);
    System.out.println("Publisher: "+c[i].publisher);
    System.out.println("Issued by "+c[i].issue);
    System.out.println() ;
    
}
    


}
}