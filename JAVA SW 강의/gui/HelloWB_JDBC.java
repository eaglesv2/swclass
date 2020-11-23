package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/*
	자바  <-----> DB
	   드라이버 프로그램 (ojdbc.jar)

*/




public class HelloWB_JDBC extends JFrame{

	private JFrame frame;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextArea textArea;
	private JButton btnNewButton; // 전역

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HelloWB_JDBC window = new HelloWB_JDBC();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public HelloWB_JDBC() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 447, 496);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("검색할 이름");
		lblNewLabel.setBounds(22, 10, 69, 33);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBackground(new Color(0, 255, 204));
		textField.setBounds(96, 16, 116, 21);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		btnNewButton = new JButton("검색");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnNewButton) { // 버튼이 눌러졌으면~
						try {
							kaja();
						} catch (ClassNotFoundException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
				}//if-end
			}//actionPerformed-end

			private void kaja() throws ClassNotFoundException, SQLException {
				textArea.setText("");
				textField_1.setText("");;
				Connection con = null;
				
				Class.forName("oracle.jdbc.driver.OracleDriver");
				con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "hr", "hr");
				textField_1.setText("db에 접속되었습니다");
				
				
				String sq1 = "select first_name, last_name, phone_number"
							+ " from employees"
							+ " where first_name = ?";
				
				PreparedStatement st = con.prepareStatement(sq1);
				
				st.setString(1,textField.getText()); //여기까지 준비하고
				
				ResultSet rs = st.executeQuery();;
							 // String str1 = "";
				
				
				String str1 = String.format("%20s\t%25s\n\n", "[이  름]", "[전 화 번 호]");
				if(rs.next()) {
					do {
						String fname = rs.getString(1); //first name
						String lname = rs.getString(2); //last name
						String phone = rs.getString(3); //phone
						
						str1 += String.format("%-20s%-20s%-20s\n", fname,lname,phone);
					} while (rs.next());
				}else {
					textArea.setText("그런 이름은 없습니다");
		 	    	con.close();
		 	    	//tf2.setText("db접속해제");
				}
			}//kaja-end
			
			public void keyPressed(KeyEvent e1) throws ClassNotFoundException, SQLException {// 3개 추가(Key event)
				if (e1.getKeyCode() == KeyEvent.VK_ENTER) { /// enter 이면
					kaja();
				}
			}

			public void keyReleased(KeyEvent e1) {// 3개 추가(Key event)

			}

			public void keyTyped(KeyEvent e1) { // 3개 추가(Key event)

			}

			// }
		});
		btnNewButton.setBounds(302, 15, 97, 23);
		frame.getContentPane().add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(32, 58, 366, 320);
		frame.getContentPane().add(scrollPane);
		
		textArea = new JTextArea();
		textArea.setBackground(new Color(204, 153, 255));
		scrollPane.setViewportView(textArea);
		
		textField_1 = new JTextField();
		textField_1.setBackground(new Color(255, 153, 153));
		textField_1.setBounds(32, 403, 367, 23);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
	}
}
