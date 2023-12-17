import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;


public class myservlet extends HttpServlet
{
	int cnt=0;
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	{
		res.setContentType("text/html");  
		PrintWriter pw=res.getWriter();  
		pw.println(++cnt);
		pw.close();
	}
}
