import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;


public class helloWorldn extends HttpServlet
{
	int cnt=1;
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	{
		res.setContentType("text/html");  
		PrintWriter pw=res.getWriter();
        for(int i=0;i<cnt;i++)
        {
            pw.println("<html> HELLO WORLD <br></html>");
        }
		cnt++;
		pw.close();
	}
}