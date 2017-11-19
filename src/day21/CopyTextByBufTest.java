package day21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyTextByBufTest {

	public static void main(String[] args) throws IOException {
		//创建一个字符读取流，关联要读取的文件
		FileReader fr = new FileReader("C:\\Users\\ZOOL\\Desktop\\邮件地址.txt");
		//创建一个字符缓冲区读取流，将字符读取流相关联
		BufferedReader br = new BufferedReader(fr);
		
		FileWriter fw = new FileWriter("C:\\Users\\ZOOL\\Desktop\\客户培训演示地址.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		String line = null;
		while((line = br.readLine())!=null) {
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		
		br.close();
		bw.close();
		
		
	}

}
