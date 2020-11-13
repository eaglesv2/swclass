package array;

import java.util.Arrays;

public class Array11 {
	public static void main(String args[]) {
		//Q) 다음 배열을 소트하여 오름차순 및 내림차순으로 출력하시오
		// sort : key(기준) , 차순(ascending, descending)
		// 내부소트(memory sort) : radox, selection, bubble, insertion, shell, ..
		// 외부소트 : disk(2-way merge sort, k-way)
		
		int [] bae = {10,90,100,60,70};
		
		
		/*Arrays.sort(bae); 
		//오름차순       //배열의 대표명    자바에 저장된 명령어*/	
		
		//직접 짜야 한다면
		int [] k = {10,90,100,60,70,23};
		//------------------------------
		int imsi;
		/*for(int i=0; i<k.length-1; i++) { //
			for(int j=0; j<k.length-1-i; j++) { // 맨 오른쪽 칸은 비교할 필요 없기 때문에 -i번 비교
				if(k[j]<k[j+1]) {
					imsi = k[j];
					k[j] = k[j+1];
					k[j+1] = imsi;
				}
			} //for-j-end
		} //for-i-end */		
		
		for(int i=0; i<k.length-1; i++) { // 총 비교 횟수
			int sw = 0; //스위치를 꺼둔다
			for(int j=0; j<k.length-1-i; j++) { // 맨 오른쪽 칸은 비교할 필요 없기 때문에 -i
				if(k[j]<k[j+1]) {
					imsi = k[j];
					k[j] = k[j+1];
					k[j+1] = imsi;
					sw = 1; // zigzag을 하면 스위치를 킨다
				}
				if(sw==0)
					break; //스위치가 안켜졌으면 다음 줄을 비교한다
			} //for-j-end
		} //for-i-end
		
		
		
		
		for (int i = 0; i < k.length; i++) {
			System.out.print(k[i] + "\t");
		}
		System.out.println();
		for (int i = k.length-1; i >= 0; i--) {
			System.out.print(k[i] + "\t");
		}
	}
}
