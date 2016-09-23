import java.sql.*;
public class insertrecordtwo{
public static void main(String args[]) throws Exception{
	
Class.forName("oracle.jdbc.driver.OracleDriver");
System.out.println("Driver is register");

Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
"system","tiger");
System.out.println(con);

Statement stmt=con.createStatement();

PreparedStatement pstmt=con.prepareStatement("select * from victor where  eno=?");
pstmt.setInt(1,32);
//This result set statement is used to retrive data within command prompt
ResultSet rs=pstmt.executeQuery();

while(rs.next()){
	int no=rs.getInt("eno");
	System.out.println(no);
	String name=rs.getString("ename");

System.out.println(name);

}

}
}
