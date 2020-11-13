package array;

public class Array6 {
	public static void main(String args[]) {
		int [][]A = new int[3][3];

		for(int i=0; i<A.length; i++) {
			for(int j=0; j<A[i].length; j++) {
				A[i][j] = A.length*i+j+1;
			}
		}
		
		/*int n=0;
		for(int i=0; i<A.length; i++) {
			for(int j=0; j<A[0].length; j++) {
				n++;
				A[i][j] = n;
			}
		}*/
		
		for(int i=0; i<A.length; i++) {
			for(int j=0; j<A[i].length; j++) {
				System.out.print(A[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
