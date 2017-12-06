package day26.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class UDPSendDemo {

	public static void main(String[] args) throws IOException {
		System.out.println("发送端启动");
		/* 创建UDP传输的发送端
		 * 思路：
		 * 1，建立UDP的soket服务
		 * 2，将要发送的数据封装到数据包中
		 * 3，通过UDP的soket服务将数据包发送出去
		 * 4，关闭soket服务
		 * */
		
		//1，建立UDP的soket服务，使用DatagramSoket对象
		DatagramSocket ds = new DatagramSocket(8888);
		
		//2，将要发送的数据封装到数据包中,使用DatagramPacket将数据封装到该包中
		String str = "UPD传输演示，我来了";
		//只能接收字节数据，所以需要转化
		byte []buf = str.getBytes();
		//创建一个数据报包，参数1：数据，参数2：要发送的长度，参数3：IP对象，参数4：端口号
		DatagramPacket dp = new DatagramPacket(buf, buf.length, InetAddress.getByName("127.0.0.1"), 10000);
		
		//3，通过UDP的soket服务将数据包发送出去,send方法
		ds.send(dp);
		//关闭资源
		ds.close();
	}

}
