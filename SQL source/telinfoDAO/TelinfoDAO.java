package telinfoDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import telinfoDBConn.TelinfoDBConn;

public class TelinfoDAO { //TelinfoDAO.java
	
	
	private Connection con;
	PreparedStatement pst = null;
	ResultSet rs = null;
	
	public TelinfoDAO() throws ClassNotFoundException, SQLException { //생성자  ,  특징 : 제일 먼저 수행되는 것
		con = new TelinfoDBConn().getCon(); // dao쪽에서 다른쪽에 있는 객체 con을 get(접속객체)
	}
	public void pstClose() throws SQLException {
		if(pst != null)
			pst.close();
	}
	public void getAllinfoClose() throws SQLException {
		if(rs != null)
			rs.close();
		if(pst != null) 
			pst.close();
		if(con != null)
			con.close();
	}
}
