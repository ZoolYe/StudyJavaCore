package day26.tcp.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;


public class TransClient {

	public static void main(String[] args) throws UnknownHostException, IOException {

		/* 思路：
		 * 客户端：
		 * 1，需要先有，Socket短点
		 * 2，客户端数据源：键盘
		 * 3，客户端的目的：Socket
		 * 4，接收服务端的数据，源：Socket
		 * 5，数据显示在控制台打印出来:目的：控制台
		 * 6，在这些流中操作的数据，都是文本数据
		 * 转换客户端：
		 * 1，创建Socket客户端短点
		 * 2，获取键盘录入
		 * 3，将录入的信息发送给Socket输出流
		 * */
		
		//1，创建Socket客户端对象
		Socket s = new Socket("192.168.0.101",6248);
		//2，获取键盘录入
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//3，Socket输出字节流
		OutputStream out = s.getOutputStream();
		//将字节流，转换成字符流
		OutputStreamWriter osw = new OutputStreamWriter(out);
		
		//4，Socket输入流，读取服务端返回的大写数据
		InputStream is = s.getInputStream();
		//将字节流转成字符流
		InputStreamReader isr = new InputStreamReader(is);
		//字符读取流缓冲区
		BufferedReader outbr = new BufferedReader(isr);
		
		//读取键录入的数据
		String line = null;
		while((line = br.readLine())!=null) {
			if(line.equals("over")) {
				break;
			}
			osw.write(line);
			osw.flush();
			
			//读取服务端返回的大写数据
			String upperLine = outbr.readLine();
			System.out.println(upperLine);
		}
		//关闭资源
		s.close();
		br.close();
		osw.close();
		outbr.close();
	}

}
