
package main;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBConnection {
    private static Connection con = null;

	static
	{
		String url = "jdbc:mysql:// localhost:3306/chat_application";
		String user = "root";
		String pass = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, user, pass);
		}
		catch (ClassNotFoundException | SQLException e) {
		}
	}
	public static Connection getConnection()
	{
		return con;
	}
    
}


