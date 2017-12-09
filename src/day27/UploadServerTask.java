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

			// 3����ȡ�ͻ��˷���������
			BufferedInputStream bufisC = new BufferedInputStream(s.getInputStream());

			// 4������ȡ�������ݣ��洢��һ���ļ���
			File file = new File("E:\\��ֽ.jpg");
			
			//����ļ����ڣ��ͼӼ�һ���ٴ洢
			while(file.exists()) {
				++count;
				file = new File("E:\\��ֽ"+"("+count+")"+".jpg");
				
			}
			
			FileOutputStream fileOut = new FileOutputStream(file);

			byte[] buf = new byte[1024];
			int len = 0;
			while ((len = bufisC.read(buf)) != -1) {
				fileOut.write(buf, 0, len);
				fileOut.flush();
			}

			// ���ͻ��˷������ݣ��ļ��ϴ����
			OutputStream outC = s.getOutputStream();
			outC.write('0');
			outC.flush();
			
			// �ر���Դ
			s.close();
			bufisC.close();
			fileOut.close();
			outC.close();
			
		} catch (IOException io) {

		} 
		
	}

}
