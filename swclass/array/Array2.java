package array;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Q) 한 학생의 국어, 영어, 수학, 사회, 과학 5과목의 점수를
		          각각 변수에 넣은 후 총점 및 평균을 구하는 프로그램을 작성하시오
		     (단, 점수는 키보드 입력없이 초기치로 넣으시오. 배열은 사용하지 않음)
		     (예) int kor = 100;
		 */
		
		int kor = 90;
		int math = 96;
		int eng = 92;
		int soc = 88;
		int sci = 100;
		/*int tot = kor + math + eng + soc + sci;
		double avg = tot/5.0;
		System.out.println("총점 : " + tot);
		System.out.println("평균 : " + avg);*/
		
		
		
		int [] score = new int[5];
		score[0] = kor;
		score[1] = math;
		score[2] = eng;
		score[3] = soc;
		score[4] = sci;
		int tot = 0;
		for(int i=0; i<score.length; i++) {
			tot += score[i];
		}
		double avg = (double)tot/score.length;
		System.out.println("총점 : " + tot);
		System.out.println("평균 : " + avg);
		
		int [] jum2 = {100, 45, 78, 90, 56};
		int tot11 = 0;
		for (int i=0; i<jum2.length; i++) {
			tot11 += jum2[i];
		}
	}
}
