package array;

public class Array8 {
	public static void main(String args[]) {
	   /* 1  2  4  7  11
		  3  5  8  12 16
		  6  9  13 17 20
		  10 14 18 21 23
		  15 19 22 24 25    빗줄기 배열*/

		int[][] A = new int[5][5];
		int n=0;
		
		for(int k=0; k<9; k++) {
			for(int i=0; i<A.length; i++) {
				int j = k-i;
				if(j>=0&&j<5) {
					n++;
					A[i][j] = n;
				}
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
