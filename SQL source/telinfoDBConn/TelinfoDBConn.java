package telinfoDBConn;

import java.sql.*;

public class TelinfoDBConn { //TelinfoDBConn.java

	
	private Connection con; //접속 객체
	
	public Connection getCon() { // getter
		return con;
	}
	
	public TelinfoDBConn() throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "hr", "hr");	
	}
}
