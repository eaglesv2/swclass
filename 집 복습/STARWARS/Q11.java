package STARWARS;

public class Q11 {
	public static void main(String args[]) {
		/*STARWARS
	     *
	    **
	   *** 
	  ****
	 ***** */
		for(int i=1; i<=5; i++) {
			for(int j=5; j>0; j--) {
				if(j>i)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}
	}
}
