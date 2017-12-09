package day26.uploadtext;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class UploadServer {

	public static void main(String[] args) throws IOException {

		//创建服务端Socket对象，设置端口
		ServerSocket ss = new ServerSocket(6248);
		//获取Socket端点
		Socket s = ss.accept();
		//获取IP对象
		InetAddress ip = s.getInetAddress();
		//获取ip地址
		String ip_add = ip.getHostAddress();
		//获取端口
		int port = s.getPort();
		
		//获取Socket端点的输入字节流
		BufferedInputStream bufis = new BufferedInputStream(s.getInputStream());
		//目的File对象
		File file = new File("E:\\浙江.pptx");
		//创建一个文件输出字节流，加上字节流缓冲区
		BufferedOutputStream bufos = new BufferedOutputStream(new FileOutputStream(file));
		//创建缓冲区，用于存储，从Socket字节输入流中读到的数据
		byte [] buf = new byte[1024];
		int len = 0;
		//循环读取
		while((len = bufis.read(buf))!=-1) {
			//将读取到的数据，写入到目的流中
			bufos.write(buf, 0, len);
			//刷新数据
			bufos.flush();
		}
		
		//获取Socket输出流，向客户端返回数据
		BufferedOutputStream rebufos = new BufferedOutputStream(s.getOutputStream());
		String finish = "文件上传完成";
		//String fileName = file.getName();
		//String fileSize = new String(file.length()
		rebufos.write(finish.getBytes());
		rebufos.flush();
		rebufos.close();
		ss.close();
		s.close();
	}

}
