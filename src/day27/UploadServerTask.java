package day27;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class UploadServerTask implements Runnable {

	private Socket s;

	private int count = 0;
	
	public UploadServerTask(Socket s) {
		this.s = s;
	}

	@Override
	public void run() {

		try {

			// 3，读取客户端发来的数据
			BufferedInputStream bufisC = new BufferedInputStream(s.getInputStream());

			// 4，将读取到的数据，存储到一个文件中
			File file = new File("E:\\壁纸.jpg");
			
			//如果文件存在，就加加一次再存储
			while(file.exists()) {
				++count;
				file = new File("E:\\壁纸"+"("+count+")"+".jpg");
				
			}
			
			FileOutputStream fileOut = new FileOutputStream(file);

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
			s.close();
			bufisC.close();
			fileOut.close();
			outC.close();
			
		} catch (IOException io) {

		} 
		
	}

}
