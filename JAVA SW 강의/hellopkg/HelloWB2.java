package hellopkg;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JToolBar;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextArea;

public class HelloWB2 {

	private JFrame frame;
	private JLabel lblNewLabel = new JLabel("   l LOVE YOU");
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HelloWB2 window = new HelloWB2();
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
	public HelloWB2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 574, 467);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(67, 48, 407, 73);
		frame.getContentPane().add(toolBar);
		
		JButton button = new JButton("");
		button.setToolTipText("red");
		button.addMouseListener(new MouseAdapter() { //마우스(이벤트) 등록 메소드 
			@Override								 //MouseAdapter - 마우스 메소드 중 1개만 사용하게 하는 것
			public void mouseClicked(MouseEvent e) {
				lblNewLabel.setForeground(Color.RED); //객체.메소드
			}
		});
		button.setIcon(new ImageIcon(HelloWB2.class.getResource("/images/Cat1.png")));
		toolBar.add(button);
		
		JButton button_1 = new JButton("");
		button_1.setToolTipText("green");
		button_1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				lblNewLabel.setForeground(Color.GREEN); //초록으로 변경
			}
		});
		button_1.setIcon(new ImageIcon(HelloWB2.class.getResource("/images/Text1.png")));
		toolBar.add(button_1);
		
		JButton button_2 = new JButton("");
		button_2.setToolTipText("더작게");
		button_2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				lblNewLabel.setFont(lblNewLabel.getFont().deriveFont(12.0F));
									//new Font("굴림",Font.PLAIN,30)
			}
		});
		button_2.setIcon(new ImageIcon(HelloWB2.class.getResource("/images/Stop1.png")));
		toolBar.add(button_2);
		
		JButton button_3 = new JButton("");
		button_3.setToolTipText("더크게");
		button_3.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				lblNewLabel.setFont(lblNewLabel.getFont().deriveFont(24.0F));
			}
		});
		button_3.setIcon(new ImageIcon(HelloWB2.class.getResource("/images/Weather1.png")));
		toolBar.add(button_3);
		
		JButton button_4 = new JButton("");
		button_4.setToolTipText("실행끝");
		button_4.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		button_4.setIcon(new ImageIcon(HelloWB2.class.getResource("/images/Play1.png")));
		toolBar.add(button_4);
		
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 16));
		lblNewLabel.setBounds(52, 131, 459, 94);
		frame.getContentPane().add(lblNewLabel);
	}
}
