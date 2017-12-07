package day26.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo2 {

	public static void main(String[] args) throws IOException {
		//服务端接收客户端发送过来的数据
		/* 建立TCP服务端的思路:
		 * 1，创建服务端的socket服务，通过ServerSocket对象
		 * 2，服务端必须要对外提供一个端口，否则客户端无法连接
		 * 3，获取连接过来的客户端对象
		 * 4，通过客户端对象，获取Socket流，读取客户端发来的数据
		 * 5，关闭资源，关客户端，关服务端
		 * */
		//1，创建服务端对象，指定端口
		ServerSocket ss = new ServerSocket(10002);
		
		//2，获取连接过来的客户端对象
		Socket s = ss.accept();
		
		//3，通过Socket对象获取输入流，要读取客户端发来的数据
		InputStream is = s.getInputStream();
		
		byte []buf = new byte[1024];
		int len = is.read(buf);
		String data = new String(buf,0,len);
		System.out.println("server: "+data);
		
		//获取客户端的Socket对象的IP对象
		InetAddress ip = s.getInetAddress();
		//获取客户端的ip地址
		String ip_add = ip.getHostAddress();
		//获取客户端的端口号
		int port = s.getPort();
		System.out.println("IP: "+ip_add+"  端口："+port);
		
		//使用客户端socket对象的输出流给客户端返回数据
		OutputStream out = s.getOutputStream();
		out.write("收到！".getBytes());
		
		s.close();
	}

}
