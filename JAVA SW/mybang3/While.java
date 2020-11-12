package mybang3;
import java.util.*;

public class While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Q) 점수를 입력받아 max값, 과목수 평균값을 출력하는
		프로그램을 작성하시오
		(단, 과목수는 모름, 점수 입력시 -1이 들어오면 EOF(end of file)를 의미한다)
		
		점수 : 100
		점수 : 78
		점수 : 96
		점수 :-1
		점수 최고점 = 100
		과목수 = 3
		점수평균 = 91.0*/
		
		Scanner sc = new Scanner(System.in);
		
		int score = 0;
		int max = 0;
		int count = 0;
		int total = 0;
		
		while(true) {
			System.out.print("점수 : ");
			score = sc.nextInt();
			if(score > 100)
				continue;
			if(score == -1)
				break;
			if(score > max)
				max = score;
			count ++; //누적 스텝 count = count + 1;
			total += score; // total = total + score;
		}
		
		double average = (double)total/count;

		System.out.println("점수 최고점 : " + max);
		System.out.println("과목 수 : " + count);
		System.out.printf("점수 평균 : %.2f", average);
		

	}
}