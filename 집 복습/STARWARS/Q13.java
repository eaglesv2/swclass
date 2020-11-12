package STARWARS;

public class Q13 {
	public static void main(String args[]) {
		/*STARWARS
		*****
		****
		***
		**
		*
		**
		***
		****
		*****  */
		for(int i=1; i<=10; i++) {
			if(i<=5) {
				for(int j=5; j>=i; j--) {
					System.out.print("*");
				}
				System.out.println();
			}
			if(i>5) {
				for(int j=1; j<i-4; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}
}
