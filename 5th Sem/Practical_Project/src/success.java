import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.sql.*;

public class success extends HttpServlet
{
    public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
    {
        try
        {
            PrintWriter out=response.getWriter();
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/rishi","root","Jee@15421");

            String n=request.getParameter("uName1");
            String p=request.getParameter("uPass1");

            PreparedStatement ps=con.prepareStatement("insert into login(uName,password) " + "values(?,?)");
            ps.setString(1 , n);
            ps.setString(2 , p);

            int rs=ps.executeUpdate();
            if(rs==1)
            {
                RequestDispatcher rd=request.getRequestDispatcher("successSignUp.jsp");
                rd.forward(request,response);
            }
            else
            {
                out.println("<font color=red size=18> Sign-Up Failed!!<br>");
                out.println("<a href=newUser.jsp> Try AGAIN!!</a>");

            }
        }
        catch(ClassNotFoundException e)
        {
            System.out.println(e);
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
    }
}