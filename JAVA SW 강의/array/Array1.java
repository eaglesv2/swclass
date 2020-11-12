package array;


public class Array1 {
	public static void main(String args[]) {
		int [] k = new int[3];
		//int k [] = new int[3]; 같은 의미 but C#에선 위에꺼만 사용
		k[0] = 100;
		k[1] = 90;
		k[2] = 95;
		int tot = k[0] + k[1] + k[2];
		System.out.println(tot);
	}
}