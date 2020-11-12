package mybang3;
import java.util.*;
public class For3 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		  System.out.print("n1: ");
          int n1 = sc.nextInt();
          System.out.print("n2: ");
          int n2 = sc.nextInt();
          System.out.print("n3: ");
          int n3 = sc.nextInt();
          // n1 ~ n2 숫자 n3배수 구하기 ex) 1 100 5 -> 1~100 5의배수를구하라! 
          //조건식X ifX
          
          
          for(int i=n1+(n3-n1%n3); i<=n2; i+=n3) {
        		  System.out.println(i);
          }
	}
}
