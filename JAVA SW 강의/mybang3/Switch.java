package mybang3;

import java.util.Scanner;

public class Switch {
	public static void main(String args[]) {
		/*점수가 73인 학생의 학점을 구하시오
		 * 단 90-100 A
		 *    80-89 B
		 *    70-79 C
		 *    60-69 D
		 */
		Scanner sc= new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");
		int score = sc.nextInt();
		
		while(score<0 || score>100) {
			System.out.println("잘못 입력한 점수입니다.");
			score = sc.nextInt();
		}

		switch(score/10) {
		case 10 : 
			/*System.out.println("A");
			break;*/
		case 9 :
			System.out.println("A");
			break;
		case 8 :
			System.out.println("B");
			break;
		case 7 :
			System.out.println("C");
			break;
		case 6 : 
			System.out.println("D");
			break;
		default :
			System.out.println("F");			
		}
	}
}
