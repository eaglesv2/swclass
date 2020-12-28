package multichat;

import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

class ServerClass {
	ArrayList<ThreadServerClass> threadList = new ArrayList<ThreadServerClass>();
	
	Socket socket;
	DataOutputStream outputStream;
	
	public ServerClass(int portno) { //생성자
		Socket s1 = null;
		
		ServerSocket ss1 = new ServerSocket(portno);
		System.out.println("서버가동......");
		
		while(true) {
			s1 = ss1.accept();
			System.out.println("접속주소 : " + s1.getInetAddress() + ", 접속포트 : " + s1.getPort());
			ThreadServerClass tServer1 = new ThreadServerClass(s1);
			tServer1.start();
			
			threadList.add(tServer1); //컬렉션에 add
			System.out.println("접속자 수 : " + threadList.size());
		}//while-end
	}//생성자-end
	
	//접속중인 쓰레드에 chat 내용 보냄
	public void sendChat(String chat) {
		for(int i=0; i<threadList.size(); i++) {
			threadList.get(i).outputStream.writeUTF(chat);
		}
	}
}//ServerClass-end

public class TcpMulServer {
	public static void main(String args[]) {
		if(args.length != 1) {
			System.out.println("사용법 : 서버실행은 \'java 패키지명.파일명 포트번호\' 형식으로 입력");
		}
		new ServerClass(Integer.parseInt(args[0])); ///////
	}//main-end
}//main-class-end
