package day26.udp;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPDemo {

	public static void main(String[] args) throws UnknownHostException {

		//��ȡ��������ip��ַ����
		InetAddress ip = InetAddress.getLocalHost();
		
		//��ȡ����������IP��ַ����
		ip = InetAddress.getByName("x.acme.com");
		
		//��ȡ������ַ
		System.out.println(ip.getHostAddress());
		//��ȡ��������
		System.out.println(ip.getHostName());
	}

}
