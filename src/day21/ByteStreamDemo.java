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
		//1，创建一个字节读取流，和指定的文件进行关联
		FileInputStream fis = new FileInputStream("C:\\Users\\ZOOL\\Desktop\\zool.txt");
		//一次读取一个字节
		//int ch = fis.read();
		
		/*int ch = 0; 
		while((ch = fis.read())!=-1) {
			System.out.println((char)ch);
		}*/
		
		//available返回的实际可读字节数，也就是总大小
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
		//1，创建一个字节输出流，用于操作文件
		FileOutputStream fos = new FileOutputStream("C:\\Users\\ZOOL\\Desktop\\zool.txt");
		//2，写数据，直接写入到了目的地中
		fos.write("abc".getBytes());
		fos.close();
	}

}
