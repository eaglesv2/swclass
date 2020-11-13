package mybang3;

public class For2 {
	public static void main(String args[]) {
		//Q) 1~100 사이의 수 중 3의 배수만 골라 출력하시오
		for(int i=1; i<=100; i++) {
			if(i%3 == 0) {
				System.out.println(i);
			}
		}
		/*다른 방법도 가능~
        for(int i=3; i<=100; i+=3) {
      	  System.out.println(i);
        }*/
	}
}
