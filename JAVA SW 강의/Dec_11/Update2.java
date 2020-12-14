package Dec_11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Update2 {
	public static void main(String args[]) throws ClassNotFoundException, SQLException {
		Connection con = null;
		Scanner sc = new Scanner(System.in);
		Class.forName("oracle.jdbc.driver.OracleDriver"); // 드라이버 로딩

		// db접속
		con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "hr", "hr");
		// SID // user_id // password
		System.out.println("DB 접속 성공");
		
		String sql = "update TelTable5 set tel = ?, name = ?"
				   + " where id = ?";
		PreparedStatement pst = con.prepareStatement(sql);
		
		System.out.print("수정하기 위해 검색할 아이디는? : ");
		int updateID = sc.nextInt();
		System.out.println("변경 후 이름은? : ");
		String changeName = sc.next();
		System.out.println("변경 후 전화번호는? : ");
		String changeTel = sc.next();
		
		pst.setString(1, changeName);
		pst.setString(2, changeTel);
		pst.setInt(3, updateID);
		
		
		//행수
		int rowcnt = pst.executeUpdate(); //executeQuery() x
			//dml : insert, update, delete 할 시 전부 executeUpdate()
		System.out.println(rowcnt + "행 update");
		con.close();
		System.out.println("DB 접속 끝");
	}
}
