package day27.ie;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class MyTomcat {

	public static void main(String[] args) throws IOException {

		ServerSocket ss = new ServerSocket(6248);
		Socket s = ss.accept();
		
		BufferedInputStream bufIn = new BufferedInputStream(s.getInputStream());
		byte [] buf = new byte[1024];
		int len = 0;
		while((len = bufIn.read(buf))!=-1) {
			String str = new String(buf,0,len);
			System.out.println(str);
		}
		
		
		PrintWriter out = new PrintWriter(s.getOutputStream(),true);
		out.println("你好我是服务器，我已经挂了");
		s.close();
		ss.close();
	}

}
