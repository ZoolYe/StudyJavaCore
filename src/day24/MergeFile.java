package day24;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Properties;

public class MergeFile {

	public static void main(String[] args) throws IOException {
		File dir = new File("C:\\Users\\ZOOL\\Desktop\\files");
		//mergeFile(dir);
		mergeFile_2(dir);
	}

	public static void mergeFile_2(File dir) throws IOException {
		//如果文件路劲不存在
		if(!dir.exists())
			return;
		
		//通过过滤器，获取文件
		File []files = dir.listFiles(new SuffixFilter(".properties"));
		//获取第一个File对象
		File proFile = files[0];
		
		//创建一个文件输入字节流绑定File对象
		//FileInputStream fis = new FileInputStream(new File(dir,"part.txt"));
		//创建一个文件读取字符流，绑定File对象
		FileReader fr = new FileReader(new File(dir,proFile.getName()));
		//创建一个集合，用于存储配置文件中的信息
		Properties pro = new Properties();
		//将文件中的信息加载进集合中
		//pro.load(fis);
		//将文件中的信息加载进集合中
		pro.load(fr);
		//通过键获取值
		String partCount = pro.getProperty("partCount");
		String fileName = pro.getProperty("fileName");
		System.out.println(fileName);
		//创建一个文件输入字节流集合，用于存储流对象
		ArrayList<FileInputStream> al = new ArrayList<>();
		//循环向流中添加对象，循环的次数是，从配置问文件中获取到的值
		for(int i=1; i<=Integer.parseInt(partCount);i++) {
			//添加流对象，流对象绑定File对象，File对象，dir是目标文件的路径，.part是文件的名称
			al.add(new FileInputStream(new File(dir,i+".part")));
		}
		//创建一个文件输入字节流枚举，通过Collections集合工具类的方法，将al集合转成枚举
		Enumeration<FileInputStream> en = Collections.enumeration(al);
		//创建一个序列流，将枚举添加进来
		SequenceInputStream sis = new SequenceInputStream(en);
		//创建一个文件输出字节流，绑定File对象，File对象参数dir是目标文件路径，fileName是文件名称
		FileOutputStream fos = new FileOutputStream(new File(dir,fileName));
		//记录每次读取的位置
		int len = 0;
		//创建一个字节缓冲区，用于存储每次读取到的数据
		byte []buf = new byte[1024];
		//循环读取，每次读取缓冲区大小的数据，读取完后返回-1
		while((len = sis.read(buf))!=-1) {
			//向流中写入数据
			fos.write(buf, 0, len);
		}
		fos.close();
		sis.close();
	}

	/**
	 * 文件合并器
	 * @param dir 传入碎片的文件夹路径
	 * */
	public static void mergeFile(File dir) throws IOException {

		//创建一个集合，用于存储文件输入流对象
		ArrayList<FileInputStream> al = new ArrayList<>();
		
		for(int i=1;i<=63; i++) {
			//将流对象关联文件对象后，添加到集合中
			al.add(new FileInputStream(new File(dir,i+".part")));
		}
		
		//创建一个枚举对象，将集合al对象转成枚举
		Enumeration<FileInputStream> en = Collections.enumeration(al);
		//创建一个序列流，关联枚举对象
		SequenceInputStream sis = new SequenceInputStream(en);
		//创建一个文件输出字节流，关联目的文件路径
		FileOutputStream fos = new FileOutputStream("C:\\Users\\ZOOL\\Desktop\\客户邮件培训.exe");
		//创建一个缓冲区，用于存储每次读取的数据
		byte []buf = new byte[1024];
		//记录上次读取的位置
		int len = 0;
		//循环读取数据，每次读取数组大小的数据，返回读取的位置，如果位置为-1就结束读取
		while((len = sis.read(buf))!=-1) {
			//将读取到的数据写入到输出流，每次写入数组大小的数据
			fos.write(buf, 0, len);
		}
		sis.close();
		fos.close();
	}
	
}
