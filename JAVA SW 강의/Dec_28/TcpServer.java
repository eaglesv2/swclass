package Dec_28;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

class ThreadSend extends Thread {
	Socket s1; //from Client
	DataOutputStream dos1; //out
	//기본 데이터 타입별로 처리하기 (예) writeInt, writeUTF(문자열처리)
	String what1; //채팅시 맨앞에 나올 문자열 (예) 미팅중==>
	
	ThreadSend(Socket s1) throws IOException { //생성자
		this.s1 = s1; //s1받아서 s1필드에 넣기
		dos1 = new DataOutputStream(s1.getOutputStream());
								//send를 위한 i/o 스트림
		what1 = "미팅중==>"; //대화시 앞에 항상 붙는 단어
	}//생성자-end
	
	public void run() {
		Scanner sc = new Scanner(System.in); //화면입력받아
		while(dos1 != null) { //chat 있으면
			try {
				dos1.writeUTF(what1 + sc.nextLine());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}//while-end
	}//run-end
}//class-end

class ThreadRcv extends Thread {
	Socket s1;
	DataInputStream dis1; //in
	
	ThreadRcv(Socket s1) throws IOException {
		this.s1 = s1;
		dis1= new DataInputStream(s1.getInputStream());
	}
	
	public void run() {
		while(dis1 != null) {
			try {
				System.out.println(dis1.readUTF()); ////
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}//run-end
}//ThreadRcv-class-end

public class TcpServer {
	public static void main(String args[]) throws IOException {
		if(args.length !=1) {
			System.out.println("사용법은 java 파일명 포트번호");
			System.exit(1);;
		}
		
		ServerSocket ss1 = new ServerSocket(Integer.parseInt(args[0]));
		System.out.println("서버 잘 준비됨 . . .");
		
		while(true) {
			System.out.println("미팅 대화 기다리는 중. . . .");
			Socket s1 = ss1.accept(); //connect를 받자
			
			//아래는 원래 receive / send 가 오는자리
			//여기에 thread를 사용
			///////////////////  이제는 무전기 방식 아님
			ThreadSend tsendSer1 = new ThreadSend(s1);//초기치//주거니
			ThreadRcv trcvSer1 = new ThreadRcv(s1);//받거니를 위해
			tsendSer1.start();
			trcvSer1.start();
		}//while-end
	}//main-end
}//메인클래스-end
