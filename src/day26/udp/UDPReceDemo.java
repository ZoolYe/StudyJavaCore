package day26.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPReceDemo {

	public static void main(String[] args) throws IOException {
		System.out.println("���ն�����");
		/* ����UDP���ն˵�˼·
		 * 1������UDPsocket����ˣ���Ϊ��Ҫ�������ݣ�����Ҫ��ȷ�˿ں�
		 * 2���������ݰ������ڴ洢���յ������ݣ����������ݰ����󷽷�����������
		 * 3��ʹ��socket�����receive���������յ����ݴ洢�����ݰ���
		 * 4��ͨ�����ݰ��ķ������������ݰ��е�����
		 * 5���ر���Դ
		 * */
		
		//1������UDPsocket����ˣ����󶨶˿�
		DatagramSocket ds = new DatagramSocket(10000);
		
		//2���������ݰ������ڴ洢���յ������ݣ����������ݰ����󷽷�����������
		byte [] buf = new byte[1024];//����һ���ֽ��������ڴ洢����
		DatagramPacket dp = new DatagramPacket(buf, buf.length);
		
		//3��ʹ�ý��շ��������ݴ洢�����ݰ���
		ds.receive(dp);//����ʽ
		
		//4��ͨ�����ݰ�����ķ������������ݣ����磬��ַ���˿ڣ���������
		InetAddress ip = dp.getAddress();//��ȡIP��ַ����
		String ip_add = ip.getHostAddress();//��ȡip��ַ
		int pos = dp.getPort();//��ȡ�˿�
		//���ֽ������װ���ַ���
		String data = new String(dp.getData(),0,dp.getLength());
		System.out.println("IP��"+ip_add+" �˿ڣ�"+pos);
		System.out.println("���ݣ�"+data);
		//�ر���Դ
		ds.close();
	}

}
