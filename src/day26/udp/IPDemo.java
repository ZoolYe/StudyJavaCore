package day26.udp;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPDemo {

	public static void main(String[] args) throws UnknownHostException {

		//获取本地主机ip地址对象
		InetAddress ip = InetAddress.getLocalHost();
		
		//获取其他主机的IP地址对象
		ip = InetAddress.getByName("x.acme.com");
		
		//获取主机地址
		System.out.println(ip.getHostAddress());
		//获取主机名称
		System.out.println(ip.getHostName());
	}

}
