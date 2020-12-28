package Dec_24;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer { //TcpServer.java
	public static void main(String args[]) throws IOException {
											// port no. (21,80) -1024
		ServerSocket ss1 = new ServerSocket(7779); // listen
		System.out.println("전화는 준비되어 있음 . . . . ");
		
		while(true) {
			System.out.println("전화 기다리는 중 . . . .");
			Socket s1 = ss1.accept(); //accept
			System.out.println(s1.getInetAddress() + "에서 전화왔네");
			//------------------------------------------------
			// 파일문법 = 네트워킹문법
			DataOutputStream dos1 = new DataOutputStream(s1.getOutputStream());
			dos1.writeUTF("야~~오랜만이네");
			//------------------------------------------------
			dos1.close();
			s1.close();
		}
	}//main-end
}//class-end
