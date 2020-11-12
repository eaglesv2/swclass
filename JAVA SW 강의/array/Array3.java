package array;

public class Array3 {
	public static void main(String args[]) {
		// Q) 100개 수를 메소드 2형식으로 전달하여 구하시오
        // kaja(1,4,20,...)
		// kaja(int i, int j, ...)   
		
		/*call by value		call by reference*/
		
		int [] jumsoo3 = {30,70,100,90,20};
		
		kaja100(jumsoo3); //배열의 대표명, 그 배열의 시작번지
	}

	private static void kaja100(int[] jumsoo555) {
		jumsoo555[0] = 100;
		System.out.println(jumsoo555[0]);
	}
}
