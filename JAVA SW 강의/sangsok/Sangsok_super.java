package sangsok;

class Parent7 {
	protected int don;	//생성자 중복 ! ! ! //package 안에서는 상관 x / 실전에선 protected int don;
	public Parent7(int don) { //인자 있는 생성자
		this.don = don;
		System.out.println("나 돈 받았네!!" + don + "억");
	}
	public Parent7() { //인자 없는 생성자
		System.out.println("나 돈 없어!!!");
	}
}

class Child7 extends Parent7 {
	public Child7() { //개발자가 직접 만들었음 그러니까 디폴트 생성자 아님
		System.out.println("나는 엄청나게 많아!!");
	}
	public Child7(int don) {
		super(don); // 부모쪽에 가서 처리하고 오라는 뜻
		System.out.println("나는 엄청나게 많아!!" + don + "억");
		System.out.println("나는 엄청나게 많아!!" + super.don + "억");
	}
}

public class Sangsok_super {
	public static void main(String args[]) {
		Child7 c7 = new Child7(); //상속에 있어서 자녀쪽을 찾아가도록 하면 부모쪽을 먼저 찾아가도록 만들어놨음
		Child7 c8 = new Child7(30); //30억 초기치 주는 경우
		
		
		//   this.  this()
		//c# base.  base()
		//java super. super()
	}
}
