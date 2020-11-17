package file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class File3_CopyProgram {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader
								(new FileReader("d:/Java_jay/aa.txt"));
		PrintWriter pw = new PrintWriter
							(new BufferedWriter
								(new FileWriter("d:/Java_jay/dd.txt", false)));
		
		String s = null;
		while((s=br.readLine()) != null) {
			System.out.println("나~~복사중~~~");
			pw.println(s);
		}
		br.close();
		pw.close(); //반드시 닫아줘야 함
	}
}
