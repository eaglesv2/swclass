package Dec_11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JOptionPane;

public class Insert1 {
	public static void main(String args[]) throws ClassNotFoundException, SQLException {
		Connection con = null;
		
		Class.forName("oracle.jdbc.driver.OracleDriver"); // 드라이버 로딩

		// db접속
		con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "hr", "hr");
		// SID // user_id // password
		System.out.println("DB 접속 성공");
		
		//자료 insert(여기서 시간을 넣기 위해 날짜 시간을 stringformat을 사용하여 to_date()를 통해 날짜시간 입력)
		String sql = "insert into TelTable5 values(?,?,?,to_date(?,'yyyy/mm/dd hh24:mi:ss'))";
		PreparedStatement pst = con.prepareStatement(sql);
		
		//GUI
		int id = Integer.parseInt(JOptionPane.showInputDialog("아이디는? "));
		String name = JOptionPane.showInputDialog("이름은? ");
		String tel = JOptionPane.showInputDialog("전화번호는? ");
		//String hire_date = JOptionPane.showInputDialog("입사일은? ");
		// 자료를 입력받아 DB로
		
		//오늘 날짜 및 시간을 입력으로 처리 : 문자로 받은것 insert 시 날짜로 변환
		//(1) format으로 형식을 디자인 (날짜+시간)
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd kk:mm:ss"); // 형식을 준비
		String sDate = sdf.format(Calendar.getInstance().getTime()); // 그 형식에 오늘 날짜를 대입
				// "2020/12/11 20:06:23"
		// or (2)
		//SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd kk:mm:ss");
		//String sDate = sdf.format(new Date());
		
		// ==> 이것을 db로 보낼 때는 테이블 칼럼 d가 date로 선언되어있으므로
		//		sDate ==> date 로 변환    to_date()를 사용하여
		
		pst.setInt(1, id);
		pst.setString(2, name);
		pst.setString(3, tel);
		pst.setString(4, sDate);
		
		//행수
		int rowcnt = pst.executeUpdate(); //executeQuery() x
			//dml : insert, update, delete 할 시 전부 executeUpdate()
		System.out.println(rowcnt + "행 insert");
		con.close();
		System.out.println("DB 접속 끝");
	}
}
