package STARWARS;

public class Q19 {
	public static void main(String args[]) {
		/*STARWARS
        ***** *****
        ****   ****
        ***     ***
        **       **
        *         *
        **       ** 
        ***     ***
        ****   ****
        ***** *****   */
		for(int i=1; i<=9; i++) {
			if(i<=5) {
				for(int j=5; j>=i; j--) {
					System.out.print("*");
				}
				for(int k=1; k<=2*i-1; k++) {
					System.out.print(" ");
				}
				for(int l=1; l<=5; l++) {
					if(l>=i)
						System.out.print("*");
				}
				System.out.println();
			}
			if(i>5) {
				for(int j=1; j<=i-4; j++) {
					System.out.print("*");
				}
				for(int k=1; k<=10-((i-4)*2-1); k++) {
					System.out.print(" ");
				}
				for(int l=1; l<=5; l++) {
					if(l<=i-4)
						System.out.print("*");
				}
				System.out.println();
			}
		}
	}
}
