package array;

public class Array4 {
	public static void main(String args[]) {
		//Q) 5개 수를 배열을 사용하여 전달한 후 배열 역순으로 출력하시오
		
		//1차원 배열
		int [] A = {1,2,3,4,5};
		
		kaja(A);
		
	}

	private static void kaja(int[] a) {
		for(int i=a.length-1; i>=0; i--) {
			System.out.print(a[i] +"\t");		
		}
	}
}
