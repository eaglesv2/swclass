package STARWARS;

public class Q14 {
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
		for(int i=1; i<=9; i++) {
			if(i<=5) {
				for(int j=1; j<=5; j++) {
					if(j>=i)
						System.out.print("*");
					else
						System.out.print(" ");
				}
				System.out.println();
			}
			if(i>5) {
				for(int j=5; j>0; j--) {
					if(j>i-4)
						System.out.print(" ");
					else
						System.out.print("*");
				}
				System.out.println();
			}
		}
	}
}
