package day21;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;import javax.swing.text.AbstractDocument.LeafElement;

public class BufferedReaderDemo {

	public static void main(String[] args) throws IOException {
		//demo_1();
		FileReader fr = new FileReader("C:\\Users\\ZOOL\\Desktop\\�ʼ���ַ.txt");
		BufferedReader br = new BufferedReader(fr);
		//��¼��ȡ����ÿһ�е��ַ���
		String line = null;
		//br.readLine()û�оͷ���null
		while((line = br.readLine())!=null) {
			System.out.println(line);
		}
	}

	/**
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public static void demo_1() throws IOException {
		FileReader fr = new FileReader("C:\\Users\\ZOOL\\Desktop\\�ʼ���ַ.txt");
		int ch = 0;
		char []cr = new char[1024];
		while((ch = fr.read(cr))!=-1) {
			System.out.println(cr);
		}
	}

}
