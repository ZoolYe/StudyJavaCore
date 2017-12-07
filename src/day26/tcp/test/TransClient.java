package day26.tcp.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;


public class TransClient {

	public static void main(String[] args) throws UnknownHostException, IOException {

		/* ˼·��
		 * �ͻ��ˣ�
		 * 1����Ҫ���У�Socket�̵�
		 * 2���ͻ�������Դ������
		 * 3���ͻ��˵�Ŀ�ģ�Socket
		 * 4�����շ���˵����ݣ�Դ��Socket
		 * 5��������ʾ�ڿ���̨��ӡ����:Ŀ�ģ�����̨
		 * 6������Щ���в��������ݣ������ı�����
		 * ת���ͻ��ˣ�
		 * 1������Socket�ͻ��˶̵�
		 * 2����ȡ����¼��
		 * 3����¼�����Ϣ���͸�Socket�����
		 * */
		
		//1������Socket�ͻ��˶���
		Socket s = new Socket("192.168.0.101",6248);
		//2����ȡ����¼��
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//3��Socket����ֽ���
		OutputStream out = s.getOutputStream();
		//���ֽ�����ת�����ַ���
		OutputStreamWriter osw = new OutputStreamWriter(out);
		
		//4��Socket����������ȡ����˷��صĴ�д����
		InputStream is = s.getInputStream();
		//���ֽ���ת���ַ���
		InputStreamReader isr = new InputStreamReader(is);
		//�ַ���ȡ��������
		BufferedReader outbr = new BufferedReader(isr);
		
		//��ȡ��¼�������
		String line = null;
		while((line = br.readLine())!=null) {
			if(line.equals("over")) {
				break;
			}
			osw.write(line);
			osw.flush();
			
			//��ȡ����˷��صĴ�д����
			String upperLine = outbr.readLine();
			System.out.println(upperLine);
		}
		//�ر���Դ
		s.close();
		br.close();
		osw.close();
		outbr.close();
	}

}
