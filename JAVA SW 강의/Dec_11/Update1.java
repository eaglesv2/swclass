package Dec_11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Update1 {
	public static void main(String args[]) throws ClassNotFoundException, SQLException {
		Connection con = null;
		Scanner sc = new Scanner(System.in);
		Class.forName("oracle.jdbc.driver.OracleDriver"); // 드라이버 로딩

		// db접속
		con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "hr", "hr");
		// SID // user_id // password
		System.out.println("DB 접속 성공");
		
		String sql = "update TelTable5 set tel = ?"
				   + " where name = ?";
		PreparedStatement pst = con.prepareStatement(sql);

		System.out.print("수정하기 위해 검색할 이름은? : ");
		String updateName = sc.next();
		System.out.print("변경 후 전화본호는? : ");
		String changeTel = sc.next();
		pst.setString(1, updateName);
		pst.setString(2, changeTel);
		
		
		//행수
		int rowcnt = pst.executeUpdate(); //executeQuery() x
			//dml : insert, update, delete 할 시 전부 executeUpdate()
		System.out.println(rowcnt + "행 update");
		con.close();
		System.out.println("DB 접속 끝");
	}
}
