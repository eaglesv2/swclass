package telinfoPrintMain;

import java.util.Scanner;

import telinfoDAO.TelinfoDAO;

public class TelinfoPrintMain { // TelinfoPrintMain.java
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int sel = 0;
		TelinfoDAO tiDAO = new TelinfoDAO();
		do {
			System.out.println("비상 연락망 관리!! \n\n\n");
			
			System.out.println("-------------------------------");
			System.out.println("1 : 한명입력");
			System.out.println("2 : 전체출력");
			System.out.println("3 : 종료");
			System.out.println("-------------------------------");
			System.out.print("이용할 메뉴를 선택하세요 : ");
			
			sel = sc.nextInt();
		
		
			switch(sel) {
			case 1 : System.out.print("id = ");
					 int id = sc.nextInt();
					 System.out.print("name = ");
					 String name = sc.next();
					 System.out.print("tel = ");
					 String tel = sc.next();
					 System.out.print("telDate = ");
					 String sDate = sc.next();
				 
				 
					 boolean b1 = tiDAO.insert_nametel(id, name, tel, sDate); //객체.메소드
					 if(b1) //결과가 true
						 System.out.println("insert ok");
					 else
						 System.out.println("insert error");
					 break; //break
			case 3 : System.out.println("종료합니다 . . . . .");
					 break;
			} //switch-end
		} while(sel != 3); //while-end
	} //class-end
}
