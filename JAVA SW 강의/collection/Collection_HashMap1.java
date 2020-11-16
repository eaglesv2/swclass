package collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Collection_HashMap1 {
	public static void main(String args[]) {
		HashMap <Integer,String> hm1 = new HashMap<Integer,String>();
		//HashMap + Generic
		//클래스 이름을 HashMap으로 하면 안됨
		//처리속도가 빠르다 -> 찾아가는 keyword 존재  (hashcode라는 개념?)
		//HashMap<Key,Value>
		
		System.out.println(hm1.size()); //0
		
				//wrap
				//KEY(Integer)   //VALUE(String)
		hm1.put(new Integer(100),"멋쟁이");
		hm1.put(new Integer(300),"공주");
		hm1.put(new Integer(200),"왕자");
			//put = ArrayList add
	
		System.out.println(hm1.get(300)); //KEY를 불러내면 VALUE가 출력
		
		/*String s1 = hm1.get(100);
		System.out.println(s1);*/
		System.out.println(hm1.get(100));
		System.out.println(hm1.get(200));
		
		
		hm1.remove(300);
		if(hm1.size()>0)
			System.out.println(hm1.size());
		//----key   value----
		//----100     멋쟁이----
		//----200     왕자----
		//-------------------
		
		
		//=======value모음 출력
		Collection<String> v1 = hm1.values();
		System.out.println(v1);
		
		//=======key모음 출력
		Set<Integer> s1 = hm1.keySet();
		System.out.println(s1);
		
		//#######key-value 출력
		//(이 소스에서 s1은 key 집합, 100, 200) 즉, 앞에 있는 s1을 사용
		for(Integer i : s1) {
			System.out.println(i + "\t" + hm1.get(i));
							//key		   //value
		}
		
		//#######key-value 출력-2(k + V 모음)
		Set<Map.Entry <Integer,String>> set3 = hm1.entrySet();
		for(Map.Entry <Integer,String> k : set3) {
			System.out.println(k.getKey() + "\t" + k.getValue());
		}
	}
}
