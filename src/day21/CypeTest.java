package day21;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CypeTest {

	public static void main(String[] args) throws IOException {
		copy_1();
		//copy_2();
	}

	public static void copy_2() throws IOException {
		FileInputStream fis = new FileInputStream("D:\\TDDOWNLOAD\\666.mkv");
		//����һ���ֽ�������������
		BufferedInputStream bufin = new BufferedInputStream(fis);
		
		FileOutputStream fos = new FileOutputStream("C:\\Users\\ZOOL\\Desktop\\666.mkv");
		//����һ���ֽ������������
		BufferedOutputStream bufou = new BufferedOutputStream(fos);
		
		int ch = 0;
		while((ch = bufin.read())!=-1) {
			bufou.write(ch);
		}
		bufin.close();
		bufou.close();
	}

	public static void copy_1() throws IOException {
		FileInputStream fis = new FileInputStream("D:\\\\TDDOWNLOAD\\\\666.mkv");
		FileOutputStream fos = new FileOutputStream("C:\\\\Users\\\\ZOOL\\\\Desktop\\\\666.mkv");
		//��¼�ϴζ�ȡ��λ��
		int len = 0;
		//����һ�����飬ÿ�ζ�ȡ���鳤�ȵ��ֽڣ���������
		byte []bit = new byte[1024];
		//����ȡ�����ֽڴ��������У������ȡ�������һλ�ͷ���-1
		while((len = fis.read(bit))!=-1) {
			//�������е�Ԫ��д�뵽������У���0�Ǳ꿪ʼ���ϴζ�ȡ����λ�ý���
			fos.write(bit,0,len);
		}
		fis.close();
		fos.close();
	}

}
