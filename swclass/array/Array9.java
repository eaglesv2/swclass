package array;

public class Array9 {
	public static void main(String args[]) {
	   /* 1  2  3  4  5
		  16 17 18 19 6
		  15 24 25 20 7
		  14 23 22 21 8 
		  13 12 11 10 9     달팽이 배열*/
		
		int[][] A = new int[5][5];
		int n=0;
		
		
		while(n<=25) {
			for(int a=0; a<A.length; a++) {
				n++;
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
