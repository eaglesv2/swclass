package string;

public class string2 {
	public static void main(String args[]) {
		
		// 한글자 또는 여러 문자열로 시작되는지? 또는 끝나는지?
		
		String s1 = "good";
		
		if(s1.startsWith("go"))
			System.out.println("good");
		
		if(s1.endsWith("ood"))
			System.out.println("good");
	}
}
