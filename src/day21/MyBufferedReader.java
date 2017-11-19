package day21;
/**
 * 自定义的读取缓冲区，其实就是模拟一个BufferedReader
 * 分析：
 * 缓冲区中无非就是封装了一个数组，并对外提供了更多的方法对数组进行访问
 * 其实这些方法最终操作的都是数组的角标
 * 缓冲区原理：
 * 其实就是从源中获取一批数据装进缓冲区中
 * 再从缓冲区中不断的一个一个的数据取出
 * 在此次取完后，在从源中继续取一批数据到缓冲区中，当源中的数据取完时，用-1做一个标记
 * @version 0.1
 * @author ZOOL
 * */

import java.io.FileReader;

public class MyBufferedReader {
	
	private FileReader fr = null;
	public MyBufferedReader(FileReader fr) {
		this.fr = fr;
	}
	
	public int myReader() {
		return 0;
	}
	
	public String myReaderLine() {
		return null;
	}
	
}
