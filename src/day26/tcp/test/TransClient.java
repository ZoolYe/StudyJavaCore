package day26.tcp.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
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
		Socket s = new Socket("192.168.0.102",6248);
		//2����ȡ����¼��
		BufferedReader key = new BufferedReader(new InputStreamReader(System.in));
		//3��Socket����ֽ���
		PrintWriter out = new PrintWriter(s.getOutputStream(),true);
		
		//4��Socket����������ȡ����˷��صĴ�д����
		InputStream is = s.getInputStream();
		//���ֽ���ת���ַ���
		InputStreamReader isr = new InputStreamReader(is);
		//�ַ���ȡ��������
		BufferedReader bufferReader = new BufferedReader(isr);
		
		//��ȡ��¼�������
		String line = null;
		while((line = key.readLine())!=null) {
			if(line.equals("over")) {
				break;
			}
			out.println(line);
			
			//��ȡ����˷��صĴ�д����
			String upperLine = bufferReader.readLine();
			System.out.println(upperLine);
		}
		//�ر���Դ
		s.close();
	}

}
