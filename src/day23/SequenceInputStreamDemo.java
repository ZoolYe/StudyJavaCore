package day23;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class SequenceInputStreamDemo {

	public static void main(String[] args) throws IOException {

		/* 需求：将3三个文件中的数据合并到一个文件中
		 * */
		
		//Vector已经过时，不推荐使用
		/*Vector<FileInputStream> v = new Vector<>();
		v.add(new FileInputStream("C:\\Users\\ZOOL\\Desktop\\1.txt"));
		v.add(new FileInputStream("C:\\Users\\ZOOL\\Desktop\\2.txt"));
		v.add(new FileInputStream("C:\\Users\\ZOOL\\Desktop\\3.txt"));
		Enumeration<FileInputStream> e = al.elements();*/
		
		ArrayList<FileInputStream> al = new ArrayList<FileInputStream>();
		al.add(new FileInputStream("C:\\Users\\ZOOL\\Desktop\\1.txt"));
		al.add(new FileInputStream("C:\\Users\\ZOOL\\Desktop\\2.txt"));
		al.add(new FileInputStream("C:\\Users\\ZOOL\\Desktop\\3.txt"));
		
		//Collections工具类中可以将Collection接口的转成枚举类型
		//其实这个方法的实现原理，用的就是下面的代码
		Enumeration<FileInputStream> en = Collections.enumeration(al);
		
		/*Iterator<FileInputStream> it = al.iterator();
		Enumeration<FileInputStream> en = new Enumeration<FileInputStream>() {

			@Override
			public boolean hasMoreElements() {
				return it.hasNext();
			}

			@Override
			public FileInputStream nextElement() {
				return it.next();
			}
		};*/
		
		//序列流
		SequenceInputStream sis = new SequenceInputStream(en);
		//创建一个文件输出字节流，关联文件对象
		FileOutputStream fos = new FileOutputStream("C:\\Users\\ZOOL\\Desktop\\4.txt");
		
		//定义一个byte数组，用于缓冲数据
		byte []b = new byte[1024];
		//记录上次读取的位置
		int len = 0;
		//每次读取数组长度的字节数据，存入到数组
		while((len = sis.read(b))!=-1) {
			//将数组中的数据写入输出流，从0角标开始，上次读取的位置结束
			fos.write(b,0,len);
			System.out.println(len);
		}
		fos.close();
		sis.close();
	}

}
