package day26.tcp.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class TransServer {

	public static void main(String[] args) throws IOException {

		/* 转换服务端。
		 * 分析：
		 * 1，ServerSocket服务
		 * 2，获取Socket对象
		 * 3，源：Socket，读取客户端发过来的需要转换的数据
		 * 4，目的：显示在控制台上
		 * 5，将数据转成大写发给客户端
		 * */
		
		//1，创建服务端Socket端点
		ServerSocket ss = new ServerSocket(6248);
		
		//2，获取Socket对象
		Socket s = ss.accept();
		
		//获取客户端连接信息
		InetAddress ip = s.getInetAddress();
		String ip_add = ip.getHostAddress();
		int port = s.getPort();
		System.out.println(ip_add+port);
		
		
		//3，获取Socket读取流
		InputStreamReader isr = new InputStreamReader(s.getInputStream());
		BufferedReader bufReader = new BufferedReader(isr);//字符流缓冲区
		
		//获取Socket输出流
		PrintWriter out = new PrintWriter(s.getOutputStream(),true);
		
		String line = null;
		while((line = bufReader.readLine())!=null) {
			//将字符串转成大写
			String upStr = line.toUpperCase();
			out.println(upStr);
		}
		s.close();
		ss.close();
	}

}
