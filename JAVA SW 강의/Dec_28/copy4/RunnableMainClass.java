package Dec_28.copy4;

class RunnableClass implements Runnable{
	public void run() {
		System.out.println("I love you");
	}
}

public class RunnableMainClass { //RunnableMainClass
	public static void main(String args[]) { //같은 클래스로 쓰레드 2개...
		RunnableClass r1 = new RunnableClass(); //(1)
		Thread th1 = new Thread(r1); //(1)두줄로 써보자
		//-----------------------------------
		Thread th2 = new Thread(new RunnableClass()); //(2)한줄로 써보자
		
		th1.start();
		th2.start();
	}
}

