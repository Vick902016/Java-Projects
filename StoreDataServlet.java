import javax.servlet.http.*;
import javax.servlet.*;
public class StoreDataServlet extends HttpServlet{
	
	public void service (HttpServletRequest request,HttpServletResponse response){
	
		System.out.println("serveice() method is executing ");
		String no=request.getParameter("eno");
		String name=request.getParameter("ename");
		String addres=request.getParameter("addr");
		String phno=request.getParameter("phno");
		System.out.println("Eno"+no);
		System.out.println("Ename"+name);
		System.out.println("Addres"+addres);
		System.out.println("phoneno"+phno);
		System.out.println("jdbc code to store the data in database");
	}
}
