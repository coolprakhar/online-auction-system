import java.sql.*;
class ms{ 


public static void main(String args[]){

try
{
	
	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

	
	Connection con = DriverManager.getConnection("jdbc:odbc:MyJiet");

	Statement stmt = con.createStatement();

	String query = "SELECT * FROM MyJiet";
	ResultSet rs = stmt.executeQuery(query);
      
       while(rs.next()){
       System.out.println("Row No: "+rs.getRow());
       System.out.println(rs.getString("Name")+" "+rs.getInt(2)+" "+rs.getInt(3)+" "+rs.getString(4));
        }//While loop ends
      
       stmt.executeUpdate("update MyJiet set age=88");

       //stmt.executeUpdate("insert into MyJiet values('Rajesh',23,34,'Phy')");
     
      // stmt.executeUpdate("delete from MyJiet where name='pp'");
      //   stmt.executeUpdate("create table ThisJiet(Name char(10))");
   
       con.close();
         
}

catch (Exception se) {System.out.println(se.getMessage());}
}
}


