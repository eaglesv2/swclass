package gui;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JCheckboxClass extends JFrame {
	
	public JCheckboxClass() {//생성자
		JPanel jp1 = new JPanel(); //패널 = 판  //조각케익(?)
		JCheckBox jcb1 = new JCheckBox("회원카드보유",true);
		JCheckBox jcb2 = new JCheckBox("장기회원",true);
		JCheckBox jcb3 = new JCheckBox("해외여행신청여부",false);
		
		jp1.add(jcb1);
		jp1.add(jcb2);
		jp1.add(jcb3);
			//getContentPane().add(jcbc1)
		getContentPane().add(jp1);
			//프레임의 content pane을 밀어낸 후 컴포넌트 부착
	}
	
	public static void main(String args[]) {
		JCheckboxClass jcbc1 = new JCheckboxClass();
		jcbc1.setTitle("체크박스라는~~~");
		jcbc1.setSize(500,500);
		jcbc1.setVisible(true);
	}
}