package day26.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TCPClienDemo2 {

	public static void main(String[] args) throws IOException {
		
		//�ͻ��˷����ݵ������
		/* TCP���䣬�ͻ��˽����Ĺ���
		 * 1������TCP�ͻ���socket����ʹ�õ���socket����
		 * 		����ö���һ��������ȷ��Ŀ�ĵأ�Ҫ���ӵ�����
		 * 2��������ӽ����ɹ���˵�����ݴ���ͨ���ѽ���
		 * 		��ͨ������socket�����ǵײ㽨���õģ�˵������������룬���������Ҫ���������������󣬿�����socket����ȡ
		 * 		����ͨ��getOutputStream(),getInputStream()����ȡ�����ֽ���
		 * 3��ʹ���������������д��
		 * 
		 * 4���ر���Դ
		 * */
		
		//1������TCP�ͻ���socket����
		Socket socket = new Socket("192.168.0.102",10002);
		
		//��ȡsocket���е������
		OutputStream out = socket.getOutputStream();
		
		//ʹ���������ָ��������д��ȥ
		out.write("��÷����".getBytes());
		
		//��ȡ����˷��ص����ݣ�ʹ��Socket��ȡ��
		InputStream is = socket.getInputStream();
		byte []buf = new byte[1024];
		int len = is.read(buf);
		String str = new String(buf,0,len);
		System.out.println(str);
		
		//�ر���Դ
		socket.close();
	}

}
