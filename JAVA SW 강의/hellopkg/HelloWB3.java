package hellopkg;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class HelloWB3 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HelloWB3 window = new HelloWB3();
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
	public HelloWB3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 577, 485);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 10, 298, 165);
		frame.getContentPane().add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		textArea.setText("ㅇ\r\nㅇ\r\nㅇ\r\nㅇㅇ\r\n\r\nㅇ\r\nㅇ\r\nㅇ\r\nㅇ\r\nㅇ\r\nㅇ\r\nㅇ\r\nㅇ\r\nㅇ\r\nㅇ\r\nㅇ\r\nㅇ\r\nㅇ\r\nㅇ\r\nㅇ\r\nㅇ\r\nㅇ\r\nㅇ\r\nㅇ\r\nㅇ\r\nㅇ\r\nㅇ");
		scrollPane.setViewportView(textArea);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"야구", "축구", "농구", "배구"}));
		comboBox.setBounds(72, 237, 60, 38);
		frame.getContentPane().add(comboBox);
	}
}
