package exception;

import java.util.Scanner;

/*try()
catch()
finally()

*/

public class Exception1 {
	public static void main(String args[]) {
		try {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 수는 : ");
		String one = sc.nextLine();
		//빈칸포함 한 줄 다 입력 // i love you 한 줄 다 읽음
		//but next()는 i만 읽음
		
		int soo1 = Integer.parseInt(one);
		
		System.out.print("두번째 수는 : ");
		String two = sc.nextLine();
		int soo2 = Integer.parseInt(two);
		System.out.println(soo1/soo2);
		}catch(Exception e) { //예외처리 조상클래스 이름은 Exception
			System.out.println("에러났다는~~~");
			System.out.println("0이 아닌 두개의 정수를 입력하세요");
			System.out.println(e); //.toString();
					//java.lang.Arith... / by zero
			System.out.println(e.getMessage()); //  / by zero
			//oracle: ora-10976
			//c언어 : errno 4069 자바 : message
		}//finally 생략 가능
		finally {
			System.out.println("gooooooooooooooooooooood");
			//DB 접속 close , 파일 close
		}	
	}
}
