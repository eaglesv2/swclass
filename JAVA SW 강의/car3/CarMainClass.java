package car3;

class Car { //정의(설계)   캡슐화 encapsulation
	private String color;
	private int door;
	
	//생성자 규칙 - public으로만, return 쓸 수 없음
	public Car(String color, int door) { //생성자
		// TODO Auto-generated constructor stub
		this.color = color; //넘어온 초기치를 객체 안으로 넣기
		this.door = door;
	}
	
	public Car() { //초기치가 없을 때 빈문자열,0 내부적으로 처리 = defualt 생성자
				   //생성자 중복(constructor overloading)
		// TODO Auto-generated constructor stub
	}

	//getter, setter   alt+shift+s 로 한번에 생성 가능(generater)
	public void setColor(String color){ //받는건 set  main에서 color값을 받아서 설계도에 넣는것
		this.color = color;  //this : 자기 자신을 참조하는 객체
	}
	public void setDoor(int door) {
		this.door = door;
	}                       //생성자가 있기 때문에 초기치만 입력할 때에는 없어도 된다
	
	public String getColor() { //main으로 다시 보내주는 메소드(return 3형식)
		return color; //this.color
	}
	public int getDoor() {
		return door;
	}
	public void drive() { //쓸거 없으면 void
		System.out.println("멋지게 드라이브하자");
	} //drive-end
	
	public void print() { //출력전문메소드
		System.out.println(color + ", " + door);
	}
	
	public String toString() { //overriding (조상의 것 재사용)
		return "[자동차 색은 말하자면] " + color +"이고 "
				+ "[문의 갯수는 다시 얘기하면] " + door + "개 입니다";
	}
} //Car-class-end

public class CarMainClass { // CarMainClass.java
	public static void main(String argsp[]) {
		Car mycar = new Car("red",4); //생성(제작) 메모리에 도우미 4개 추가
		//mycar.color = "black"; //객체.속성=값
		//mycar.door = 2;
		/*mycar.setColor("red"); //객체.메소드
		mycar.setDoor(4);*/ //생성자가 있기 때문에 setter가 필요 없다.
		
		mycar.drive(); //객체.메소드
		
		Car urcar = new Car();
		urcar.setColor("blue");
		urcar.setDoor(2);
		
		mycar.print();
		
		System.out.println(mycar.toString());
		System.out.println(mycar); // toString() 생략 가능하다  
		                           // 출력전문 메소드 만들어놓고 객체만 출력
		
		//System.out.println(mycar.color);
		//System.out.println(mycar.door);	
		System.out.println(mycar.getColor() + ", " + mycar.getDoor());
		System.out.println(urcar.getColor() + ", " + urcar.getDoor());

		
	} //main-end
} //CarMainClass-class-end


