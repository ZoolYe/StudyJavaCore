package day26.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class UDPSendDemo {

	public static void main(String[] args) throws IOException {
		System.out.println("���Ͷ�����");
		/* ����UDP����ķ��Ͷ�
		 * ˼·��
		 * 1������UDP��soket����
		 * 2����Ҫ���͵����ݷ�װ�����ݰ���
		 * 3��ͨ��UDP��soket�������ݰ����ͳ�ȥ
		 * 4���ر�soket����
		 * */
		
		//1������UDP��soket����ʹ��DatagramSoket����
		DatagramSocket ds = new DatagramSocket(8888);
		
		//2����Ҫ���͵����ݷ�װ�����ݰ���,ʹ��DatagramPacket�����ݷ�װ���ð���
		String str = "UPD������ʾ��������";
		//ֻ�ܽ����ֽ����ݣ�������Ҫת��
		byte []buf = str.getBytes();
		//����һ�����ݱ���������1�����ݣ�����2��Ҫ���͵ĳ��ȣ�����3��IP���󣬲���4���˿ں�
		DatagramPacket dp = new DatagramPacket(buf, buf.length, InetAddress.getByName("127.0.0.1"), 10000);
		
		//3��ͨ��UDP��soket�������ݰ����ͳ�ȥ,send����
		ds.send(dp);
		//�ر���Դ
		ds.close();
	}

}
