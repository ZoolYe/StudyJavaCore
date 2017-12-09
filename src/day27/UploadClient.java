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
		
		//1�������ͻ���Socket
		Socket s = new Socket("192.168.0.101",6248);
		
		//2����ȡ�ͻ���Ҫ�ϴ����ļ�
		BufferedInputStream bufInput = new BufferedInputStream(new FileInputStream("c:\\users\\zool\\desktop\\��ֽ.jpg"));
		
		//3������ȡ�������ݷ��͸������
		BufferedOutputStream bufos = new BufferedOutputStream(s.getOutputStream());
		
		byte []buf = new byte[1024];
		int len = 0;
		while((len = bufInput.read(buf))!=-1) {
			bufos.write(buf, 0, len);
			bufos.flush();
		}
		
		//���߷���ˣ��ļ��ϴ����
		s.shutdownOutput();
		
		//��ȡ������ϴ���ɷ��ص�����
		InputStream isServer = s.getInputStream();
		int restCode = isServer.read();
		System.out.println(restCode);
		
		//�ر���Դ
		s.close();
		bufInput.close();
		bufos.close();
		isServer.close();
	}

}
