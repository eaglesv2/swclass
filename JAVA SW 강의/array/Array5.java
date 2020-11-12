package array;

public class Array5 {
	public static void main(String args[]) {
		//2차원 배열
		/*int [][] pyo = new int[2][3]; //[층수][호수]
		pyo[0][0] = 10;
		pyo[1][2] = 50;*/
		//int [][]pyo = {10,20,30,40,50,60}; 2차원을 표현해줘야한다
		int [][]pyo = {{10, 20, 30},
			           {40, 50, 60}};
		for(int i=0; i<pyo.length;i++) {
			for(int j=0; j<pyo[i].length; j++) {
				System.out.print(pyo[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
