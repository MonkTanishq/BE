import java.io.*;  
import javax.servlet.*;  
import javax.servlet.http.*;  
import java.util.*;  
  
public class showHeader extends HttpServlet 
{    
    public void doPost(HttpServletRequest request , HttpServletResponse response) throws IOException, ServletException 
    {  
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("Data is read by <b>'Enumeration getParameterNames()'</b> method<br>");
        Enumeration em = request.getParameterNames();
        while (em.hasMoreElements()) 
        {
            String headerName = (String) em.nextElement();
            String headerValue = request.getParameter(headerName);
            out.print("<b>"+headerName + "</b>  :    ");
            out.println(headerValue + "<br>");
        }
    }
}