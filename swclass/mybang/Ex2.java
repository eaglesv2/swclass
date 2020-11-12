package mybang;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ppp = null;
		String qqq = ""; //빈문자열 //길이가 0인 문자열
		                 //문자 : 한 문자 'A' , 문자열 : 여러 문자 "A", "tom"
		
		//System.out.println(ppp.length()>0); //null pointer error
		//System.out.println(qqq.length()>0); //false
		
		String aa = "ondal";
		String bb = "ondal";
		if(aa==bb) //번지 비교
			System.out.println(aa+ "\t" + bb);
		
		if(aa.equals(bb)) //내용 비교
			System.out.println(aa+ "\t" + bb);
		
		/*String aa2 = "ondal2";
		String bb2 = "ondal3";
		if(aa2==bb2) //번지 비교
			System.out.println("==같네");
		
		if(aa2.equals(bb2)) //함수,메소드 //값비교
			System.out.println("equals같네");
		
		다 다르기 때문에 값이 나오면 안된다*/
		
		/*String aa = "ondal";
		String bb = "ondal";*/
		
		String cc = new String("ondal"); //오리지날 방식
		String dd = new String("ondal"); //같은 ondal이어도 heap memory에 따로 생성
		
		if(cc==dd) //번지 비교
			System.out.println("번지가 다르면 이것 안출력");
		
		if(cc.equals(dd)) //함수,메소드 //값비교
			System.out.println("값이 같으면 이것 출력");
		
	}
}