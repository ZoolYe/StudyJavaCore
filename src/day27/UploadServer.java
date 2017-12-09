package day27;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class UploadServer {

	public static void main(String[] args) throws IOException {

		// 1����������˵�Socket�˵�
		ServerSocket ss = new ServerSocket(6248);
		
		while(true) {
			UploadServerTask ust = new UploadServerTask(ss.accept());
			Thread t = new Thread(ust);
			t.start();
		}
		
	}

	public static void runServer() throws IOException {
		// 1����������˵�Socket�˵�
		ServerSocket ss = new ServerSocket(6248);

		// 2����ȡ�ͻ���
		Socket s = ss.accept();

		// 3����ȡ�ͻ��˷���������
		BufferedInputStream bufisC = new BufferedInputStream(s.getInputStream());

		// 4������ȡ�������ݣ��洢��һ���ļ���
		FileOutputStream fileOut = new FileOutputStream("E:\\��ֽ.jpg");

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
		ss.close();
		s.close();
		bufisC.close();
		fileOut.close();
		outC.close();
	}

}
