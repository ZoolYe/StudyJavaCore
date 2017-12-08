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

		ServerSocket ss = new ServerSocket(6248);
	
		Socket s = ss.accept();
		
		InetAddress ip = s.getInetAddress();
		String ip_add = ip.getHostAddress();
		int port = s.getPort();
		
		BufferedInputStream bufis = new BufferedInputStream(s.getInputStream());
		File file = new File("E:\\浙江.pptx");
		BufferedOutputStream bufos = new BufferedOutputStream(new FileOutputStream(file));
		byte [] buf = new byte[1024];
		int len = 0;
		while((len = bufis.read(buf))!=-1) {
			bufos.write(buf, 0, len);
			System.out.println(len);
			bufos.flush();
			byte []ref = new byte[1024];
			if()
				break;
		}
		
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
