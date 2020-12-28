package Dec_24;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpClient { //TcpClient.java
	public static void main(String args[]) throws UnknownHostException, IOException {
								//ip address  //port no.
		Socket s1 = new Socket("127.0.0.1", 7779);
		
		/////////////////////////////////////////
		DataInputStream dis1 = new DataInputStream(s1.getInputStream());
		System.out.println("네 말대로 " + dis1.readUTF());
		/////////////////////////////////
		dis1.close();
		s1.close();
		System.out.println("전화끊어짐");
	}
}
