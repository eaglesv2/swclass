package Nov_23;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AAA extends JFrame {

	private JFrame frame;
	private JTextField txtID;
	private JTextField txtPW;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AAA window = new AAA();
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
	public AAA() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("인자갖고가자");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				dispose(); //지금창 해제   프레임을 닫는건
				setVisible(false);
				String id = txtID.getText();
				String pw = txtPW.getText();
				new FF(id,pw).setVisible(true);
				// (1) FF는 textField 하나 만들고 시작
				// (2) AAA에서 new FFF() 빨간줄 나오면 change .. 선택
				// 	     그러면 FF가 자동으로 고쳐진다
				// (3) 이때 FF에서 textField.setText(id + ", " + pw); 추가
				// (4) 또한 main의 FF()에 빨간줄 나오면 
				//	   FF(인자) {} 아래에 다음처럼 디폴트 하나 생성한다
				//  public FF() {}
			}
		});
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 24));
		btnNewButton.setBounds(86, 95, 188, 43);
		frame.getContentPane().add(btnNewButton);
		
		JTextArea txtrId = new JTextArea();
		txtrId.setBackground(Color.LIGHT_GRAY);
		txtrId.setText("ID");
		txtrId.setBounds(30, 160, 55, 24);
		frame.getContentPane().add(txtrId);
		
		JTextArea txtrPw = new JTextArea();
		txtrPw.setBackground(Color.LIGHT_GRAY);
		txtrPw.setText("PW");
		txtrPw.setBounds(30, 194, 55, 24);
		frame.getContentPane().add(txtrPw);
		
		txtID = new JTextField();
		txtID.setBounds(111, 161, 116, 21);
		frame.getContentPane().add(txtID);
		txtID.setColumns(10);
		
		txtPW = new JTextField();
		txtPW.setColumns(10);
		txtPW.setBounds(111, 195, 116, 21);
		frame.getContentPane().add(txtPW);
	}
}
