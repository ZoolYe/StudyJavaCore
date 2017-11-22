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
	 * 将硬盘上的文本文件输出在控制台上
	 * */
	public static void demo_3() throws IOException {
		//获取硬盘上的文件
		FileReader fr = new FileReader("C:\\Users\\ZOOL\\Desktop\\cmd.txt");
		//获取一个字符输入流缓冲区
		BufferedReader br = new BufferedReader(fr);
		String line = null;
		while((line = br.readLine())!=null) {
			System.out.println(line);
		}
	}

	public static void demo_2() throws IOException {
		// 字节流
		/*InputStream in = System.in;

		//一个中文字符，使用字节流需要读取两次
		int ch = in.read();
		System.out.println(ch);
		int ch2 = in.read();
		System.out.println(ch2);
		
		// 将字节转换成字符流的桥梁，转换流
		InputStreamReader isr = new InputStreamReader(in);
		
		// 字符流,缓冲区
		BufferedReader br = new BufferedReader(isr);*/
		
		//获取键盘录入，将键盘录入的字节流转换成字符流
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//获取一个文件字符输出流，并指定路径
		FileWriter fw = new FileWriter("C:\\Users\\ZOOL\\Desktop\\cmd.txt",true);
		//获取字符输出流缓冲区
		BufferedWriter bw = new BufferedWriter(fw);
		// 记录读取一行的字符串
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
		// 字节流
		InputStream in = System.in;

		// 将字节转换成字符流的桥梁，转换流
		InputStreamReader isr = new InputStreamReader(in);

		// 字符流,缓冲区
		BufferedReader br = new BufferedReader(isr);
		// 记录读取一行的字符串
		String line = null;
		while ((line = br.readLine()) != null) {
			if (line.equals("over"))
				break;
			System.out.println(line.toUpperCase());
		}
	}

}
