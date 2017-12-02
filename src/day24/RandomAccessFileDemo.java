package day24;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo {

	public static void main(String[] args) throws IOException {
		/* RandomAccessFile:
		 * 不是IO体系中的子类
		 * 特点：
		 * 1，该对象即能读，又能写
		 * 2，该对象内部维护了一个byte数组，并通过指针可以操作数组中的元素
		 * 3，可以通过getFilePointer方法获取指针的位置，和通过seek设置指针的位置
		 * 4，其实该对象就是将字节输入流和字节输出流进行了封装
		 * 5，该对象的源或者目的只能是文件，通过构造函数，就可以看出
		 * */
		//writeFile();
		readFile();
		//randomWrite();
	}
	
	public static void randomWrite() throws IOException {
		RandomAccessFile raf = new RandomAccessFile("C:\\\\Users\\\\ZOOL\\\\Desktop\\\\racc.r", "rw");
		raf.seek(16);
		raf.write("王五".getBytes());
		raf.writeInt(12);
		raf.close();
	}
	
	public static void readFile() throws IOException {
		RandomAccessFile raf = new RandomAccessFile("C:\\\\Users\\\\ZOOL\\\\Desktop\\\\racc.r", "r");
		raf.seek(16);//设置指针的位置就能随机的读取
		byte []buf = new byte[4];
		raf.read(buf);
		int age = raf.readInt();
		String name = new String(buf);
		System.out.println(name);
		System.out.println(age);
		
		//获取指针的位置
		System.out.println(raf.getFilePointer());
	}
	//使用RandomAccessFile对象写入一些人员信息
	public static void writeFile() throws IOException {
		//如果文件不存在，则创建，如果文件存在，不创建, rw 读写
		RandomAccessFile raf = new RandomAccessFile("C:\\Users\\ZOOL\\Desktop\\racc.r", "rw");
		raf.write("张三".getBytes());
		raf.writeInt(97);
		raf.write("李四".getBytes());
		raf.writeInt(99);
		raf.close();
	}
	
}
