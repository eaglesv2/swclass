package abstraction;

import java.util.Scanner;

/*추상화(Abstraction)
*가독성, 다형성(polymorphism)

  과일
사과  배  감

interface 나 abstract 모두 전제조건이 "상속에 있어서"
*/

abstract class Fruit { //추상 클래스   class 앞에 abstract 추가
	public void good() {
		System.out.println("먹으면 좋아");
	}
	public abstract void mukja(); //추상 메소드가 있으면 추상 클래스
		//구현x, 선언 o, 구현은 자녀쪽에서 한다
	    //interface와 abstract는 사촌간(이거는 그나마 조금 상세한 설계도)
}

class Sakwa extends Fruit  {
	public void mukja() {
		System.out.println("사과를 사각사각 먹자");
	}
}

class Bae extends Fruit {
	public void mukja() {
		System.out.println("배를 배애배애 먹자");
	}
}

class Gam extends Fruit {
	public void mukja() {
		System.out.println("감을 가암가암 먹자");
	}
}

public class abstract1 {
	public static void main(String args[]) {
		Fruit sa = new Sakwa();
		sa.mukja(); //사과 먹는다    // 다형성
		Fruit ba = new Bae();
		ba.mukja(); //배 먹을껄
		Fruit ga = new Gam();
		ga.mukja(); //감 먹어?
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1.사과 2.배 3.감");
		int sel = sc.nextInt();
		
		Fruit f = null;
		switch(sel) {
			case 1:
				f = new Sakwa();
				f.mukja();
				break;
			case 2:
				f = new Bae();
				f.mukja();
				break;
			case 3:
				f = new Gam();
				f.mukja();
			default :
				System.out.println("1-3만 입력하세요");
				break;
		}
	}
}
