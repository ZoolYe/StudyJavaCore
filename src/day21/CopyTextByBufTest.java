package day21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyTextByBufTest {

	public static void main(String[] args) throws IOException {
		//����һ���ַ���ȡ��������Ҫ��ȡ���ļ�
		FileReader fr = new FileReader("C:\\Users\\ZOOL\\Desktop\\�ʼ���ַ.txt");
		//����һ���ַ���������ȡ�������ַ���ȡ�������
		BufferedReader br = new BufferedReader(fr);
		
		FileWriter fw = new FileWriter("C:\\Users\\ZOOL\\Desktop\\�ͻ���ѵ��ʾ��ַ.txt");
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
