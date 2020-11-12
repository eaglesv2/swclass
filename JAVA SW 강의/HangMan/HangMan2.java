package HangMan;

import java.util.Arrays;
import java.util.Scanner;

public class HangMan2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String[][] ans = {{"A", "P", "P", "L", "E"},
						  {"_", "_", "_", "_", "_"}};
		
		/*int count;
		for (int i = 0; i<ans.length; i++) {
			System.out.print(ans[1][i]);
		}
		System.out.println();
		System.out.print("예상 글자 입력 : ");
		String guess = sc.next();
		

		for(count=1; count<=13; count++) {
			for(int i=0; i<ans.length; i++) {
				if(guess.equals(ans[0][i])) {
					ans[1][i] = guess;
				}
			}
			
			for (int i = 0; i < ans.length; i++) {
				System.out.print(ans[1][i]);
			}
			System.out.println("\t" + count + "번째 시도");
			
			if(count>=13) {
				break;
			}
			
			if(Arrays.equals(ans, print)) {
				System.out.println("정답입니다!!");
				break;
			}
			else {
				System.out.print("예상 글자 입력 : ");
				guess = sc.next();
			}
		}*/
		for(int i=0; i<ans.length; i++) {
			System.out.println(Arrays.toString(ans[i]));
		}
		
		/*if(!Arrays.equals(ans, print)) {
			System.out.println("사람이 죽었습니다..");
		}*/
	}
}
