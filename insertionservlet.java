import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import java.io.*;

public class insertionservlet extends HttpServlet
{
	public void service(HttpServletRequest request, HttpServletResponse response)
	{
		PrintWriter out=response.getWriter();
			try{
			Driver d=new oracle.jdbc.driver.OracleDriver();
			DriverManager.registerDriver(d);
			System.out.println("Driver is register");
			//Getting the connection
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
"system","tiger");
System.out.println(con);

Statement stmt=con.createStatement();
//executing the query
PreparedStatement pstmt=con.prepareStatement("insert into victor values(?,?)");
pstmt.setInt(1,82);
pstmt.setString(2,"vicktr");
pstmt.executeUpdate();
		        }
		catch(SQLException s) {
			s.printStackTrace();
		}
	}
}