package day26.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TCPClienDemo2 {

	public static void main(String[] args) throws IOException {
		
		//客户端发数据到服务端
		/* TCP传输，客户端建立的过程
		 * 1，创建TCP客户端socket服务，使用的是socket对象
		 * 		建议该对象一创建就明确该目的地，要连接的主机
		 * 2，如果连接建立成功，说明数据传输通道已建立
		 * 		该通道就是socket流，是底层建立好的，说明这里既有输入，又有输出，要想输入或者输出对象，可以找socket来获取
		 * 		可以通过getOutputStream(),getInputStream()来获取两个字节流
		 * 3，使用输出流，将数据写出
		 * 
		 * 4，关闭资源
		 * */
		
		//1，创建TCP客户端socket服务
		Socket socket = new Socket("192.168.0.102",10002);
		
		//获取socket流中的输出流
		OutputStream out = socket.getOutputStream();
		
		//使用输出流将指定的数据写出去
		out.write("你好服务端".getBytes());
		
		//读取服务端返回的数据，使用Socket读取流
		InputStream is = socket.getInputStream();
		byte []buf = new byte[1024];
		int len = is.read(buf);
		String str = new String(buf,0,len);
		System.out.println(str);
		
		//关闭资源
		socket.close();
	}

}
