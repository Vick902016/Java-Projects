import javax.servlet.*;
import java.io.*;
public class Firstservlet implements Servlet 
{
	ServletConfig config;
	public void init(ServletConfig config)
	{
		this.config=config;
		System.out.println("--We're in init() method--");
	}
		public void service(ServletRequest request,ServletResponse response)
	{
			System.out.println("--We're in service() method--");
	}

	public void destroy()
	{
		System.out.println("--We're in destroy method()--");
	}
	public ServletConfig getServletConfig()
	{
		return config;
	}
	public String getServletInfo()
	{
		return("this is an servlet example");
	}

}