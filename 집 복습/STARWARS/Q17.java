package STARWARS;

public class Q17 {
	public static void main(String args[]) {
		/*STARWARS
        *********  
         *******
	      *****
	       ***
	        *    */
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i-1; j++) {
				System.out.print(" ");
			}
			for(int k=9; k>=2*i-1; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
