package day26.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo2 {

	public static void main(String[] args) throws IOException {
		//����˽��տͻ��˷��͹���������
		/* ����TCP����˵�˼·:
		 * 1����������˵�socket����ͨ��ServerSocket����
		 * 2������˱���Ҫ�����ṩһ���˿ڣ�����ͻ����޷�����
		 * 3����ȡ���ӹ����Ŀͻ��˶���
		 * 4��ͨ���ͻ��˶��󣬻�ȡSocket������ȡ�ͻ��˷���������
		 * 5���ر���Դ���ؿͻ��ˣ��ط����
		 * */
		//1����������˶���ָ���˿�
		ServerSocket ss = new ServerSocket(10002);
		
		//2����ȡ���ӹ����Ŀͻ��˶���
		Socket s = ss.accept();
		
		//3��ͨ��Socket�����ȡ��������Ҫ��ȡ�ͻ��˷���������
		InputStream is = s.getInputStream();
		
		byte []buf = new byte[1024];
		int len = is.read(buf);
		String data = new String(buf,0,len);
		System.out.println("server: "+data);
		
		//��ȡ�ͻ��˵�Socket�����IP����
		InetAddress ip = s.getInetAddress();
		//��ȡ�ͻ��˵�ip��ַ
		String ip_add = ip.getHostAddress();
		//��ȡ�ͻ��˵Ķ˿ں�
		int port = s.getPort();
		System.out.println("IP: "+ip_add+"  �˿ڣ�"+port);
		
		//ʹ�ÿͻ���socket�������������ͻ��˷�������
		OutputStream out = s.getOutputStream();
		out.write("�յ���".getBytes());
		
		s.close();
	}

}
