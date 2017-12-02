package day24;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/* 文件切割器
 * */
public class SplitFileDemo {

	//1048576/1024/1024 = 1M
	private static final int SIZE = 1048576;

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\ZOOL\\Downloads\\客户邮件培训.exe");
		/*splitFile(file);*/
		splitFile_2(file);
	}

	public static void splitFile_2(File file) throws IOException {
		
		//文件输入字节流，关联要切割的文件
		FileInputStream fis = new FileInputStream(file);
		
		//记录上次读取的位置
		int len = 0;
		//创建一个缓冲区，每次读取SZIE大小的数据
		byte []buf = new byte[SIZE];
		//创建一个文件输出字节流，稍后初始化，因为现在不知道文件的路径和名称
		FileOutputStream fos = null;
		//用于切割文件的个数
		int count = 1;
		//创建一个File对象，关联切割后的文件存的位置
		File dir = new File("C:\\\\Users\\\\ZOOL\\\\Desktop\\\\files");
		//判断文件是否存在
		if(!dir.exists()) {
			//不存在就创建文件夹
			dir.mkdirs();
		}
		//循环读取，每次读取buf数组大小的数据，返回读取的位置，如果后面没有数据了返回-1
		while((len = fis.read(buf))!=-1) {
			//实例化一个文件文件输出字节流，将目的文件路径和文件名传入进来
			fos = new FileOutputStream(new File(dir, (count++)+".part"));
			//写入数据到输出流，每次写入数组大小的数据
			fos.write(buf, 0, len);
			fos.close();
		}
		fis.close();
		
		//创建一个数组，用于存储切割后的文件信息
		Properties pro = new Properties();
		//创建一个文件输出流，绑定File对象
		
		//FileOutputStream sp_fos = new FileOutputStream(new File(dir,"part.txt"));
		//创建一个文件输出字符流，绑定file对象
		FileWriter fw = new FileWriter(new File(dir,"part.properties"));
		//将文件的切割数量存储到集合中
		pro.setProperty("partCount", Integer.toString(count-1));
		//将文件切割之前的名字存储到结合中
		pro.setProperty("fileName", file.getName());
		//将集合中的数据存储到文件中
		//pro.store(sp_fos, "splitFile");
		//sp_fos.close();
		
		pro.store(fw, "切割后的文件信息，请勿删除，删除后，切割后的文件不能合并了");
		fw.close();
		
	}

	public static void splitFile(File file) throws IOException {
		//获取文件的大小，除以1M得到按1M切割成多少个文件
		System.out.println("如果按照:"+(SIZE/1024/1024)+"M 切的话会切出来："+((file.length()/SIZE)+1)+"个文件");
		
		//用读取流关联文件
		FileInputStream fis = new FileInputStream(file);
		
		//定义一个1M的缓冲区
		byte []buf = new byte[SIZE];
		
		//创建目的，存放切割后的文件
		FileOutputStream fos = null;
		int len = 0;
		//定义一个变量，用于切割的文件名
		int count = 1;
		
		File dir = new File("C:\\Users\\ZOOL\\Desktop\\partFiles");
		//如果目录不存在就创建
		if(!dir.exists()) {
			dir.mkdirs();
		}
		
		//一次读取1M大小的数据
		while((len = fis.read(buf))!=-1) {
			//文件输出字节流，绑定File对象，File对象参数，dir文件路径，参数二：文件名
			fos = new FileOutputStream(new File(dir, (count++)+".part"));
			//写入数据
			fos.write(buf, 0, len);
		}
		fos.close();
		fis.close();
	}
	
}
