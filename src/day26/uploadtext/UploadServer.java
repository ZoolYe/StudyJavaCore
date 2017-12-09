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

		//���������Socket�������ö˿�
		ServerSocket ss = new ServerSocket(6248);
		//��ȡSocket�˵�
		Socket s = ss.accept();
		//��ȡIP����
		InetAddress ip = s.getInetAddress();
		//��ȡip��ַ
		String ip_add = ip.getHostAddress();
		//��ȡ�˿�
		int port = s.getPort();
		
		//��ȡSocket�˵�������ֽ���
		BufferedInputStream bufis = new BufferedInputStream(s.getInputStream());
		//Ŀ��File����
		File file = new File("E:\\�㽭.pptx");
		//����һ���ļ�����ֽ����������ֽ���������
		BufferedOutputStream bufos = new BufferedOutputStream(new FileOutputStream(file));
		//���������������ڴ洢����Socket�ֽ��������ж���������
		byte [] buf = new byte[1024];
		int len = 0;
		//ѭ����ȡ
		while((len = bufis.read(buf))!=-1) {
			//����ȡ�������ݣ�д�뵽Ŀ������
			bufos.write(buf, 0, len);
			//ˢ������
			bufos.flush();
		}
		
		//��ȡSocket���������ͻ��˷�������
		BufferedOutputStream rebufos = new BufferedOutputStream(s.getOutputStream());
		String finish = "�ļ��ϴ����";
		//String fileName = file.getName();
		//String fileSize = new String(file.length()
		rebufos.write(finish.getBytes());
		rebufos.flush();
		rebufos.close();
		ss.close();
		s.close();
	}

}
