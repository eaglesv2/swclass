package Dec_11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Select1 {
	public static void main(String args[]) throws ClassNotFoundException, SQLException {
		Connection con = null;
		Scanner sc = new Scanner(System.in);
		Class.forName("oracle.jdbc.driver.OracleDriver"); // 드라이버 로딩

		// db접속
		con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "hr", "hr");
		// SID // user_id // password
		System.out.println("DB 접속 성공");
		
		String sql = "select id, name, tel, TO_CHAR(d, 'yyyy \"년\" mm \"월\" dd\"일\" hh24:mi:ss')"
				   + " from TelTable5"
				   + " where name = ?";
		
		PreparedStatement pst = con.prepareStatement(sql);
		
		System.out.print("검색할 이름 : ");
		String inputName = sc.next();
		pst.setString(1, inputName);
		
		ResultSet rs = pst.executeQuery(); //TO_CHAR 때문에 종이상자에 문자형태로 날짜 및 시간이 들어가 있다
		while(rs.next()) {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			String tel = rs.getString("tel");
			String strD = rs.getString(4); //import java.util.Date;  //////문자로 처리
			System.out.println(rs.getRow() + id + "\t" + name + "\t" + tel + "\t" + strD);
		}
		con.close();
		System.out.println("DB 접속 끝");
	}
}
