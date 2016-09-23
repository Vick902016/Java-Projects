import java.util.*;
import javax.naming.*;
import javax.sql.*;
import java.sql.*;

public class connectionpool{
	public static void main(String args [])throws Exception{
		Hashtable h=new Hashtable();
		h.put(Context.INITIAL_CONTEXT_FACTORY,"weblogic.jndi.WLInitialContextFactory");
		h.put(Context.PROVIDER_URL,"t3://localhost:7001");
		h.put(Context.SECURITY_PRINCIPAL,"weblogic");
		h.put(Context.SECURITY_CREDENTIALS,"12345678");
		InitialContext ic=new InitialContext(h);
		DataSource ds=(DataSource)ic.lookup("myconnpool");
		Connection con = ds.getConnection();
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from Records");
		while (rs.next())
			{
 		System.out.println(rs.getString(1));
			
	}
	}
	}
