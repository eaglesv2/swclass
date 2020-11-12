package mybang3;

public class For5 {
	public static void main(String args[]) {
		
		/*STARWARS
		 *****
		 ***** 
		 ***** 
	    */
		
		/*for(int i=1;i<=3;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print("*");
			}
			System.out.println();
		}*/
		
		/*STARWARS2
		  *
		  **
		  ***
		  ****
		  *****
		*/
		//i=행 j=열
		//행 1~5까지 변함
		//열 1~변하면 비워둔다
		/*for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}*/
		/*STARWARS3
		      *
		     **
		    ***
		   ****
		  *****
		*/
		//i=행 j=열
		//행 1~5까지 변함
		//열 1~변하면 비워둔다
		/*for(int i=1;i<=5;i++) {
			for(int j=1;j<=5-i;j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) {
				System.out.print("*");	
			}
			System.out.println();
		}
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i-1; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=6-i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}*/
		
		//다이아몬드
		
		for(int i=1; i<=5; i++) {
			for(int j=5; j>i; j--) {
				System.out.print(" ");
			}
			for(int k=1; k<=2*i-1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=9-2*i; k++ ) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
