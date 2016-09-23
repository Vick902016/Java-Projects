import java.sql.*;
 
 
 class BatchUpdate2
	 {
public static void main(String args[]) throws Exception
	{
Class.forName("oracle.jdbc.driver.OracleDriver");
System.out.println("Driver is register");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",

"system","tiger");
System.out.println(con);
Statement stmt=con.createStatement();
ResultSet objResultSet= stmt.executeQuery("select  * from victor");
ResultSetMetaData rsmd=objResultSet.getMetaData();
for(int i=1;i<=rsmd.getColumnCount();i++)
	{
	System.out.println("colum name" +rsmd.getColumnName(i));
	switch(rsmd.getColumnType(i)){
		case Types.VARCHAR:
			System.out.println("VARCHAR");
		break;
		case Types.NUMERIC:
			System.out.println("NUMERIC");
		break;
	}
	}

}
 

	 }
