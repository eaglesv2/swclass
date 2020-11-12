package array;

public class Array10 {
	public static void main(String args[]) {
			//Q) int [] k = {90, 100}; 배열의 두 수를 맞바꾸시오
			// int [] k = new int[2];
			// k[0] = 90; k[1] = 100;
			// temp = k[0];
			// k[0] = k[1];
			// k[1] = temp;
		
		int [] aa = {100,200};
		System.out.println("전: " + aa[0] + " " + aa[1]);
		
		int imsi = aa[0]; //zigzag
		aa[0] = aa[1];
		aa[1] = imsi;
		System.out.println("후: " + aa[0] + " " + aa[1]);
	}
}
