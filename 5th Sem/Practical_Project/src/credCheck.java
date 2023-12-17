import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.sql.*;

public class credCheck extends HttpServlet
{
    public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
    {
        try
        {
            PrintWriter out=response.getWriter();
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/rishi","root","Jee@15421");

            String n=request.getParameter("uName");
            String p=request.getParameter("uPass");

            PreparedStatement ps=con.prepareStatement("select uname from login where uname=? and password=?");
            ps.setString(1 , n);
            ps.setString(2 , p);

            ResultSet rs=ps.executeQuery();
            if(rs.next())
            {
                RequestDispatcher rd=request.getRequestDispatcher("welcome.jsp");
                rd.forward(request,response);
            }
            else
            {
                out.println("<div align='center'><font color=red> <h1>Login Failed!!</h1>");
                out.println("<a href=jdbcLogin.jsp><h3>Try AGAIN!!</h3></a></div>");

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