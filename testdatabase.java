package fei;
import java.sql.*;

public class testdatabase{
	private static Connection getcon(){
		Connection con = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306","root", "0000");
			//System.out.println("success");
		}
		catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return con;
	}

/*public static void main(String[] args){
	getcon();
}*/
}