package inheritance;

/*animal 부모는 move() 하는 행동이 있다. 새는 노래 잘하고 물고기는 수영을 잘한다

상속특성을 사용하여 다음과 같이 출력하도록 만드시오

나 잘 움직여 ==> 부모(ANIMAL)

나 잘 움직여 ==> 새
노래 엄청 잘해 sing()

나 잘 움직여 ==> 물고기
수영은 내가 잘해 swim();

*/
class Animal {
	public void move() {
		System.out.println("나 잘 움직여");
	}
}

class Bird extends Animal {
	public void sing() {
		System.out.println("나 노래 엄청 잘해");
	}
}

class Fish extends Animal {
	public void swim() {
		System.out.println("수영은 내가 잘해");
	}
}

public class Inheritance2 {
	public static void main(String args[]) {
		Animal ani = new Animal();
		Bird bi = new Bird();
		Fish fi = new Fish();
		
		ani.move();
		//---------------------
		bi.move();
		bi.sing();
		//---------------------
		fi.move();
		fi.swim();
		
	}
}
