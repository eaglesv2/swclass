package mybang;

import java.util.Date;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	Date d1 = new Date(); //ctrl+shift+o
		System.out.println(d1.toLocaleString()); //화면출력명령 
		System.out.println();
		System.out.println("날짜 출력 끄~읕");*/
		System.out.printf("%d 번 버스타고 집에간다\n", 30);
		System.out.println("30 번 버스타고 집에간다");
		int a = 30;
		System.out.println((a + " 번 버스타고 집에간다"));
		System.out.printf("%f = 파이\n", 3.141592);
		System.out.printf("%.2f = 파이\n", 3.141592);
		
		int w = 85;
		System.out.printf("지구에서의 몸무게 = %dkg\n",w);
		System.out.printf("달에서의 몸무게 = %.2fkg\n",w*0.17);

	}

}

//onreadystatechange