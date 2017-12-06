package day26.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Rece implements Runnable {

	//����һ��socket�������ڽ�������
	private DatagramSocket ds;
	
	public Rece(DatagramSocket ds) {
		this.ds = ds;
	}
	
	@Override
	public void run() {
		System.out.println("���ն������ˣ�new");
		//ѭ������
		while(true) {
			//����һ���ֽ����飬���ڴ洢����
			byte []buf = new byte[1024];
			//����һ�����ݰ������ڴ洢���յ������ݣ������ֽ�����������
			DatagramPacket dp = new DatagramPacket(buf, buf.length);
			try {
				//ͨ��socket�ķ��������ݽ��յ����ݰ���
				ds.receive(dp);
				//��ȡIP����
				InetAddress ip = dp.getAddress();
				//ͨ��IP�����ȡip��ַ���ַ����ı�����ʽ
				String ip_add = ip.getHostAddress();
				//��ȡ�˿ں�
				int port = dp.getPort();
				//��ȡ���ݣ�������ת�����ַ�������Ϊ��ȡ�����������ֽ����飬����Ҫ��0�Ǳ꿪ʼ�����ݳ��Ƚ���
				String data = new String(dp.getData(),0,dp.getLength());
				System.out.println("IP:"+ip_add+"�˿�:"+port);
				System.out.println("����:"+data);
				
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
