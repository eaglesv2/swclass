package FOREXAMPLES;

public class ForQuiz1 {
	public static void main(String args[]) {
		// Q) 쌀 100통이 저장되어 있는 창고에서 암수 1쌍의 쥐가 있다.
		// 쥐 한 마리가 하루에 20g씩의 쌀을 먹고 10일마다 쥐의 수가 2배씩 증가한다.
		//며칠 만에 창고의 쌀이 모두 쥐의 먹이가 될까. 그리고 쥐는 총 몇 마리인가?(한통은 80kg)
		int ssaltong = 100; //100통
		int ssal = 80;      //통당 80kg
		int totrice = ssal*ssaltong;
		int mouse = 2;
		int day;
		
		for(day=1; totrice>0; day++) {
			totrice = totrice - 20*mouse;
			if(day%10==0)
				mouse *=2;
		}
		
		System.out.println(day + "일  " + mouse + "마리");
		
	}
}
