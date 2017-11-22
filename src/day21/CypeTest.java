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
		//创建一个字节输入流缓冲区
		BufferedInputStream bufin = new BufferedInputStream(fis);
		
		FileOutputStream fos = new FileOutputStream("C:\\Users\\ZOOL\\Desktop\\666.mkv");
		//创建一个字节输出流缓冲区
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
		//记录上次读取的位置
		int len = 0;
		//创建一个数组，每次读取数组长度的字节，存入数组
		byte []bit = new byte[1024];
		//将读取到的字节存入数组中，如果读取到了最后一位就返回-1
		while((len = fis.read(bit))!=-1) {
			//将输入中的元素写入到输出流中，从0角标开始，上次读取到的位置结束
			fos.write(bit,0,len);
		}
		fis.close();
		fos.close();
	}

}
