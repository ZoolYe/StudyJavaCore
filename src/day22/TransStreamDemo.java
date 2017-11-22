package day22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TransStreamDemo {

	public static void main(String[] args) throws IOException {
		//demo_1();
		demo_2();
	}

	public static void demo_2() throws IOException {
		// 字节流
		InputStream in = System.in;

		//一个中文字符，使用字节流需要读取两次
		/*int ch = in.read();
		System.out.println(ch);
		int ch2 = in.read();
		System.out.println(ch2);*/
		
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
