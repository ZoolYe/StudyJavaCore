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
		Socket s = new Socket("192.168.0.101", 6248);
		
		//2����������Դ����Ӳ���϶�ȡ�ļ�
		BufferedInputStream bufis = new BufferedInputStream(new FileInputStream("C:\\Users\\ZOOL\\Desktop\\�㽭.pptx"));
		
		//3����ȡSocket����ֽ��������ֽ��������ֽ���������
		BufferedOutputStream bufos = new BufferedOutputStream(s.getOutputStream());
		
		//������������ÿ�ζ�ȡ1024���ֽ�
		byte []buf = new byte[1024];
		//��¼�ϴζ�ȡ��λ��
		int len = 0;
		//ѭ����ȡ�ļ��е�����
		while((len = bufis.read(buf))!=-1) {
			//������д��Socket�������
			bufos.write(buf, 0, len);
			//ˢ������
			bufos.flush();
		}
		//���߷������������������
		s.shutdownOutput();
		
		//��ȡSocket����������ȡ���������ص�����
		BufferedInputStream refis = new BufferedInputStream(s.getInputStream());
		//���������������ڴ洢�����������ص�����
		byte []rebuf = new byte[1024];
		//��ȡ���������ص�����
		int relen = refis.read(rebuf);
		//�����������ص�����ת���ַ���
		String str = new String(rebuf,0,relen);
		System.out.println("�ͻ���"+str);
		//�ر���Դ
		refis.close();
		s.close();
	}

}
