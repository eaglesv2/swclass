package collection;

import java.util.Iterator;
import java.util.Stack;

public class Collection_Stack1 {
	//stack lifo filo(push pop)
	//입구 출구가 1개 / 먼저 들어온게 마지막에 나감
	public static void main(String args[]) {
		Stack <String> st1 = new Stack <String> ();
		
		st1.push("카레");
		st1.push("볶음밥");
		st1.push("뚝불고기");
		System.out.println(st1.size()); //3
		
		//----------------------------------
		System.out.println("=====Iterator로 출력=====");
		Iterator itrl = st1.iterator();  // Collection의 구조를 신경 안씀 / 앞에서부터 출력 
										 // Stack은 들어간 역순으로 나와야함
		while(itrl.hasNext()) {
			System.out.println(itrl.next()); //카레 볶음밥 뚝불고기
		}  
		
		System.out.println(st1);
		
		//----------------------------------
		System.out.println("=====pop으로 출력=====");
		while(!st1.isEmpty()) 
			System.out.println(st1.pop()); //뚝불고기 볶음밥 카레
	}
}
