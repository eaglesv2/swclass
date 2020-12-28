package Dec_28;

class ThreadClass extends Thread { // 상속을 바로 하고 있음
								   // 다른 상속이 없는 경우
	public void run() {
		System.out.println("쓰레드와 오늘부터 1일 ~");
	}
}

public class ThreadMainClass { //ThreadMainClass.java
	public static void main(String args[]) {
		ThreadClass tc1 = new ThreadClass(); // delegation
		tc1.start(); // ThreadClass의 run() 호출
		System.out.println("쓰레드 하러 가자");
	}
}
