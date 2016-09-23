import java.sql.*;
public class BatchUpdate{
public static void main(String ar[]) throws Exception{
Class.forName("oracle.jdbc.driver.OracleDriver");
System.out.println("Driver is register");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
"system","tiger");
System.out.println(con);
Statement stmt=con.createStatement();
String query1="insert into victor values (1,'a')";
String query2="insert into victor values (2,'b')";
String query3="insert into victor values (3,'c')";
stmt.addBatch(query1);
stmt.addBatch(query2);
stmt.addBatch(query3);
stmt.executeBatch();
}
}
