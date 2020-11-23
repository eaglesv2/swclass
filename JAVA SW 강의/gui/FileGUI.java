package gui;

import java.awt.*;
import java.awt.event.*;
import java.io.*;


class FileGUI2 extends Frame implements ActionListener{
	private Button b2 = new Button("파일READ");
	private Button b3 = new Button("파일SAVE");
	private TextArea ta1 = new TextArea();// multi line row ,col

	public FileGUI2() { // 생성자
		this.setLayout(null);///////////////////

		b2.setSize(100, 70);// 버튼 크기
		b2.setForeground(new Color(255, 255, 255));
		b2.setBackground(new Color(0, 0, 255));
		b2.setFont(new Font("돋움", Font.BOLD, 20));
		b2.setLocation(350, 200); // 버튼 내부위치
		this.add(b2);// 버튼 추가
		b2.addActionListener(this); //////////////////

		b3.setSize(100, 70);// 버튼 크기
		b3.setForeground(new Color(255, 255, 255));
		b3.setBackground(new Color(0, 0, 255));
		b3.setFont(new Font("돋움", Font.BOLD, 20));
		b3.setLocation(350, 300); // 버튼 내부위치
		this.add(b3);// 버튼 추가
		b3.addActionListener(this); //////////////////

		ta1.setSize(300, 340);// 크기
		ta1.setForeground(new Color(0, 0, 255));
		ta1.setBackground(new Color(255, 255, 0));
		ta1.setFont(new Font("돋움", Font.BOLD, 20));
		ta1.setLocation(20, 40); // 내부위치
		this.add(ta1);// 추가

		this.setBackground(new Color(0, 200, 0));
		this.setTitle("나의 멋있는 메모장~~~~~~~ !!!!!!");
		this.setSize(460, 400); // 프레임 크기
		this.setVisible(true);
		addWindowListener(new WindowAdapter() { //////////////////
			public void windowClosing(WindowEvent e1) {
				dispose();
				System.exit(0);
			}
		});
	}// 생성자 -end
	  
	/*
	    * 윈도우\r\n으로 저장(비주얼베이직 : chr(10)+chr(13))
	    * 타자기에서 유래 (carriage return + lineskip)
	    * 리눅스 \n으로 저장 윈도우c -> 리눅스 c ^M 때문에 (이유:\r이 표현된것)
	    * s명령으로 change 해주어야함 (
	    * substitute : 대치하다 ) 리눅스 c -> 윈도우 c 는 줄바꿈 안됨
	 */
	
	@Override
	public void actionPerformed(ActionEvent e1) {
		if(e1.getSource() == b2) { //읽기버튼
			String fileData = "";
			FileDialog fd1 = new FileDialog(this, "파일READ", FileDialog.LOAD); //aa.txt
			fd1.setVisible(true);
			
			String dirfile1 = fd1.getDirectory() + fd1.getFile();
			//내가 읽을려고 선택한 파일의 경로
			try {
				FileReader fr = new FileReader(dirfile1); //open
				BufferedReader br = new BufferedReader(fr);
				String s;
				while((s=br.readLine()) != null) {
					fileData +="\n"; //텍스트 에어리어 넣을려고
				}
				ta1.setText(fileData);; //텍스트 에어리어 출력
				br.close(); fr.close();
			} catch(Exception e) {
				System.out.println("error");
			}
		} /*if-end*/ else if(e1.getSource() == b3) {
			FileDialog fd2 = new FileDialog(this, "파일SAVE", FileDialog.SAVE);
			fd2.setVisible(true);
			String dirfile2 = fd2.getDirectory() + fd2.getFile();
			
			String fileData2 = ta1.getText().replace("\n", "\r\n");
			try {
				FileWriter fw = new FileWriter(dirfile2);
				PrintWriter pw = new PrintWriter(fw);
				pw.println(fileData2);
				pw.close(); fw.close();
			} catch(Exception e) {
				System.out.println("error");
			}
		}
		
	}
}

public class FileGUI { //FileGUI.java
	public static void main(String args[]) {
		new FileGUI2();
	}
}
