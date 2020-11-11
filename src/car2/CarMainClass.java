package car2;

class Car { //정의(설계)   캡슐화 encapsulation
	private String color;
	private int door;
	
	//getter, setter   alt+shift+s 로 한번에 생성 가능(generater)
	public void setColor(String color){ //받는건 set  main에서 color값을 받아서 설계도에 넣는것
		this.color = color;  //this : 자기 자신을 참조하는 객체
	}
	public void setDoor(int door) {
		this.door = door;
	}
	public String getColor() { //main으로 다시 보내주는 메소드(return 3형식)
		return color; //this.color
	}
	public int getDoor() {
		return door;
	}
	public void drive() { //쓸거 없으면 void
		System.out.println("멋지게 드라이브하자");
	} //drive-end
} //Car-class-end

public class CarMainClass { // CarMainClass.java
	public static void main(String argsp[]) {
		Car mycar = new Car(); //생성(제작) 메모리에 도우미 4개 추가
		//mycar.color = "black"; //객체.속성=값
		//mycar.door = 2;
		mycar.setColor("red"); //객체.메소드
		mycar.setDoor(4);
		mycar.drive(); //객체.메소드
		
		Car urcar = new Car();
		urcar.setColor("yellow");
		urcar.setDoor(2);
		
		//System.out.println(mycar.color);
		//System.out.println(mycar.door);	
		System.out.println(mycar.getColor() + ", " + mycar.getDoor());
		System.out.println(urcar.getColor() + ", " + urcar.getDoor());

		
	} //main-end
} //CarMainClass-class-end


