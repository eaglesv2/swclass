package array;

import java.util.Arrays;

public class Array13 {
	public static void main(String args[]) {
		/*<검색의 종류>
		순차검색 (sequence search) 평균 검색 횟수 : (n+1)/2
		이진검색 (binary search) 평균 검색 횟수 : log2(n+1) (2:아래첨자)
		*/
		
		int[] arr = {11,84,45,78,34,9,2};
		//2 9 11 34 45 78 84
		Arrays.sort(arr);
		
		
		//순차검색
		/*int sw=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==78) {
				System.out.println("0번쨰부터 시작하여 " + i + "번째에 있다는~~~");
				sw=1;
			}
		}
		if(sw==0)
			System.out.println("뭐야 없구만");
		*/
		
		//이진검색 - 함수 메소드가 존재함 --- Arrays.binarySearch(배열,찾으려는값)
		System.out.println("78은 " + Arrays.binarySearch(arr, 78) + "번째에 있다는");
		
		//이진검색 - 찾고자 하는 값이 없을 경우 값이 있냐고 물어봐야함
		if(Arrays.binarySearch(arr, 78)>=0) { //값이 있는 경우
			System.out.println("찾았네~");
			System.out.println("0번쨰부터 시작하여 " + Arrays.binarySearch(arr, 78) + "번째에 있네~~");
		}
		else //갑이 없으면 이것 출력
			System.out.println("웬열~~1도 없다는~~~");
	}
}
