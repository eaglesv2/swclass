package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;


public class Collection_Queue1 {
	// Queue (fifo : first in first out)
	//        lilo : last in last out
	
/*collection 인터페이스
  -->Queue(큐) 인터페이스 --> 상속받아 만든 LinkedList 클래스
 LinkedList <String> q2 = new LinkedList <String>(); //
 배열과 같은 종류 / 큐는 연속적으로 저장할 때 쓰임
*/
	
	public static void main(String args[]) {
		/*Queue q1 = new LinkedList(); //(o) */
		/*LinkedList <String> q1 = new LinkedList <String>(); //o */
		Queue <String> q1 = new LinkedList <String> (); //o		
		
		q1.offer("바보");
		q1.offer("온달");
		q1.offer("평강공주");
		
		System.out.println(q1.size()); //3
		
		//Queue 출력 1
		System.out.println(q1); //queue 내용 출력
		
		//Queue 출력 2
		//--- 이것은 원래 출력 명령이 x
		//Iterator : collection에 저장되어 있는 내용을 저장해주는 객체 / 종이박스
		Iterator itrl = q1.iterator();
		while(itrl.hasNext()) {  //itrl 변수에 다음 데이터가 있을 때 까지 실행한다 
								 //hasNext() 다음데이터가 있는지 boolean(true/false)로 반환
			/*String name1 = (String) itrl.next();
			System.out.println(name1); */
			System.out.println(itrl.next()); //위 2줄을 쓰나 이렇게 1줄쓰나 똑같음
		}
		
		
		//갑이 들어있어 ?????
		if(!q1.isEmpty()) //q1이 비어있지 않으면
			q1.poll();    //꺼내는 메소드(앞에서부터) - 바보
		if(!q1.isEmpty())
			q1.poll();    // 온달 꺼냄
		q1.offer("홍길동"); // 평강공주 뒤에 홍길동 추가
		System.out.println(q1.size()); //2
		System.out.println(q1.peek()); //제일 처음 출력값 //평강공주 
		System.out.println(q1); //[평강공주, 홍길동]
		
	}
}
