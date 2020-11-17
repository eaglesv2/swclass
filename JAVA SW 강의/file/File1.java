package file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class File1 {
	
	//file
	//stream  :    byte stream  /  문자 stream
	//				  input     /  output stream
	
	/*file을 처리하는 로직(text viewer의 경우)
	open(owner) 소유권이 생기는 것

	read(write)
	화면출력

	close(free) 소유권을 풀어주는 것
	*/
	
	public static void main(String args[]) throws IOException {
		FileReader fr = new FileReader("d:/Java_jay/aa.txt"); //==>open
			//참고적으로  input, output, stream이 보이면 바이트 stream
			//reader, writer가 보이면 문자 stream
		
		BufferedReader br = new BufferedReader(fr); //open 도우미
		//임시방에 버퍼링한 후 한줄처리 해보자는~~~~~
		
		//read는 파일에서 읽어서 to 기억창고(변수)
		//write는 키보드 등으로 입력하여 to 파일에
		
		//메모장에서 내용 끄집어내기
		String s = null;
			//file read - 화면 출력(write)   // byte readInt...
		while((s=br.readLine()) != null) { //한줄의 끝이 아니면 출력
								//한글자의 끝(?) : eof(end of file), -1
			System.out.println(s);
		}
		br.close();
		fr.close();	
	}
}
