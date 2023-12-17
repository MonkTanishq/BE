import java.io.*; 
import javax.servlet.*; 
import javax.servlet.http.*; 
 
public class persistentCounter extends HttpServlet{ 
    int counter; 
    String fileName="counter.txt"; 
 
    public void init(){ 
        try{ 
            FileReader freader=new FileReader(fileName); 
            BufferedReader br=new BufferedReader(freader); 
            String initial=br.readLine(); 
            counter=Integer.parseInt(initial); 
 
        }catch(FileNotFoundException e){counter=0;} 
        catch(IOException e){counter=0;} 
        catch(NumberFormatException e){counter=0;} 
    } 
 
    public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException{ 
        counter++; 
        res.setContentType("text/html"); 
        PrintWriter out=res.getWriter(); 
        out.println("<h1>Counter Program</h1>"); 
        out.println("Count is: "+counter); 
        // out.println("In this servlet, count will become 0, only when server is restarted.<BR>Even if the site is closed and opened again, the count will only increment!"); 
         
    } 
    public void destroy(){ 
        try{ 
            FileWriter fWriter=new FileWriter(fileName); 
            String cs=Integer.toString(counter); 
            fWriter.write(cs); 
            fWriter.close(); 
 
        }catch(IOException e){e.printStackTrace();} 
    } 
}
