package day26.udp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Send implements Runnable {

	//����һ��socket�������ڷ�������
	private DatagramSocket ds;
	
	//����һ��Socket����
	public Send(DatagramSocket ds) {
		this.ds = ds;
	}
	
	@Override
	public void run() {
		System.out.println("���Ͷ������ˣ�new");
		//����һ���ֽڶ�ȡ������������ȡ����¼��
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//�洢��ȡ������
		String line = null;
		
		try {
			//ÿ�ζ�ȡһ��
			while((line = br.readLine())!=null) {
				//�������over���˳�
				if(line.equals("over")) {
					br.close();//�ر�����Դ
					ds.close();//�ر�socket��Դ
					return;
				}
				//���Ӽ��̶�ȡ�������ݣ�ת���ֽ�����
				byte []buf = line.getBytes();
				//����һ�����ݰ�����Ҫ���͵����ݷ�װ�����ݰ��У�����1�����ݣ�����2��Ҫ���͵ĳ��ȣ�����3��IP���󣬲���4���˿ں�
				DatagramPacket dp = new DatagramPacket(buf, buf.length,InetAddress.getByName("192.168.0.255"),6248);
				//�����ݰ����ͳ�ȥ
				ds.send(dp);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
