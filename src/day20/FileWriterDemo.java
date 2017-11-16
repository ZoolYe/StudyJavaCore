package day20;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
		
		/* 创建一个可以往文件中写入字符数据的字符输出对象
		 * 既然是往一个文件中写入文字数据，那么在创建对象时，就必须明确该文件(用于存储数据的目的地)
		 * 如果文件不存在，则会自动创建，如果文件存在，则会覆盖
		 * 如果构造函数中加入true，可以实现对文件进行续写
		 * */
		FileWriter fw = new FileWriter("demo.txt",true);
		
		/* 调用Writer对象中的writer(string)放法，写入数据
		 * 其实数据写入到了临时存储缓冲区中
		 * */
		fw.write("zool"+System.getProperty("line.separator")+"cm");
		
		/* 进行刷新，将数据直接写入到目的地中
		 * */
		//fw.flush();
		
		//关闭流，关闭资源，在关闭前会调用flush刷新缓冲数据到目的地
		fw.close();
	}

}
