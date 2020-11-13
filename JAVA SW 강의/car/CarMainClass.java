package car;

class Car { //정의(설계)
	String color;
	int door;
	public void drive() { //쓸거 없으면 void
		System.out.println("멋지게 드라이브하자");
	} //drive-end
} //Car-class-end

public class CarMainClass { // CarMainClass.java
	public static void main(String argsp[]) {
		Car mycar = new Car(); //생성(제작)
		mycar.color = "black"; //객체.속성=값
		mycar.door = 2;
		mycar.drive(); //객체.메소드
		
		System.out.println(mycar.color);
		System.out.println(mycar.door);
		
	} //main-end
} //CarMainClass-class-end


