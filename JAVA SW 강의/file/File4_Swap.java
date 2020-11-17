package file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

//Q) 서로 다른 두 파일을 이름은 그대로 두고 내용만 swap 하시오

public class File4_Swap {
	
	public static void main(String args[]) throws IOException {
		
		//aa.txt --> imsi.txt
		BufferedReader br1 = new BufferedReader
				(new FileReader("d:/Java_jay/aa.txt"));
		PrintWriter pw3 = new PrintWriter
				(new BufferedWriter
					(new FileWriter("d:/Java_jay/imsi.txt", false)));
		
		String s1 = null;
		while((s1=br1.readLine()) != null) {
			pw3.println(s1);
		}
		
		br1.close(); pw3.close(); //aa.txt --> imsi.txt close
		
		//cc.txt --> aa.txt
		BufferedReader br2 = new BufferedReader
				(new FileReader("d:/Java_jay/cc.txt"));
		PrintWriter pw1 = new PrintWriter
				(new BufferedWriter
					(new FileWriter("d:/Java_jay/aa.txt", false)));
		
		String s2 = null;
		while((s2=br2.readLine()) != null) {
			pw1.println(s2);
		}
		br2.close(); pw1.close(); //cc.txt --> aa.txt close
		
		//imsi.txt --> cc.txt
		BufferedReader br3 = new BufferedReader
				(new FileReader("d:/Java_jay/imsi.txt"));
		PrintWriter pw2 = new PrintWriter
			(new BufferedWriter
				(new FileWriter("d:/Java_jay/cc.txt", false)));

		String s3 = null;
		while((s3=br3.readLine()) != null) {
			pw2.println(s3);
		}
		br3.close(); pw2.close();  //imsi.txt --> cc.txt close
		
					//imsi.txt 파일에 대한 파일 객체 생성
		File f1 = new File("d:/Java_jay/imsi.txt");
		if(f1.exists()) { //파일 있어?? 그런데 결과는 true야 false야
			if(f1.delete()) // 파일을 지우자 그런데 결과는 true야 false야
				System.out.println("임시파일 안녕이라는~~~");
			else
				System.out.println("ㅇㄱㄹㅇ~ 오잉 에러야~~웬열~~!!!");
		} //f1.exists-yes-end
		else // 파일이 없으면
			System.out.println("지울 파일 없어!!!!!!!!");
	}//main-end
}//class-end
