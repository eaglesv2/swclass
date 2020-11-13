package array;

public class Array7 {
	public static void main(String args[]) {
		int [][]A = new int[3][3];

		/*for(int i=0; i<A.length; i++) {
			for(int j=0; j<A[i].length; j++) {
				A[i][j] = (i+1)+3*j;
			}
		}*/
		
		int n=0;
		for(int i=0; i<A.length; i++) {
			for(int j=0; j<A[i].length; j++) {
				n++;
				A[j][i] = n;
			}
		}
		
		for(int i=0; i<A.length; i++) {
			for(int j=0; j<A[i].length; j++) {
				System.out.print(A[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
