package Dec_28;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpClient { //TcpClient.java
	public static void main(String args[]) throws NumberFormatException, UnknownHostException, IOException {
		if(args.length != 2) {
			System.out.println("사용법은 java 파일명 ip주소");
			System.exit(1);
		}
		
		//connect 작업
		Socket s1 = new Socket(args[0], Integer.parseInt(args[1]));
								//ip address    //port no.
		
		//recv, send ==> 무전기 안될려면 thread로 작성해야함
		//BUT 이미 작성되어 있다 TcpServer에서 정의됨 ==> 객체만 만들면 된다
		
		ThreadSend tsendcli1 = new ThreadSend(s1);
		ThreadRcv trcvcli1 = new ThreadRcv(s1);
		
		tsendcli1.start();
		trcvcli1.start();
	}//main-end
}//main-class-end
