package day27;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class UploadServer {

	public static void main(String[] args) throws IOException {

		// 1，创建服务端的Socket端点
		ServerSocket ss = new ServerSocket(6248);
		
		while(true) {
			UploadServerTask ust = new UploadServerTask(ss.accept());
			Thread t = new Thread(ust);
			t.start();
		}
		
	}

	public static void runServer() throws IOException {
		// 1，创建服务端的Socket端点
		ServerSocket ss = new ServerSocket(6248);

		// 2，获取客户端
		Socket s = ss.accept();

		// 3，读取客户端发来的数据
		BufferedInputStream bufisC = new BufferedInputStream(s.getInputStream());

		// 4，将读取到的数据，存储到一个文件中
		FileOutputStream fileOut = new FileOutputStream("E:\\壁纸.jpg");

		byte[] buf = new byte[1024];
		int len = 0;
		while ((len = bufisC.read(buf)) != -1) {
			fileOut.write(buf, 0, len);
			fileOut.flush();
		}

		// 给客户端返回数据，文件上传完成
		OutputStream outC = s.getOutputStream();
		outC.write('0');
		outC.flush();

		// 关闭资源
		ss.close();
		s.close();
		bufisC.close();
		fileOut.close();
		outC.close();
	}

}
