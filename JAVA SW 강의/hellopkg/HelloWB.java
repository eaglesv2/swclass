package hellopkg;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HelloWB extends JFrame {

	private JPanel contentPane;
	JLabel lblNewLabel; //전역 변수 선언
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HelloWB frame = new HelloWB();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public HelloWB() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 457, 330);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNooler = new JButton("눌러봐~");
		btnNooler.addActionListener(new ActionListener() { //액션 등록하는 메소드
			public void actionPerformed(ActionEvent e) {
				//이벤트할 내용이 들어가는 자리
				lblNewLabel.setText("Hellow WB"); //객체.메소드
			}
		});
		btnNooler.setBackground(Color.ORANGE);
		btnNooler.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		btnNooler.setBounds(73, 81, 300, 141);
		contentPane.add(btnNooler);
		
		lblNewLabel = new JLabel(""); //JLabel lblNewLabel = new JLabel(""); 는 지역변수 선언 / 이 외 지역에선 사용할 수 없음
		lblNewLabel.setBackground(Color.MAGENTA);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		lblNewLabel.setBounds(113, 10, 227, 60);
		contentPane.add(lblNewLabel);
	}
}
