package mybang3;

import java.util.Scanner;

public class If2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("1~100 사이 숫자 입력 : ");
		int i = Integer.parseInt(sc.next());
		
		do{
			System.out.println("다시 입력하세요");
			i = sc.nextInt();
		}while(i>100||i<0);
		if(i>=50) {
			System.out.println("50 이상이네");
		}
	}

}
