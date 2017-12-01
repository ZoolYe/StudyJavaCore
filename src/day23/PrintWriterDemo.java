package day23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class PrintWriterDemo {

	public static void main(String[] args) throws IOException {
		/* PrintWriter:�ַ���ӡ��
		 * ���캯��������
		 * 1���ַ���·��
		 * 2��File����
		 * 3���ֽ������
		 * 4���ַ������
		 * */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		String line = null;
		while((line = br.readLine())!=null) {
			if(line.equals("over")) {
				break;
			}
			pw.println(line.toUpperCase());
			pw.flush();
		}
		
	}

}
