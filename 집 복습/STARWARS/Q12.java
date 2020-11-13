package STARWARS;

public class Q12 {
	public static void main(String args[]) {
		/*STARWARS
		*
		**
		***
		****
		*****
		****
		***
		**
		*  */
		for(int i=1; i<=10; i++) {
			if(i<=5) {
				for(int j=1; j<=i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			if(i>5) {
				for(int j=1; j<=10-i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}
}
