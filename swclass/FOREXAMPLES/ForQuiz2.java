package FOREXAMPLES;

public class ForQuiz2 {
	public static void main(String args[]) {
		// Q) 첫날에 10원을 예금하고, 다음날에는 전날의 2배를 예금하는 방식으로 한달동안 저축한 금액은?
		
		long k = 10; //첫날 예금액
		long tot = 10; //총 예금액
		
		for(int i=1; i<=30; i++) {
			tot += k;
			k *=2;
		}
		System.out.println("총 저축한 금액은 " + tot + "원");
	}
}
