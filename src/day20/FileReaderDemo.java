package day20;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		
		//���󣺶�ȡһ���ı��ļ�������ȡ�����ַ���ӡ������̨��
		
		/* 1��������ȡ�ַ����ݵ�������
		 * �ڴ�����ȡ������ʱ������Ҫ��ȷ����ȡ���ļ���һ��Ҫȷ�����ļ��Ǵ��ڵ�
		 * ��һ����ȡ������һ���ļ�
		 * */
		FileReader fr = new FileReader("demo.txt");
		
		//��Reader�е�read������ȡ�ַ�
		int ch = 0;
		while((ch=fr.read())!=-1) {
			System.out.println((char)ch);
		}
		/*int ch = fr.read();
		System.out.println(ch);
		int ch1 = fr.read();
		System.out.println(ch1);
		int ch2 = fr.read();
		System.out.println(ch2);*/
	}

}
