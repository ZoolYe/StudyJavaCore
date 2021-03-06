package day23;

import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamDemo {

	public static void main(String[] args) throws IOException {
		/* PrintStream：
		 * 1，提供了打印方法可以对多种数据类型值进行打印，并保持数据的表示形式
		 * 2，它不抛IO异常
		 * 构造函数，接收三种类型的值：
		 * 1，字符串路径
		 * 2，File对象
		 * 3，字节输出流
		 * */
		
		PrintStream out = new PrintStream("C:\\Users\\ZOOL\\Desktop\\print.txt");
		
		out.write(97);//只写最低8位
		
		//将97先变成字符串，保持原样将数据打印到目的地
		out.print(97);
		out.close();
	}

}
