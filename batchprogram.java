import java.sql.*;
public class batchprogram{
public static void main(String args[]) throws Exception{
Class.forName("oracle.jdbc.driver.OracleDriver");
System.out.println("Driver is register");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
"system","tiger");
System.out.println(con);
Statement stmt=con.createStatement();
String query1="insert into Records values (1,'vaibhav' 'Kothari' 55000)";
String query2="insert into Records values (2,'John' 'paxton' 550000)";
String query3="insert into Records values (3,'Linda' 'Cardellini' 780040)";
String query4="insert into Records values (4,'Bill' 'Nestor' 34000)";
String query5="insert into Records values (5,'Josh' 'Radner' 54000)";
String query6="insert into Records values (6,'Nicole' 'Anniston' 73000)";
String query7="insert into Records values (7,'Tori' 'White' 91000)";
String query8="insert into Records values (8,'Jennifer' 'Green' 89000)";
String query9="insert into Records values (9,'Seth' 'Rogen' 55000)";
String query10="insert into Records values (10,'Rachael' 'Gellar' 43000)";
String query11="insert into Records values (11,'Ross' 'Chandler' 50000)";
String query12="insert into Records values (12,'Joey' 'Perry' 75000)";
String query13="insert into Records values (13,'Lisa' 'Kudrow' 59000)";
String query14="insert into Records values (14,'Matt' 'Blanc' 23000)";
String query15="insert into Records values (15,'Matthew' 'Black' 47000)";
String query16="insert into Records values (16,'Juilliane' 'Moore' 67000)";
String query17="insert into Records values (17,'Nargis' 'Fakhri' 70000)";
String query18="insert into Records values (18,'Margot' 'Robbie' 68000)";
String query19="insert into Records values (19,'Jared' 'Leto' 855000)";
String query20="insert into Records values (20,'Will' 'Smith' 92000)";
stmt.addBatch(query1);
stmt.addBatch(query2);
stmt.addBatch(query3);
stmt.addBatch(query4);
stmt.addBatch(query5);
stmt.addBatch(query6);
stmt.addBatch(query7);
stmt.addBatch(query8);
stmt.addBatch(query9);
stmt.addBatch(query10);
stmt.addBatch(query11);
stmt.addBatch(query12);
stmt.addBatch(query13);
stmt.addBatch(query14);
stmt.addBatch(query15);
stmt.addBatch(query16);
stmt.addBatch(query17);
stmt.addBatch(query18);
stmt.addBatch(query19);
stmt.addBatch(query20);
stmt.executeBatch();
}
}
