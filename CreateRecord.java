import java.sql.*;
public class CreateRecord{
public static void main(String ar[]) throws Exception{
	
Class.forName("oracle.jdbc.driver.OracleDriver");
System.out.println("Driver is register");

Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
"system","tiger");
System.out.println(con);

Statement stmt=con.createStatement();

stmt.executeUpdate("create table Vick2 (eno number(5),ename varchar2(20))");

int x=stmt.executeUpdate("insert into Vick2 values(3489,'Vaibhav Kothari')");
System.out.println(x);
int y=stmt.executeUpdate("insert into Vick2 values(4532,'Vaibhav')");
System.out.println(y);
int z=stmt.executeUpdate("insert into Vick2 values(236,'Kothari')");
System.out.println(z);
int a=stmt.executeUpdate("delete from Vick2 where  eno=236");
System.out.println(a);

}
}
