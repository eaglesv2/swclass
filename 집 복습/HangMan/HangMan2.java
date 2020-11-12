package HangMan;

import java.util.*;
public class HangMan2 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		StringBuilder print = new StringBuilder("_____");
		String ans = "apple";
			
		int count;
		System.out.println("_____");
		System.out.print("예상 글자 입력 : ");
		String guess = sc.next();
			

		for(count=1; count<=13; count++) {
			for(int i=0; i<ans.length(); i++) {
				if(ans.charAt(i)==guess.charAt(0)) { 
					print.replace(i, i+1, guess);
				}
			}
			System.out.print(print.toString());
		
			System.out.println("\t" + count + "번째 시도");
			
			if(count>=13) {
				break;
			}
				
			if(print.equals(ans)) {
				System.out.println("정답입니다!!");
				break;
			}
			else {
				System.out.print("예상 글자 입력 : ");
				guess = sc.next();
			}
		}
			
		if(!print.equals(ans)) {
			System.out.println("사람이 죽었습니다..");
		}
	}
}

