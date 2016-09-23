import java.sql.*;
public class databaseprogram{
public static void main(String args []) throws Exception
	
{
	
Class.forName("oracle.jdbc.driver.OracleDriver");
System.out.println("Driver is register");

Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
"system","tiger");
System.out.println(con);

Statement stmt=con.createStatement();


stmt.executeUpdate("create table Records(eno number(5),First Name varchar2(20), Last Name varchar2(20), Salary number(5))");

int a=stmt.executeUpdate("insert into Records values(1,'vaibhav' 'Kothari' 55000)");

}
}
