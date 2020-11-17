package file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class File2 {
	public static void main(String args[]) throws IOException {
		
		//input, output ==> byte 단위
		//reader, writer ==> 문자 단위
		//키보드 입력을 위해
		/*InputStreamReader isr1 = new InputStreamReader(System.in); //byte - 문자 연결고리
		BufferedReader br1 = new BufferedReader(isr1); //입력 도우미 */	
		
		//키보드 입력을 위해 위 내용을 줄여쓴 것
		BufferedReader br = new BufferedReader
								(new InputStreamReader(System.in));
		
		//파일에 내용을 넣기 위해 (수록하기 위해) 파일을 open
		//출력을 위해                                            //append x
		/* 파일을 여는 이유 1.읽기  2.쓰기(수록)
		FileWriter fw = new FileWriter("d:/Java_jay/cc.txt", false); //파일에 수록할려고 파일을 여는 순간 내용이 싹 날라가게 함(false)
																	 //true일 경우 기존의것 보존하고 밑에 추가함
		BufferedWriter bw = new BufferedWriter(fw); //writer 도우미
		PrintWriter pw = new PrintWriter(bw); //파일에 수록하기 위해 출력을 편리하고 부드럽게 해주는 도우미
		*/
		
		PrintWriter pw = new PrintWriter
							(new BufferedWriter
								(new FileWriter("d:/Java_jay/cc.txt", false))); //한줄에 줄여서 쓴 것
		
		//여기서 true는 생략 가능하고, true가 있으면 autoflush 기능이 있음을 의미
		//flush : 출력 버퍼에 모여있는 내용을 스트림으로 보내버리는 것
		//PrintWriter는 있으나 reader는 없다
	
		
		
		System.out.println("저장할 데이터를 입력해주세요(입력 끝은 ctrl+z)");
		String s = null;
		while((s=br.readLine()) != null) { //from keyinput
			pw.println(s); //file cc.txt에 수록 //sysout
		}
		pw.flush(); //
		br.close();
		pw.close();
		/*bw.close();
		fw.close();*/
		
	}
}
