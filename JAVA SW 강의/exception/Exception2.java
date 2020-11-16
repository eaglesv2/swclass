package exception;

import java.util.Scanner;

//throw

public class Exception2 {
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
		//================================================
		int bada = kaja(soo1,soo2);
		System.out.println(bada);
		//===============================================
		//System.out.println(soo1/soo2);
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
		
	private static int kaja(int soo1, int soo2) throws ArithmeticException {
		/*
		try{} catch(ArithmeticException e){}
		==> throws ArithmetixException 같은 의미
		throws는 결과적으로 try-catch를 만나서 처리되므로
		throws는 try-catch를 줄여쓴 것
		*/
		
		return soo1/soo2;
		
		/*if(soo2==0) {
			System.out.println("0으로 나눌 수 없어~");
			throw new ArithmeticException(); //throw 개발자가 능동적으로 에러를 발생시킨다(에러가 날 곳을 미리 알고)
											 //catch 에러를 수동적으로 받는다
		}
		else
			return soo1/soo2;*/
	}
}
