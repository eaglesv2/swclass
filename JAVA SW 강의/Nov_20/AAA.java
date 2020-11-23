package Nov_20;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AAA extends JFrame{

	private JFrame frame;
	private JTextField txtId;
	private JTextField txtPassword;

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
			public void mouseClicked(MouseEvent e) {
				dispose();
				setVisible(false);
				String id=txtId.getText(); ////////////////
				String pw=txtPassword.getText(); 
				new BBB(id,pw).setVisible(true); 
			}
		});
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 24));
		btnNewButton.setBounds(116, 74, 192, 37);
		frame.getContentPane().add(btnNewButton);
		
		txtId = new JTextField();
		txtId.setHorizontalAlignment(SwingConstants.CENTER);
		txtId.setBounds(143, 139, 125, 21);
		frame.getContentPane().add(txtId);
		txtId.setColumns(10);
		
		txtPassword = new JTextField();
		txtPassword.setBounds(143, 180, 125, 21);
		frame.getContentPane().add(txtPassword);
		txtPassword.setColumns(10);
		
		JTextArea txtrId = new JTextArea();
		txtrId.setBackground(Color.LIGHT_GRAY);
		txtrId.setText("ID");
		txtrId.setBounds(40, 138, 78, 24);
		frame.getContentPane().add(txtrId);
		
		JTextArea txtrPassword = new JTextArea();
		txtrPassword.setBackground(Color.LIGHT_GRAY);
		txtrPassword.setText("PASSWORD");
		txtrPassword.setBounds(40, 179, 78, 21);
		frame.getContentPane().add(txtrPassword);
	}
}
