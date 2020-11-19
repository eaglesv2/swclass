package gui;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class JComboBoxMainClass {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JComboBoxMainClass window = new JComboBoxMainClass();
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
	public JComboBoxMainClass() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 585, 454);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				if(e.getSource()==comboBox) { //발생하는 모든 이벤트중에서 콤보박스에서 이벤트가 발생하면
					//JOptionPane.showMessageDialog(null,(String) comboBox.getSelectedItem());
													//정가운데에 대화상자
					JOptionPane.showMessageDialog(comboBox,(String) comboBox.getSelectedItem());
													//부모 자리에 대화상자
				}
			}
		});
		comboBox.setFont(new Font("굴림",Font.BOLD,18));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"구두", "옷", "가방", "악세서리"}));
		comboBox.setBounds(175, 10, 182, 45);
		frame.getContentPane().add(comboBox);
	}

}
