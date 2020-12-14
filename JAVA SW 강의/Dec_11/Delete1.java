package Dec_11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Delete1 {
	public static void main(String args[]) throws ClassNotFoundException, SQLException {
		Connection con = null;
		Scanner sc = new Scanner(System.in);
		Class.forName("oracle.jdbc.driver.OracleDriver"); // 드라이버 로딩

		// db접속
		con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "hr", "hr");
		// SID // user_id // password
		System.out.println("DB 접속 성공");
		
		String sql = "delete from TelTable5 where id = ?";
		PreparedStatement pst = con.prepareStatement(sql);
		
		System.out.print("몇번 아이디를 삭제하시겠습니까? : ");
		int deleteID = sc.nextInt();
		pst.setInt(1, deleteID);
		
		
		//행수
		int rowcnt = pst.executeUpdate(); //executeQuery() x
			//dml : insert, update, delete 할 시 전부 executeUpdate()
		System.out.println(rowcnt + "행 delete");
		con.close();
		System.out.println("DB 접속 끝");
	}
}
