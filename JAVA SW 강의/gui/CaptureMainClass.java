package gui;

import java.awt.AWTException;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

class CaptureClass extends JFrame {
	
	//GUI
	private Button b1 = new Button("전체화면 캡쳐");
	Robot robot1;
		//자바가 OS의 키보드 마오스 제어 권한을 얻어보자
	Dimension totWin1;
		//컴포넌트의 너비 - 높이를 저장하는 종이박스
		//java.awt.Dimension
	Rectangle rect1;
	BufferedImage bImage1;
	
	public CaptureClass() throws AWTException, IOException {//생성자
		add(b1);
		b1.setVisible(true);
			//------------------------------
		//jdk1.3부터   임시로 os정도의 키보드 마우스 제어
		robot1 = new Robot();
		//Toolkit : OS 정보 조회  //자바 차원에서 화면 크기를 알아보자
		totWin1 = Toolkit.getDefaultToolkit().getScreenSize();
		
		// 예) 1024 x 768의 화면 크기였다고 하면
		rect1 = new Rectangle((int)totWin1.getWidth(), (int)totWin1.getHeight());
										//     1024  x   768
		//rect1 = new Rectangle(1024,768);
		
		
		//###### 캡처 ######
		bImage1 = robot1.createScreenCapture(rect1);
		ImageIO.write(bImage1,  "jpg",  new File("C:\\Users\\pc\\Desktop\\자바 국비지원"));
		
		setSize(200,200);
		setVisible(true);
	}//생성자-end
}//class-end



public class CaptureMainClass {	//CaptureMainClass.java
	public static void main(String args[]) throws AWTException, IOException {
		new CaptureClass();
	}
}
