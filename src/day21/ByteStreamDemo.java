package day21;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo {

	public static void main(String[] args) throws IOException {
		//demo_write();
		demo_reader();
	}

	public static void demo_reader() throws IOException {
		//1������һ���ֽڶ�ȡ������ָ�����ļ����й���
		FileInputStream fis = new FileInputStream("C:\\Users\\ZOOL\\Desktop\\zool.txt");
		//һ�ζ�ȡһ���ֽ�
		//int ch = fis.read();
		
		/*int ch = 0; 
		while((ch = fis.read())!=-1) {
			System.out.println((char)ch);
		}*/
		
		//available���ص�ʵ�ʿɶ��ֽ�����Ҳ�����ܴ�С
		//System.out.println(fis.available());
		
		byte[] bit = new byte[fis.available()];
		fis.read(bit);
		System.out.println(new String(bit));
		
		/*byte[] bit = new byte[1024];
		int len = 0;
		while((len = fis.read(bit))!=-1) {
			System.out.println(new String(bit,0,len));
		}*/
		
	}

	public static void demo_write() throws IOException {
		//1������һ���ֽ�����������ڲ����ļ�
		FileOutputStream fos = new FileOutputStream("C:\\Users\\ZOOL\\Desktop\\zool.txt");
		//2��д���ݣ�ֱ��д�뵽��Ŀ�ĵ���
		fos.write("abc".getBytes());
		fos.close();
	}

}
