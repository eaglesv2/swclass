package gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

class JFileChooserClass extends JFrame implements ActionListener {

	JFileChooser jfilechooser1;/////////////////////
	JButton jbutton1, jbutton3;
	JLabel jlabel1;

	public JFileChooserClass() {// 생성자-start
		setLayout(new FlowLayout());

		jfilechooser1 = new JFileChooser("c:");/////////////

		jbutton1 = new JButton("파일 골라봐!!!!!");// 파일열기
		add(jbutton1);// contentPane 없어도 됨
		jbutton1.addActionListener(this);///// 이벤트 등록

		jbutton3 = new JButton("파일 저장!!!!!");
		add(jbutton3);
		jbutton3.addActionListener(this);///// 이벤트 등록

		jlabel1 = new JLabel("파일경로가 나오는 곳");
		add(jlabel1);

		setSize(700, 700);
		setVisible(true);
	}// 생성자-end

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == jbutton1) { // 파일열기 버튼이 눌러졌어?
			int isOpenClose = jfilechooser1.showOpenDialog(jbutton1);
			// 파일선택에 대한 반환값 //열기-윈도우탐색기

			File filePath1 = jfilechooser1.getSelectedFile();// 경로+파일

			// 정상적으로 파일 선택했어?
			if (isOpenClose == JFileChooser.APPROVE_OPTION) {
				// == 이 아니면 취소를 눌렀거나 다른 에러가 발생한 경우임
				jlabel1.setText("파일경로및이름:" + filePath1);// getText()참고
				System.out.println(filePath1);
			} // if-isOpenClose-end
		} // if-e.getSource()-end

		// -----------저장버튼 눌렀어?------------

		if (e.getSource() == jbutton3) {
			int isOpenClose3 = jfilechooser1.showSaveDialog(this);// save
			File file3 = jfilechooser1.getSelectedFile();// 경로+파일명
			// String fileString2 = jfilechooser1.getSelectedFile().getName();
			// ==> 파일이름만

			if (isOpenClose3 == JFileChooser.APPROVE_OPTION) {
				jlabel1.setText("파일경로및이름:" + file3);

				System.out.println(file3);
			} // if-end
		} // if-end
	}// actionPerformed-end
}// class-end

public class JFileChooserMainClass {
	// JFileChooserMainClass.java
	public static void main(String[] args) {
		new JFileChooserClass();////////////////

	}
}