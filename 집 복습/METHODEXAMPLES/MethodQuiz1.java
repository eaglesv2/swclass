package METHODEXAMPLES;
import java.util.*;
public class MethodQuiz1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt(); 
		int j = sc.nextInt();
		bignumber(i,j);
	}

	private static void bignumber(int i, int j) {
		if(i>=j)
			System.out.println(i + "과 " + j + " 중 큰 수는 : " + i);
		else
			System.out.println(i + "과 " + j + " 중 큰 수는 : " + j);
		
	}
}
