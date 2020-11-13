package array;

import java.util.Arrays;
import java.util.Random;

public class Array12 {
	public static void main(String args[]) {
		// Q) 로또 프로그램
		//Math.random() 0.0000001 ~ 0.9999999
		//Math.random()*45 0.0000005 ~ 44.*******
		//Math.ceil = 올림 처리  + (int) 처리 ==> 1~45 중 랜덤 정수 출력 
		int[] lotto = new int[6];
		
		for(int i=0;i<lotto.length;i++) {
			lotto[i] = (int)Math.ceil(Math.random()*45);  //랜덤 숫자 찍어내기
			for(int j=0; j<i; j++) {					 
				if(lotto[i]==lotto[j])				      //중복이 발생하면
					i--;                                  //i를 다시 찍어낸다
			}
		}										    
											        
		
		Arrays.sort(lotto);   //오름차순 소트로직
		System.out.println("이번주 당첨 번호는 ~~");
		for (int i=0; i<lotto.length; i++) {
			System.out.print(lotto[i] + "\t");
		}
		
		
		/*Random rd = new Random();
		for(int i=0;i<6;i++) {
            System.out.print("["+(rd.nextInt(45)+1)+"]"); //로또번호 출력
        }*/
	}
}
