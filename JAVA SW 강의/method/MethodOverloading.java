package method;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//인자의 타입이 달라야 or 인자의 갯수가 달라야
		int aa = 100;
		double bb = 23.5;
		int x = 200;
		double y = 300.7;
		
		kaja();
		kaja(aa);   //인자 갯수가 다름 (0개,1개)
		kaja(x);    //kaja(aa)와 같은 메소드 찾아감(인자타입 갯수 모두 같음)
		kaja(bb);   //인자 타입이 다름 - 오버로딩 가능
	}

	private static void kaja(double bb) {
		// TODO Auto-generated method stub
		
	}

	private static void kaja(int aa) {
		// TODO Auto-generated method stub
		
	}

	private static void kaja() {
		// TODO Auto-generated method stub
		
	}
}
