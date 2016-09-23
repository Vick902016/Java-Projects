import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class Displayservlet extends HttpServlet
{
public void service(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
	PrintWriter out=response.getWriter();
	out.write("<html>");
	out.write("<head>");
	out.write("<title>This is my display servlet </title>");
	out.write("</head>");
	out.write("<body>");
	out.write("<h1> this is my first servlet program which I've written</h1><br>");
	out.write("</body>");
	out.write("</html>");
	}

}