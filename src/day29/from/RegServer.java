package day29.from;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class RegServer {

	public static void main(String[] args) throws IOException {
		
		ServerSocket ss = new ServerSocket(6248);
		Socket s = ss.accept();
		
		InetAddress ip = s.getInetAddress();
		String ip_add = ip.getHostAddress();
		int port = s.getPort();
		System.out.println(ip_add+"     "+port);
		
		InputStream is = s.getInputStream();
		byte []buf = new byte[1024];
		int len = 0;
		len = is.read(buf);
			String str = new String(buf,0,len);
			System.out.println(str);
		
		PrintWriter pw = new PrintWriter(s.getOutputStream(),true);
		pw.println("<font color='green' size=7>×¢²á³É¹¦</font>");
		
		s.close();
		ss.close();
		is.close();
		pw.close();
	}

}
