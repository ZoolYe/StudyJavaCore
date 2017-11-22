package day22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TransStreamDemo {

	public static void main(String[] args) throws IOException {
		//demo_1();
		demo_2();
	}

	public static void demo_2() throws IOException {
		// �ֽ���
		InputStream in = System.in;

		//һ�������ַ���ʹ���ֽ�����Ҫ��ȡ����
		/*int ch = in.read();
		System.out.println(ch);
		int ch2 = in.read();
		System.out.println(ch2);*/
		
		// ���ֽ�ת�����ַ�����������ת����
		InputStreamReader isr = new InputStreamReader(in);
		
		// �ַ���,������
		BufferedReader br = new BufferedReader(isr);
		
		
		
		// ��¼��ȡһ�е��ַ���
		String line = null;
		while ((line = br.readLine()) != null) {
			if (line.equals("over"))
				break;
			System.out.println(line.toUpperCase());
		}
	}

	/**
	 * @throws IOException
	 */
	public static void demo_1() throws IOException {
		// �ֽ���
		InputStream in = System.in;

		// ���ֽ�ת�����ַ�����������ת����
		InputStreamReader isr = new InputStreamReader(in);

		// �ַ���,������
		BufferedReader br = new BufferedReader(isr);
		// ��¼��ȡһ�е��ַ���
		String line = null;
		while ((line = br.readLine()) != null) {
			if (line.equals("over"))
				break;
			System.out.println(line.toUpperCase());
		}
	}

}
