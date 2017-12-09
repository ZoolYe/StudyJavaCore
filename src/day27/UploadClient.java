package day27;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class UploadClient {

	public static void main(String[] args) throws UnknownHostException, IOException {
		
		//1，创建客户端Socket
		Socket s = new Socket("192.168.0.101",6248);
		
		//2，读取客户端要上传的文件
		BufferedInputStream bufInput = new BufferedInputStream(new FileInputStream("c:\\users\\zool\\desktop\\壁纸.jpg"));
		
		//3，将读取到的数据发送给服务端
		BufferedOutputStream bufos = new BufferedOutputStream(s.getOutputStream());
		
		byte []buf = new byte[1024];
		int len = 0;
		while((len = bufInput.read(buf))!=-1) {
			bufos.write(buf, 0, len);
			bufos.flush();
		}
		
		//告诉服务端，文件上传完毕
		s.shutdownOutput();
		
		//获取服务端上传完成返回的数据
		InputStream isServer = s.getInputStream();
		int restCode = isServer.read();
		System.out.println(restCode);
		
		//关闭资源
		s.close();
		bufInput.close();
		bufos.close();
		isServer.close();
	}

}
