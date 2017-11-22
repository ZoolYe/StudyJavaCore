package day22;

import java.io.IOException;
import java.io.InputStream;

public class ReadKey {

	public static void main(String[] args) throws IOException {
		/* 读取一个键盘录入的数据，并打印在控制台上
		 * 键盘本身就是一个标准的输入设备
		 * 对于Java而言，对于这种输入设备都有对应的对象
		 * */
		//readKey();
		readKey2();
	}

	public static void readKey2() throws IOException {
		/* 获取用户键盘录入的数据
		 * 并将数据变成大写显示在控制台上
		 * 如果用户输入的是over，结束键盘录入
		 * */
		//获取键盘读取流
		InputStream in = System.in;
		//创建容器，用于存储用户输入的数据
		StringBuilder sb = new StringBuilder();
		
		int ch = 0;
		while((ch = in.read())!=-1) {
			//如果读取到了\r，就忽略此字符，因为在win下回车是由\r\n组成的
			if(ch=='\r')
				continue;
			//如果读取到了回车，那就要判断回车前的字符是否是条件字符
			if(ch=='\n') {
				//建立一个临时变量记录住读取到的字符
				String temp = sb.toString();
				//判断条件是否成立
				if(temp.equals("over"))
					//如果成立，程序就结束
					break;
				//如果不成立，将读取到的字符转成大写
				System.out.println(temp.toUpperCase());
				//不需要之前读取的字符，所以要清空缓冲区
				sb.delete(0, sb.length());
			}
			//如果没有读到\r\n就将读到的字符存入到缓冲区
			else {
				//将int转成char
				sb.append((char)ch);
			}
		}
			
	}

	public static void readKey() throws IOException {
		InputStream in = System.in;
		int ch = in.read();//阻塞式方式
		System.out.println(ch);
		int ch1 = in.read();
		System.out.println(ch1);
		int ch2 = in.read();
		System.out.println(ch2);
	}

}
