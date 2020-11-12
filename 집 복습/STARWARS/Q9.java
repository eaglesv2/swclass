package STARWARS;

public class Q9 {
	public static void main(String args[]) {
	/*STARWARS
	*****
	****
	***
	**
    */
		for(int i=1; i<=5; i++) {
			for(int j=5; j>=i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
