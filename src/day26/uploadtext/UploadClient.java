package day26.uploadtext;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class UploadClient {

	public static void main(String[] args) throws UnknownHostException, IOException {
		
		//1，创建客户端Socket端点
		Socket s = new Socket("192.168.0.101", 6248);
		
		//2，创建数据源，从硬盘上读取文件
		BufferedInputStream bufis = new BufferedInputStream(new FileInputStream("C:\\Users\\ZOOL\\Desktop\\浙江.pptx"));
		
		//3，获取Socket输出字节流，将字节流加上字节流缓冲区
		BufferedOutputStream bufos = new BufferedOutputStream(s.getOutputStream());
		
		//创建缓冲区，每次读取1024个字节
		byte []buf = new byte[1024];
		//记录上次读取的位置
		int len = 0;
		//循环读取文件中的数据
		while((len = bufis.read(buf))!=-1) {
			//将数据写到Socket输出流中
			bufos.write(buf, 0, len);
			//刷新数据
			bufos.flush();
		}
		//告诉服务器，输出流结束了
		s.shutdownOutput();
		
		//获取Socket输入流，获取服务器返回的数据
		BufferedInputStream refis = new BufferedInputStream(s.getInputStream());
		//创建缓冲区，用于存储，服务器返回的数据
		byte []rebuf = new byte[1024];
		//读取服务器返回的数据
		int relen = refis.read(rebuf);
		//将服务器返回的数据转成字符串
		String str = new String(rebuf,0,relen);
		System.out.println("客户端"+str);
		//关闭资源
		refis.close();
		s.close();
	}

}
