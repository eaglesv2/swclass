package inheritance;

import java.util.Scanner;

/*부모(Parent), 자녀(Child) 클래스를 사용하여 객체의 형변환 프로그램을 작성하시오
결과는

어느차를 타시렵니까?(부모차=1,자녀차=2)
2
자녀차타고 여행가자
*/
class Parent {
	public void car() {
		System.out.println("부모차타고 드라이브하자");
	}
}

class Child extends Parent { //상속
	public void car() {// overriding  ////
		System.out.println("자녀차타고 여행가자");
	}
}

public class Inheritance4 {
	public static void main(String args[]) {
		Parent p1 = new Parent();
		Parent p2 = new Child();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("어느차를 타시렵니까?(부모차=1,자녀차=2)");
		int choice = sc.nextInt();
		
		/*if(choice==1)
			p1.car();
		else if(choice==2)
			p2.car();
		else {
			System.out.println("다시 입력하세요");
			choice = sc.nextInt();
		}*/
		
		Parent p77 = null;
		switch(choice) {
		case 1:
			p77 = new Parent();
			p77.car();
			break;
		case 2:
			p77 = new Child();
			p77.car();
			break;
		default :
			System.out.println("1,2 중에 입력하세요");
			break;
		}
	}
}
