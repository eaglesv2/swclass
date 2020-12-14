package Dec_11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.Statement;
import java.util.Scanner;

public class Connect1 {
	public static void main(String args[]) throws ClassNotFoundException, SQLException {
		Connection con = null; // 접속 객체 con 선언
		Scanner sc = new Scanner(System.in);
		Class.forName("oracle.jdbc.driver.OracleDriver"); // 드라이버 로딩

		// db접속
		con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "hr", "hr");
		// SID // user_id // password

		//System.out.println("DB 접속 성공");
		System.out.print("이름이 뭐에요? (대문자로) ");
		//String inputfname = sc.next();
		String moonja = sc.next();
		String sql = "select * from employees"
			//      + " where department_id = 30"; // 줄 바꾸면서 무조건 한칸 띄운다
			// + " where upper(first_name) = 'STEVEN'";
			//	+ " where upper(first_name) = ?"; // 전체 문장이 아직 결정 안된 상태
												  // 문법이 달라짐
			    + " where upper(first_name) like ?";
		PreparedStatement pst = con.prepareStatement(sql);
		//pst.setString(1, inputfname); // 첫번째 인자 : 몇번째 물음표야?
									    // 두번째 인자 : 물음표에 뭐 넣을거야?
		pst.setString(1, "%" + moonja + "%"); // moonja 가 들어간 이름 찾기
		//Statement st = con.createStatement();
		// import시 sql로 ,  beans x
		// 접속객체 con ,  문장객체 st
		// 연동 2가지 방법
		// createStatemnet
		ResultSet rs = pst.executeQuery();
			/*종이박스에 들어감   <=  107줄이 다 검색이 되면서*/
		
		while(rs.next()) { //data가 있어?
			int id = rs.getInt("employee_id"); //100
				//int id = rs.getInt(1);
			String fname = rs.getString("first_name"); //Steven
				// String fname = rs.getString(2);
			String lname = rs.getString("last_name");
			String h_date = rs.getString("hire_date"); //
			String hire_date = h_date.substring(0,10); // 날짜만 뽑아내는 것    뒤에 시간이 붙어 있을 수가 있음
				///// 2008-01-12
			
			System.out.println(rs.getRow() + "\t" + id + "\t" + fname + "\t" + lname + "\t" + hire_date);
		} // while-end
		
		sc.close();
		con.close();
		System.out.println("접속끝");
	}
}
