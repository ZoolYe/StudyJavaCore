package day26.udp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Send implements Runnable {

	//创建一个socket服务，用于发送数据
	private DatagramSocket ds;
	
	//传入一个Socket对象
	public Send(DatagramSocket ds) {
		this.ds = ds;
	}
	
	@Override
	public void run() {
		System.out.println("发送端启动了，new");
		//创建一个字节读取流缓冲区，获取键盘录入
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//存储读取的数据
		String line = null;
		
		try {
			//每次读取一行
			while((line = br.readLine())!=null) {
				//如果输入over就退出
				if(line.equals("over")) {
					br.close();//关闭流资源
					ds.close();//关闭socket资源
					return;
				}
				//将从键盘读取到的数据，转成字节数组
				byte []buf = line.getBytes();
				//创建一个数据包，将要发送的数据封装到数据包中，参数1：数据，参数2：要发送的长度，参数3：IP对象，参数4：端口号
				DatagramPacket dp = new DatagramPacket(buf, buf.length,InetAddress.getByName("192.168.0.255"),6248);
				//将数据包发送出去
				ds.send(dp);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
