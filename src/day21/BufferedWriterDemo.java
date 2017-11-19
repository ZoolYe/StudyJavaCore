package day21;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("C:\\Users\\ZOOL\\Desktop\\我爱你亲爱的姑娘.txt",true);
		
		//创建字符流写入流的缓冲区，并和指定的要被缓冲的流对象相关联
		BufferedWriter bw = new BufferedWriter(fw);
		//使用缓冲区的写入方法，先将数据写入到缓冲区中
		bw.write("Make more time");
		//使用缓冲区的刷新方法，将缓冲区中的数据写入目的地中
		bw.flush();
		//关闭缓冲区，其实关闭的就是被缓冲的流对象，所以fw是不需要关闭的
		bw.close();
	}

}
