package Dec_11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatement1 {
	
	/*Q)
	급여가 얼마 이상인 사원이거나 매니저아이디가 얼마 이상인 경우에 해당되는
	해당 사원의 이름, 봉급, 매니저아이디를 출력하는 JDBC 프로그램을 작성하시오
	(단, 매니저아이디가 null인 경우는 제외)
	prepare, alias 사용 (이름, 봉급, 매니저아이디)
	  
	DB 접속 성공
	봉급 얼마 이상 다 나와? 10000
	매니저 아이디 얼마 이상 다 나와? 150
	1	Neena	17000	100
	2	Lex	17000	100
	3	Nancy	12008	101
	4	Den	11000	100
	5	John	14000	100
	6	Karen	13500	100
	7	Alberto	12000	100
	8	Gerald	11000	100
	9	Eleni	10500	100
	10	Peter	10000	145
	11	Janette	10000	146
	12	Clara	10500	147
	13	Lisa	11500	148
	14	Harrison	10000	148
	15	Ellen	11000	149
	16	Michael	13000	100
	17	Pat	6000	201
	18	Hermann	10000	101
	19	Shelley	12008	101
	20	William	8300	205
	DB 접속 끝*/

	public static void main(String argsp[]) throws ClassNotFoundException, SQLException {
		Connection con = null;
		Scanner sc = new Scanner(System.in);
		
		Class.forName("oracle.jdbc.driver.OracleDriver"); // 드라이버 로딩

		// db접속
		con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "hr", "hr");
		// SID // user_id // password
		System.out.println("DB 접속 성공");
		
		System.out.print("봉급 얼마 이상 다 나와? ");
		int inputSalary = sc.nextInt();
		System.out.print("매니저 아이디 얼마 이상 다 나와? ");
		int inputManagerID = sc.nextInt();
		
		String sql = "SELECT first_name 이름, salary 봉급, manager_id 매니저아이디 "
				   + "FROM employees "
				   + "WHERE (salary >= ? or manager_id >= ?) "
				   + "and (manager_id is NOT NULL)";
		
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setInt(1, inputSalary);
		pst.setInt(2, inputManagerID);
		ResultSet rs = pst.executeQuery();
		
		while(rs.next()) {
			String fname = rs.getString("이름");
			/////////////////alias 있으면 반드시 활용 ////// 올 수 있는것 (참고 : 번째, 칼럼명, alias)
			int salary = rs.getInt("봉급");
			int managerID = rs.getInt("매니저아이디");
			
			System.out.println(rs.getRow() + "\t" + fname + "\t" + salary + "\t" + managerID);
		}
		
		sc.close();
		con.close();
		System.out.println("DB 접속 끝");
	}
}
