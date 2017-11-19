package day21;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;import javax.swing.text.AbstractDocument.LeafElement;

public class BufferedReaderDemo {

	public static void main(String[] args) throws IOException {
		//demo_1();
		FileReader fr = new FileReader("C:\\Users\\ZOOL\\Desktop\\邮件地址.txt");
		BufferedReader br = new BufferedReader(fr);
		//记录读取到的每一行的字符串
		String line = null;
		//br.readLine()没有就返回null
		while((line = br.readLine())!=null) {
			System.out.println(line);
		}
	}

	/**
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public static void demo_1() throws IOException {
		FileReader fr = new FileReader("C:\\Users\\ZOOL\\Desktop\\邮件地址.txt");
		int ch = 0;
		char []cr = new char[1024];
		while((ch = fr.read(cr))!=-1) {
			System.out.println(cr);
		}
	}

}
