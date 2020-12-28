package Dec_28.copy2;

class ThreadClass1 extends Thread {
	public void run() { //ThreadClass1 클래스가 수행할 작업
		for(int i=0; i<10; i++) {
			System.out.println(getName() + "내가 쏘고있다!!!");
			try {
			Thread.sleep(500); //500MS 즉, 0.5초
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class ThreadClass2 extends Thread {
	public void run() { //ThreadClass2 클래스가 수행할 작업
		for(int i=0; i<10; i++) {
			System.out.println(getName() + "네가 쏘는 거냐!!!");
			try {
				Thread.sleep(500); //////////////////////////
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
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