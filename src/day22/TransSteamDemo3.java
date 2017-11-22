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
		//用操作文件的字节输入流，关联相关文件
		FileInputStream fis = new FileInputStream("C:\\Users\\ZOOL\\Desktop\\gbk.txt");
		//将字节流转换成字符流，指定编码表
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
		
		//因为转换流要传入的字节流，因为字节流操作的文件是此类，所以要使用此类FileOutputStream
		FileOutputStream fos = new FileOutputStream("C:\\\\Users\\\\\\\\ZOOL\\\\Desktop\\\\gbk.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos, "gbk");
		osw.write("你好");
		osw.close();
	}

	public static void writeText_2() throws IOException {
		
		//FileOutputStream用于将字节数据写出到文件。继承自OutputStream类
		FileOutputStream fos = new FileOutputStream("C:\\Users\\\\ZOOL\\Desktop\\gbk.txt");
		//将字节流转换为字符流。是字节流通向字符流的桥梁。如果不指定字符集编码，该解码过程将使用平台默认的字符编码，如：GBK
		OutputStreamWriter osw = new OutputStreamWriter(fos,"gbk");
		
		/* 这句代码和上面两句代码是等同的
		 * FileWriter：其实就是转换流指定了本机默认码表的体现，而且这个转换流的子类对象，可以方便操作文本文件
		 * 				简单说：操作文件的字节流+本机默认编码表
		 * 这是按照默认码表来操作文件的便捷类
		 * 如果操作文本文件需要明确具体的编码，FileWriter就不行了，必须用转换流OutputStreamWriter
		 * */
		//FileWriter fw = new FileWriter("C:\\Users\\ZOOL\\Desktop\\gbk.txt");
		
		osw.write("你好");
		osw.close();
	}

	public static void writeText() throws IOException {
		FileWriter fw = new FileWriter("C:\\Users\\ZOOL\\Desktop\\gbk.txt");
		fw.write("你好");
		fw.close();
	}

}
