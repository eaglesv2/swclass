package STARWARS;

public class Q10 {
	public static void main(String args[]) {
		/*STARWARS
	     *****
	      ****
	       *** 
	        **
	         * */
		/*for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if(j>=i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}*/
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<i; j++) {
				System.out.print(" ");
			}
			for(int k=5; k>=i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
