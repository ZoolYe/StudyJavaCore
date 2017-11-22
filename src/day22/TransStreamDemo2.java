package day22;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TransStreamDemo2 {

	public static void main(String[] args) throws IOException {
		//demo_1();
		//demo_2();
		demo_3();
	}

	/**
	 * ��Ӳ���ϵ��ı��ļ�����ڿ���̨��
	 * */
	public static void demo_3() throws IOException {
		//��ȡӲ���ϵ��ļ�
		FileReader fr = new FileReader("C:\\Users\\ZOOL\\Desktop\\cmd.txt");
		//��ȡһ���ַ�������������
		BufferedReader br = new BufferedReader(fr);
		String line = null;
		while((line = br.readLine())!=null) {
			System.out.println(line);
		}
	}

	public static void demo_2() throws IOException {
		// �ֽ���
		/*InputStream in = System.in;

		//һ�������ַ���ʹ���ֽ�����Ҫ��ȡ����
		int ch = in.read();
		System.out.println(ch);
		int ch2 = in.read();
		System.out.println(ch2);
		
		// ���ֽ�ת�����ַ�����������ת����
		InputStreamReader isr = new InputStreamReader(in);
		
		// �ַ���,������
		BufferedReader br = new BufferedReader(isr);*/
		
		//��ȡ����¼�룬������¼����ֽ���ת�����ַ���
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//��ȡһ���ļ��ַ����������ָ��·��
		FileWriter fw = new FileWriter("C:\\Users\\ZOOL\\Desktop\\cmd.txt",true);
		//��ȡ�ַ������������
		BufferedWriter bw = new BufferedWriter(fw);
		// ��¼��ȡһ�е��ַ���
		String line = null;
		while ((line = br.readLine()) != null) {
			if (line.equals("over"))
				break;
			line.toUpperCase();
			bw.write(line.toUpperCase());
			bw.newLine();
			bw.flush();
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
