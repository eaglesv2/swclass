package Dec_28.copy3;

class ThreeThreadClass extends Thread {
	String fruit;
	public ThreeThreadClass(String fruit) { //생성자
		this.fruit = fruit;
	}
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println(fruit + "\t" + i + "개 주세요");		
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} //for-end
	} //run-end
} //ThreeThreadClass-end

public class ThreeThreadMainClass { //ThreeThreadMainClass.java
	public static void main(String args[]) {
		ThreeThreadClass ttc1 = new ThreeThreadClass("사과");
		ThreeThreadClass ttc2 = new ThreeThreadClass("배");
		ThreeThreadClass ttc3 = new ThreeThreadClass("감");
		
		//---------------------------------------
		//우선순위 : priority //자바쓰레드 : 1-10 범위
		ttc1.setPriority(ttc1.MIN_PRIORITY); //1
		ttc2.setPriority(ttc2.NORM_PRIORITY);//default 5
		ttc3.setPriority(ttc3.MAX_PRIORITY);//10 //감
		
		System.out.println(ttc1.getPriority() + "\t" +
						   ttc2.getPriority() + "\t" +
						   ttc3.getPriority());
		//----------------------------------------
		ttc1.start();
		ttc2.start();
		ttc3.start();
	}
} //class-end
