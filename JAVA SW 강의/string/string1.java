package string;

/*책이름을 배열에 넣은 후 JAVA책을 모두 검색하는
순차검색 프로그램을 작성하시오
  (자바책이 있을 경우 결과)
  	java Programming
  	easy Java Programming
  	Master of JAVA
  	C Language and java
  	Oracle and Java-JDBC
  (자바책이 없을 경우)
  	검색하신 책은 재고가 없습니다
  	
  	
  	"java" 포함된것 찾기 - indexOf("java") ==> 이 객체에 "java"는 어디에 찍혀 있어?
  	"java" 만 찾기 - .equals("java")
*/

public class string1 {
	public static void main(String args[]) {
		String[] books = {"java Programming",
						  "C# programming",
						  "easy Java Programming",
						  "Master of JAVA",
						  "C Language and java",
						  "Power Builder",
						  "Oracle and Java-JDBC"};

		int sw = 0; //스위치 기법
		for(int i=0; i<books.length; i++) {
			if(books[i].toUpperCase().indexOf("JAVA") >=0) { //배열 내 문자열을 전부 대문자로 전환하고 비교
				System.out.println(books[i]);                //indexOf()는 포함하면 포함된 위치를, 포함하지 않으면 -1 을 출력한다
				sw = 1;										 //books[i].toUpperCase().indexOf("JAVA") != -1 로 써도 됨
			}
		}
		
		if(sw==0)
			System.out.println("검색하신 책은 재고가 없습니다");
	}
}
