import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

public class session extends HttpServlet
{
    protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
    {
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        String heading="Rishi";
        HttpSession session=request.getSession(true);
        Integer accessCount=(Integer) session.getAttribute("accessCount");
        if(accessCount==null)
        {
            accessCount=0;
            heading = "Welcome, Newbiee";
        }
        else
        {
            heading="Hey, Welocme Back";
            accessCount++;
        }
        session.setAttribute("accessCount",accessCount);
        out.println("<html><body>" + heading + "<br>" + session.getId() + "<br>" + session.getCreationTime() +"<br>" + session.getMaxInactiveInterval() + "<br>" + accessCount +"</body></html>" );
        
    }
}