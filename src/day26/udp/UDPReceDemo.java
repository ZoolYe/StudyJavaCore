package day26.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPReceDemo {

	public static void main(String[] args) throws IOException {
		System.out.println("接收端启动");
		/* 建立UDP接收端的思路
		 * 1，建立UDPsocket服务端，因为是要接收数据，必须要明确端口号
		 * 2，创建数据包，用于存储接收到的数据，方便用数据包对象方法，解析数据
		 * 3，使用socket服务的receive方法将接收的数据存储到数据包中
		 * 4，通过数据包的方法，解析数据包中的数据
		 * 5，关闭资源
		 * */
		
		//1，建立UDPsocket服务端，并绑定端口
		DatagramSocket ds = new DatagramSocket(10000);
		
		//2，创建数据包，用于存储接收到的数据，方便用数据包对象方法，解析数据
		byte [] buf = new byte[1024];//创建一个字节数组用于存储数据
		DatagramPacket dp = new DatagramPacket(buf, buf.length);
		
		//3，使用接收方法将数据存储到数据包中
		ds.receive(dp);//阻塞式
		
		//4，通过数据包对象的方法，解析数据，比如，地址，端口，数据内容
		InetAddress ip = dp.getAddress();//获取IP地址对象
		String ip_add = ip.getHostAddress();//获取ip地址
		int pos = dp.getPort();//获取端口
		//将字节数组封装成字符串
		String data = new String(dp.getData(),0,dp.getLength());
		System.out.println("IP："+ip_add+" 端口："+pos);
		System.out.println("数据："+data);
		//关闭资源
		ds.close();
	}

}
