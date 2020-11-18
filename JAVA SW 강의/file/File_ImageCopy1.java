package file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class File_ImageCopy1 {
	
	//Q)파일 copy, 단 byte 단위로, args[]를 사용
	
	public static void main(String args[]) throws IOException {
		
		int imsi = 0; //'A' ==> 문자상수(문자A이면서 동시에 아스키코드 65)
		FileInputStream fis1 = null;
		FileOutputStream fos1 = null;
		
		
		if(args.length>=2) { //원본 파일명과 사본 파일명 합해서 2개 파일
			fis1 = new FileInputStream(args[0]); //open
			fos1 = new FileOutputStream(args[1], false); //open
								//명령행인자 aa.jpg bb.jpg
		
			while((imsi=fis1.read()) != -1) {
				//read() 괄호 안이 비어있으면 한 바이트 단위로 처리
				fos1.write(imsi); //파일에 출력
				System.out.println(imsi + "나 지금 복사 중인데~~");
			}
			fis1.close(); fos1.close();
		}
	} //run configurarion    d:/Java_jay/aa.jpg   d:/Java_jay/bb.jpg
}
