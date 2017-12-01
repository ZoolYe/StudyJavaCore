package day23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class PrintWriterDemo {

	public static void main(String[] args) throws IOException {
		/* PrintWriter:字符打印流
		 * 构造函数参数：
		 * 1，字符串路径
		 * 2，File对象
		 * 3，字节输出流
		 * 4，字符输出流
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
