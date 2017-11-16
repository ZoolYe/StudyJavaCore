package day20;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo2 {

	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("demo.txt");
		/* 使用reader(char[])读取文本文件数据
		 * 创建一个数组
		 * */
		//定义一个数组，用于存储获取到的字符
		char[] chr = new char[10000];
		
		//用于记录获取字符的位置
		int len = 0;
		//如果不是最后一位就继续读取
		while((len = fr.read(chr))!=-1) {
			System.out.println(new String(chr));
		}
		
		/*//将读取到的字符存储到数组中
		int in = fr.read(chr);*/
		
		fr.close();
	}

}
