package day26.uploadtext;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class UploadClient {

	public static void main(String[] args) throws UnknownHostException, IOException {
		
		//1�������ͻ���Socket�˵�
		Socket s = new Socket("192.168.0.102", 6248);
		
		//2����������Դ
		BufferedInputStream bufis = new BufferedInputStream(new FileInputStream("C:\\Users\\ZOOL\\Desktop\\�㽭.pptx"));
		
		BufferedOutputStream bufos = new BufferedOutputStream(s.getOutputStream());
		
		byte []buf = new byte[1024];
		int len = 0;
		while((len = bufis.read(buf))!=-1) {
			bufos.write(buf, 0, len);
			bufos.flush();
			System.out.println(len);
		}
		System.out.println("ִ�е�����");
		bufos.write("over".getBytes());
		bufos.flush();
		System.out.println("��Ҳִ�д���");
		
		BufferedInputStream refis = new BufferedInputStream(s.getInputStream());
		byte []rebuf = new byte[1024];
		//int len =
		int relen = refis.read(rebuf);
		String str = new String(rebuf,0,relen);
		System.out.println(str);
		refis.close();
		s.close();
	}

}
