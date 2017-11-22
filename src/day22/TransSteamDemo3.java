package day22;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TransSteamDemo3 {

	public static void main(String[] args) throws IOException {
		//writeText();
		//writeText_2();
		writeText_3();
		//readText_1();
		readText_2();
	}

	public static void readText_2() throws IOException {
		//�ò����ļ����ֽ�����������������ļ�
		FileInputStream fis = new FileInputStream("C:\\Users\\ZOOL\\Desktop\\gbk.txt");
		//���ֽ���ת�����ַ�����ָ�������
		InputStreamReader isr = new InputStreamReader(fis,"UTF-8");
		int len = 0;
		char []ch = new char[1024];
		while((len = isr.read(ch))!=-1) {
			System.out.println(new String(ch,0,len));
		}
		isr.close();
	}

	public static void readText_1() throws IOException {
		FileReader fr = new FileReader("C:\\Users\\ZOOL\\Desktop\\gbk.txt");
		int ch = 0;
		char []chr = new char[1024];
		ch = fr.read(chr);
		String str = new String(chr, 0, ch);
		System.out.println(str);
		fr.close();
	}

	public static void writeText_3() throws IOException {
		
		//��Ϊת����Ҫ������ֽ�������Ϊ�ֽ����������ļ��Ǵ��࣬����Ҫʹ�ô���FileOutputStream
		FileOutputStream fos = new FileOutputStream("C:\\\\Users\\\\\\\\ZOOL\\\\Desktop\\\\gbk.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos, "gbk");
		osw.write("���");
		osw.close();
	}

	public static void writeText_2() throws IOException {
		
		//FileOutputStream���ڽ��ֽ�����д�����ļ����̳���OutputStream��
		FileOutputStream fos = new FileOutputStream("C:\\Users\\\\ZOOL\\Desktop\\gbk.txt");
		//���ֽ���ת��Ϊ�ַ��������ֽ���ͨ���ַ����������������ָ���ַ������룬�ý�����̽�ʹ��ƽ̨Ĭ�ϵ��ַ����룬�磺GBK
		OutputStreamWriter osw = new OutputStreamWriter(fos,"gbk");
		
		/* �������������������ǵ�ͬ��
		 * FileWriter����ʵ����ת����ָ���˱���Ĭ���������֣��������ת������������󣬿��Է�������ı��ļ�
		 * 				��˵�������ļ����ֽ���+����Ĭ�ϱ����
		 * ���ǰ���Ĭ������������ļ��ı����
		 * ��������ı��ļ���Ҫ��ȷ����ı��룬FileWriter�Ͳ����ˣ�������ת����OutputStreamWriter
		 * */
		//FileWriter fw = new FileWriter("C:\\Users\\ZOOL\\Desktop\\gbk.txt");
		
		osw.write("���");
		osw.close();
	}

	public static void writeText() throws IOException {
		FileWriter fw = new FileWriter("C:\\Users\\ZOOL\\Desktop\\gbk.txt");
		fw.write("���");
		fw.close();
	}

}
