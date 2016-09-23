import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class displayservletprogram extends HttpServlet
{
public void service(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
	PrintWriter out=response.getWriter();
	out.write("<html>");
	out.write("<head>");
	out.write("<title>Servlet Test </title>");
	out.write("</head>");
	out.write("<body>");
	out.write("<h1> Welcome to my Servlet program</h1><br>");
	out.write("</body>");
	out.write("</html>");
	}

}