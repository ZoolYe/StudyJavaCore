package day26.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Rece implements Runnable {

	//创建一个socket服务，用于接收数据
	private DatagramSocket ds;
	
	public Rece(DatagramSocket ds) {
		this.ds = ds;
	}
	
	@Override
	public void run() {
		System.out.println("接收端启动了，new");
		//循环接收
		while(true) {
			//创建一个字节数组，用于存储数据
			byte []buf = new byte[1024];
			//创建一个数据包，用于存储接收到的数据，参数字节容器，长度
			DatagramPacket dp = new DatagramPacket(buf, buf.length);
			try {
				//通过socket的方法将数据接收到数据包中
				ds.receive(dp);
				//获取IP对象
				InetAddress ip = dp.getAddress();
				//通过IP对象获取ip地址，字符串的表现形式
				String ip_add = ip.getHostAddress();
				//获取端口号
				int port = dp.getPort();
				//获取数据，将数据转换成字符串，因为获取到的数据是字节数组，所以要从0角标开始，数据长度结束
				String data = new String(dp.getData(),0,dp.getLength());
				System.out.println("IP:"+ip_add+"端口:"+port);
				System.out.println("数据:"+data);
				
				if(data.equals("over")) {
					ds.close();
					return;
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
