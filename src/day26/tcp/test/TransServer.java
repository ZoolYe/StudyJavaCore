package day26.tcp.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class TransServer {

	public static void main(String[] args) throws IOException {

		/* ת������ˡ�
		 * ������
		 * 1��ServerSocket����
		 * 2����ȡSocket����
		 * 3��Դ��Socket����ȡ�ͻ��˷���������Ҫת��������
		 * 4��Ŀ�ģ���ʾ�ڿ���̨��
		 * 5��������ת�ɴ�д�����ͻ���
		 * */
		
		//1�����������Socket�˵�
		ServerSocket ss = new ServerSocket(6248);
		
		//2����ȡSocket����
		Socket s = ss.accept();
		
		//��ȡ�ͻ���������Ϣ
		InetAddress ip = s.getInetAddress();
		String ip_add = ip.getHostAddress();
		int port = s.getPort();
		System.out.println(ip_add+port);
		
		
		//3����ȡSocket��ȡ��
		InputStreamReader isr = new InputStreamReader(s.getInputStream());
		BufferedReader bufReader = new BufferedReader(isr);//�ַ���������
		
		//��ȡSocket�����
		PrintWriter out = new PrintWriter(s.getOutputStream(),true);
		
		String line = null;
		while((line = bufReader.readLine())!=null) {
			//���ַ���ת�ɴ�д
			String upStr = line.toUpperCase();
			out.println(upStr);
		}
		s.close();
		ss.close();
	}

}
