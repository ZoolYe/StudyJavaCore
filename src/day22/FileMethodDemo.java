package day22;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;

public class FileMethodDemo {

	public static void main(String[] args) throws IOException {
		/* File对象的常见方法
		 * 1，获取
		 * 	1.1获取文件名称
		 * 	1.2获取文件路径
		 * 	1.3获取文件大小
		 * 	1.4获取文件的修改时间
		 * 
		 * 2，创建与删除
		 * 	boolean
		 * */
		//getDemo();
		createAndDeleteDemo();
	}

	public static void createAndDeleteDemo() throws IOException {
		File file = new File("C:\\Users\\ZOOL\\Desktop\\abc.exe");
		/* 创建一个新的文件
		 * 和输出流不一样，输出流，文件不存在就创建一个，文件存在就覆盖
		 * createNewFile文件不存在就创建一个，文件存在就不创建
		 * */
		boolean b = file.createNewFile();
		System.out.println(b);
		
		boolean b1 = file.delete();
		System.out.println(b1);
	}

	public static void getDemo() {
		File file = new File("D:\\ZOOL\\Java\\StudyJavaCore\\src\\day20\\IO流.txt");
		String fileName = file.getName();
		System.out.println(fileName);
		
		//获取当前文件的相对路径
		String filePath = file.getPath();
		System.out.println(filePath);
		
		//获取当前文件的绝对路径
		String fileAbsPath = file.getAbsolutePath();
		System.out.println(fileAbsPath);
		
		//获取该文件的大小
		long fileSize = file.length();
		System.out.println((double)(fileSize/1024));
		
		//获取当前磁盘的剩余空间
		long len = file.getFreeSpace();
		System.out.println(len/1024/1024/1024);
		
		//获取当前文件的最后一次修改时间
		long time = file.lastModified();
		Date data = new Date(time);
		//获取时间格式化工厂，设置时间显示格式
		DateFormat df = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG);
		String newTime = df.format(data);
		System.out.println(newTime);
		
		String fud = file.getParent();
		System.out.println(fud);
	}
	
}
