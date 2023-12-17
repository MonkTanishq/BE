import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class secondServlet extends HttpServlet
{
    public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
    {
        try
        {
            response.setContentType("text/html");
            PrintWriter out=response.getWriter();

            Cookie ck[]=request.getCookies();
            for(int i=0;i<ck.length;i++)
            out.println("HELLO " + ck[i].getName() + " " + ck[i].getValue() + "<br>");
            out.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}