package string;

import java.util.Scanner;

//문자열을 입력받아 첫번째, 3번째 ... 글자를 바꾸어
//출력하시오(단, 메소드 2형식 사용)
//(예) ondal -> oadnl
//단, String과 char[] 사용

public class string4 {
	
	public static void kajaChange(String [] s1) {
		// TODO Auto-generated method stub
		char[] ch = s1[0].toCharArray(); //String 문자열을 쪼개서 char 배열에 넣는 함수  String -> char[]
		char imsi = ch[1];
		ch[1] = ch[3];
		ch[3] = imsi;
		
		/*for(int i=0; i<moonja.length(); i++) {
			System.out.print(ch[i]);
		}
		System.out.println();*/
		
		String str = new String(ch); // char[] -> String
		System.out.println(str);
	}
	
	public static void main(String args[]) {
		
		/*Scanner sc = new Scanner(System.in);
		String moonja = sc.next();*/
		
		kajaChange(args);
	}
}
