package DEC_03_Test;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;


@SuppressWarnings("serial")
class GoodBurgerClass extends JFrame implements ActionListener {

	// 조건3
	JLabel goodBurger = new JLabel();
	JLabel selectMenu = new JLabel();

	// 조건4
	JButton burger1 = new JButton();
	JButton burger2 = new JButton();
	JButton burger3 = new JButton();
	JButton burger4 = new JButton();
	JButton orderButton = new JButton();
	JButton cancelButton = new JButton();
	
	
	@SuppressWarnings({ "rawtypes" })
	JList areaList = new JList();

	String orderlist = ""; // 주문 내역
	int price = 0; // 주문 가격
	int count = 0; // 주문 수량
	
	Boolean list;

	@SuppressWarnings("unchecked")
	public GoodBurgerClass() {
		// 조건1
		setTitle("어서오세요 굿버거입니다");
		// 조건2
		setSize(650, 400);
		setLayout(new GridLayout(0, 2, 30, 30));
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 조건5
		goodBurger.setText("**굿버거 햄버거 입니다**");
		goodBurger.setFont(new Font("굴림", Font.BOLD, 25));
		getContentPane().add(goodBurger);
		
		selectMenu.setText("드실 메뉴를 선택하세요");
		selectMenu.setFont(new Font("굴림", Font.BOLD, 25));
		getContentPane().add(selectMenu);

		burger1.setText("매운 소스 햄버거 : 5000");
		burger1.setFont(new Font("굴림", Font.BOLD, 18));
		burger1.addActionListener(this);
		getContentPane().add(burger1);
		
		burger2.setText("더블 비프 햄버거 : 7000");
		burger2.setFont(new Font("굴림", Font.BOLD, 18));
		burger2.addActionListener(this);
		getContentPane().add(burger2);
		
		burger3.setText("야채 새우 햄버거 : 4500");
		burger3.setFont(new Font("굴림", Font.BOLD, 18));
		burger3.addActionListener(this);
		getContentPane().add(burger3);
		
		burger4.setText("세겹 토마토 햄버거 : 5500");
		burger4.setFont(new Font("굴림", Font.BOLD, 18));
		burger4.addActionListener(this);
		getContentPane().add(burger4);
		
		orderButton.setText("주문합니다");
		orderButton.setFont(new Font("굴림", Font.BOLD, 18));
		orderButton.setBackground(Color.ORANGE);
		orderButton.addActionListener(this);
		getContentPane().add(orderButton);
		
		cancelButton.setText("취소합니다");
		cancelButton.setFont(new Font("굴림", Font.BOLD, 18));
		cancelButton.setBackground(Color.YELLOW);
		cancelButton.addActionListener(this);
		getContentPane().add(cancelButton);

		String[] area = {"종로", "종로 외"};
		areaList.setListData(area);
		getContentPane().add(areaList);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == burger1) { // 매운 소스 햄버거 5000원
			orderlist += burger1.getText() + "\n";
			price += 5000;
			count++;
		}
		if (e.getSource() == burger2) { // 더블 비프 햄버거 7000원
			orderlist += burger2.getText() + "\n";
			price += 7000;
			count++;
		}
		if (e.getSource() == burger3) { // 야채 새우 햄버거 4500원
			orderlist += burger3.getText() + "\n";
			price += 4500;
			count++;
		}
		if (e.getSource() == burger4) { // 세겹 토마토 햄버거 5500원
			orderlist += burger4.getText() + "\n";
			price += 5500;
			count++;
		}
		if (e.getSource() == orderButton) { // 주문 버튼
			if (areaList.getSelectedIndex() == -1) {
				list = false;
			} else {
				list = true;
			}
			if(list == true && price > 0) {
				price -= 1000;
			}
			
			String check = orderlist + "총 금액 : " + price + "원" + "\n" + "총 주문 수량 : " + count + "개";
			JOptionPane.showConfirmDialog(orderButton, check, "확인하세요", JOptionPane.YES_NO_OPTION);

			areaList.clearSelection();
			orderlist = ""; // 처리내용 초기화
			price = 0;
			count = 0;
		}
		if (e.getSource() == cancelButton) {// 주문 취소
			orderlist = "";
			price = 0;
			count = 0;

			JOptionPane.showMessageDialog(cancelButton, "취소되었습니다");
		}
	}
}

public class GoodBurgerMainClass {
	public static void main(String args[]) {
		new GoodBurgerClass();
	}
}
