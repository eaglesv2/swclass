package inheritance;

//overriding //재정의
//1) 상속에서 메소드 이름이 같아야
//2) 재정의시 약간 다르게 하는 것


class Boomo2 {
	public void car() {
		System.out.println("부모차타고 드라이브하자");
	}
}

class Janyu2 extends Boomo2 { //상속
	public void car() {// overriding  ////
		System.out.println("자녀차타고 폼나게 여행가자");
	}
}


public class Inheritance3 {
	public static void main(String args[]) {
		Boomo2 b1 = new Boomo2();
		Janyu2 j1 = new Janyu2();
		b1.car(); //부모차
		j1.car(); //자녀차
		
		//객체의 형변환 - 부모쪽이 앞에 나올때만 가능
		//Boomo2 b2 = j1; //O
		Boomo2 b2 = new Janyu2();  //O
		b2.car();
		
		//Janyu2 j2 = b1; //X
		//Janyu2 j2 = new Boomo2(); //X
		
		Janyu2 j2 = (Janyu2)b2; //new Janyu2();
		
		//Janyu2 j3 = (Janyu2)b1; //compiler o, run x
		
		//==================================
		Boomo2 b5 = new Janyu2();
		b5.car(); ////////////////////부모차 ? 자녀차 ? - 자녀차
		//===================================
		
	}
}
