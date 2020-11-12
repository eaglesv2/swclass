package inheritance;


class Boomo{
	
	protected int diamond;

	public void don() {

		System.out.println("나 재산 많아~~~~~");
	}
}

class Janyu extends Boomo{
	public void car() {
		diamond = 3;
		System.out.println("중형차있음~~~~~");
	}
	
}
public class Inheritance1 {
	public static void main(String args[]) {
		Boomo b1 = new Boomo();
		b1.don();
		
		Janyu j1 = new Janyu();
		j1.don();
		j1.car();
		
		System.out.println(j1.diamond);
		
		//b1.car
	}
}
