package gui;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class GridLayoutMainClass extends Frame{ 
	
	public GridLayoutMainClass() { //생성자 
		//자동 주문 기계에서 화면 구성하기 //Grid : 격자
		this.setLayout(new GridLayout(2,3)); //2행 3열로
		//this.setLayout(new GridLayout(2,3,10,10));
		/*GridLayout(2,3,30,30)  2행3열이면서(좌우,상하)
								  간격은(30,30)*/
		//setLayout(null)은 개발자 임의대로 (absolute layout)
		//border , margin(component 사이의 간격) , padding(text와 border 사이의 간격)
		
		this.add(new Button("눌러봐"));
		this.add(new Button("골라봐"));
		this.add(new Button("웬열?"));
		this.add(new Button("뭥미?"));
		this.add(new Button("뭘 눌러?"));
		this.add(new Button("아무거나"));
		//this.add(new Button("아무거나2"));
		this.setSize(300,300);
		this.setVisible(true);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e1) {
			dispose();
			System.exit(0);
			}
		});
	}//생성자-end
	
	public static void main(String args[]) {
		//GridLayoutMainClass.java
		
		//GridLayoutMainClass flc1 = new GridLayoutMainClass();
		new GridLayoutMainClass(); //생성자(인자가 없는 디폴트 생성자)

	}
}
