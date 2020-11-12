package mybang3;

public class Conversion {
	public static void main(String args[]) {
		//묵시적 형변환(implicit conversion) 작은 크기에서 큰 크기로
		short sh1 = 100;
		int i1 = sh1;
		
		//명시적 형변환
		int soo7 = 23456; //234567
		short sh2 = (short)soo7; //int-->short 형변환 
		                         //cast 연산자
		System.out.println(sh2); //23456 //234567로 하면 -27577
		//개발자 책임하에 
		

	}
}
