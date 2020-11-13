package string;

public class string3 {
	public static void main(String args[]) {
		
		/* >duhae 30 80 */
		 /* "30"-->30 */

		if(args.length != 2) { //값을 제대로 안 넣은 것
			System.out.println("정신 똑바로!!!!!!");
			System.out.println("사용법은 명령 숫자 숫자");
			//return; // System.exit(-1);
			System.exit(-1); // (0) = 정상적인 종료   (다른숫자) = 비정상적인 종료(강제종료)
			//c: exit(-1)
			//c#: Environment.Exit(10)
		}
		
		System.out.println(Integer.parseInt(args[0]) +Integer.parseInt(args[1]));
	}
}
