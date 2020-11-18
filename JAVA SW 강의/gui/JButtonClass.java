package gui;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;



public class JButtonClass extends JFrame{ //JButtonClass.java
				//창문은 기본으로 닫힘
			//int aa;
			//JButton jb1; //속성, 필드선언
	JButton jb1 = new JButton("사과");
	JButton jb2 = new JButton("배");
	JButton jb3 = new JButton("감");
	JButton jb4 = new JButton("귤");
	JButton jb5 = new JButton("포도");
	JButton jb6 = new JButton("자두");

	public JButtonClass() { //생성자 - start
		getContentPane().setBackground(Color.GREEN); //배경색
		getContentPane().setLayout(new FlowLayout());; 
									//중앙정렬 - 가로로 배치
		getContentPane().add(jb1);
		getContentPane().add(jb2);
		getContentPane().add(jb3);
		getContentPane().add(jb4);
		getContentPane().add(jb5);
		getContentPane().add(jb6);
	}//생성자 - end
	
	public static void main(String args[]) {
		
		JButtonClass jbc1 = new JButtonClass(); //먼저 생성자로
		
		jbc1.setTitle("버튼이야"); //객체.메소드()
		jbc1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//이것 안하면 x버튼으로 창문을 닫아도 프레임은 종료되지만
		//실행 프로그램은 아직 종료 전임
		//이걸 써주면 프레임 닫고 + 실행 프로그램 종료
		
		jbc1.setSize(200,200);
		jbc1.setVisible(true);
	}
}

/*
		swing (4개의 pane)
		JFrame
		  +----------------------------+
		  |			   메뉴바		       |
		  +----------------------------+
		  |	   버튼, 글상자 -> component	   |
		  |		  (content pane)       |
		  +----------------------------+
		  jdk 1.5이전에는 반드시 contentpane 사용
		  이후 사용안하고 JFrame - 컴포넌트를 배치해도 됨
		  (알아서 contentpane 인식)
*/












