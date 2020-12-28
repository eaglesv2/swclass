package Dec_28.copy;

class ThreadClass1 extends Thread {
	public void run() { //ThreadClass1 클래스가 수행할 작업
		System.out.println(getName() + "나는 나야");
		System.out.println("All you need is Love~~~~");
	}
}

class ThreadClass2 extends Thread {
	public void run() { //ThreadClass2 클래스가 수행할 작업
		System.out.println(getName() + "나도 너 아니거든");
		System.out.println("Love is All you need~~~~");
	}
}

public class ThreadMainClass { //ThreadMainClass.java
	public static void main(String args[]) {
		ThreadClass1 tc1 = new ThreadClass1(); // 디폴트 생성자
		ThreadClass2 tc2 = new ThreadClass2(); //////////
		tc1.start(); // ThreadClass1의 run() 호출
		tc2.start(); // ThreadClass2의 run() 호출
	}
}
