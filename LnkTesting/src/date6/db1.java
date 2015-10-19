package date6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class db1 {

	public static void main(String[] args) throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException{
	
   Connection conn=null;
   String url="jdbc:mysql://localhost:3306/";
   String dbname="test";
   String dbdriver="com.mysql.jdbc.driver";
   String username="root";
   String password="root";
   Class.forName(dbdriver).newInstance();
   conn=DriverManager.getConnection(url+dbname,username,password);
   PreparedStatement psmt=conn.prepareStatement("select * from emp where sal>? and dept no=?");
   psmt.setString(1, "2000");
   psmt.setString(2, "10");
   ResultSet rs=psmt.executeQuery();
   while(rs.next())
   {
	   for(int i=1;i<=8;i++)
	   {
		   System.out.print(rs.getString(i)+" ");
	   }
	   System.out.println();
	   
	   }
   conn.close();
   
   }
     

}


