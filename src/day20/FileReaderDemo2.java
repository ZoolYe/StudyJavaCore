package day20;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo2 {

	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("demo.txt");
		/* ʹ��reader(char[])��ȡ�ı��ļ�����
		 * ����һ������
		 * */
		//����һ�����飬���ڴ洢��ȡ�����ַ�
		char[] chr = new char[10000];
		
		//���ڼ�¼��ȡ�ַ���λ��
		int len = 0;
		//����������һλ�ͼ�����ȡ
		while((len = fr.read(chr))!=-1) {
			System.out.println(new String(chr));
		}
		
		/*//����ȡ�����ַ��洢��������
		int in = fr.read(chr);*/
		
		fr.close();
	}

}
