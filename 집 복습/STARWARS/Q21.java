package STARWARS;

public class Q21 {
	public static void main(String args[]) {
		/*STARWARS
		*********
		 *******
		  *****
		   ***
		    *
		   *** 
		  *****
		 *******
		*********   */
		for(int i=1; i<=9; i++) {
			if(i<=5) {
				for(int j=1; j<=i-1; j++) {
					System.out.print(" ");
				}
				for(int k=9; k>=2*i-1; k--) {
					System.out.print("*");
				}
				System.out.println();
			}
			if(i>5) {
				for(int j=1; j<=5-(i-4);j++) {
					System.out.print(" ");
				}
				for(int k=1; k<=2*(i-4)-1; k++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		
	}	
}
