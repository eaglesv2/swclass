package Dec_28.copy5;

class ThreadClass extends Thread {
	public void run() {
		for(int i=1; i<=10; i++) {
			System.out.println("슈퍼가자!");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class RunnableClass implements Runnable{
	public void run() {
		for(int i=1; i<=10; i++) {
			System.out.println("백화점가자!");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class RunnableMainClass { //RunnableMainClass
	public static void main(String args[]) { 
		ThreadClass th1 = new ThreadClass(); //(1)extends Thread
		//-----------------------------------
		Thread th2 = new Thread(new RunnableClass()); //(2)implements Runnable
		
		th1.start();
		th2.start();
	}
}

