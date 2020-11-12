package interface1;

interface Samchon { //상속역할
	void isBoat(); //선언o, 구현x, child class에서 구현
				   //public x  , 나중엔 다 써야함
		//System.out.println("보트 여행 다니자");
}

interface Gomo { //상속역할
	void isBosuk();
}

class Booja {
	public void manaDon() {
		System.out.println("많이 벌었다");
	}
}

class Na extends Booja implements Samchon,Gomo{
	public void isBoat() { //자식쪽에서 메소드 구현
		System.out.println("보트 여행 다니자");
	}
	public void isBosuk() { //자식쪽에서 메소드 구현
		System.out.println("멋진 보석도 가지고~");
	}
	public void useDon() {
		System.out.println("많이 사자~~");
	}
}

public class DajoongSangsok {
	public static void main(String args[]) {
		Na na1 = new Na();
		na1.useDon(); //원래 나
		na1.isBoat(); //상속된 것(implements)
		na1.isBosuk();
		na1.manaDon(); //상속된 것(extends)
		//결국 설계도를 대충 그린 interface 방법으로 다중상속을 한 것
	}
}
