package gui;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.AbstractListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class JListMainClass {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JListMainClass window = new JListMainClass();
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
	public JListMainClass() {
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
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(56, 35, 126, 87);
		frame.getContentPane().add(scrollPane);
		
		JList list = new JList();
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"C", "C++", "JAVA", "Python", "R", "C#", "Spring", "HTML", "CSS"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				if(e.getSource()==list) {
				int size = list.getModel().getSize(); //JList 전체갯수
				int index = list.getSelectedIndex(); //선택된 index
				String indexElement = (String)list.getModel().getElementAt(index);
				
				JOptionPane.showMessageDialog(null, "전채 갯수는 " + String.valueOf(size) + " 선택 element는 " + indexElement);
				}
			}
		});
		list.setVisibleRowCount(5); //보이는 갯수 5개로 정한 결과
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setBackground(Color.ORANGE);
		scrollPane.setViewportView(list); ////////자동으로 생긴것
	}
}
