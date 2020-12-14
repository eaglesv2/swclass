package Dec_10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class jdbc {
	public static void main(String args[]) throws ClassNotFoundException, SQLException {
		Connection con = null; //접속 객체 con 선언
		Class.forName("oracle.jdbc.driver.OracleDriver"); //드라이버 로딩
		
		//db접속
		con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "hr","hr"); 
											// SID     // user_id     // password
		
		System.out.println("DB 접속 성공");
	}
}
