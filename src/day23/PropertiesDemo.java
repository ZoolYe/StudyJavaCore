package day23;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {

	public static void main(String[] args) throws IOException {
		
		/* Map
		 * 	|--Hashtable
		 * 		|--Properties:
		 * Properties集合:
		 * 特点：
		 * 1，该集合中的键和值都是字符串类型
		 * 2，集合中的数据可以保存到流中，或者从流中获取
		 * 通常该集合用于操作以键值对形式存在的配置文件
		 * */
		//propertiesDemo();
		//methodDemo();
		//methodDemo_2();
		//methodDemo_3();
		//myLoad();
		//test();
		test_2();
	}

	public static void test_2() throws IOException {
		//创建一个文件对象
		File file = new File("C:\\Users\\ZOOL\\Desktop\\fttx.txt");
		//创建一个文件字符读取流
		FileReader fr = new FileReader(file);
		//创建一个字符读取流缓冲区
		BufferedReader buff = new BufferedReader(fr);
		//判断文件是否存在
		if(!file.exists()) {
			//如果文件不存在 就创建一个
			file.createNewFile();
		}
		//创建一个Properties集合，用于存储文件中的配置信息,
		Properties pro = new Properties();
		//将文件中的数据加载进集合中
		pro.load(buff);
		pro.list(System.out);
		buff.close();
		//修改集合中key为time的值信息
		pro.setProperty("time", "让时间更有意义");
		//将集合中的信息，保存到文件中
		pro.store(new FileWriter(file), "new file");
		
		//关闭资源
		buff.close();
	}

	/* 对已有的配置文件中的信息进行修改
	 * 读取这个文件，并将这个文件中的键值数据存储到集合中
	 * 再通过集合对数据进行修改
	 * 再通过流将修改后的数据存储到文件中
	 * */
	public static void test() throws IOException {
		//读取这个文件
		File file = new File("C:\\Users\\ZOOL\\Desktop\\fttx.txt");
		//判断文件是否存在，如果不存在就创建一个
		if(!file.exists()) {
			file.createNewFile();
		}
		
		BufferedReader br = new BufferedReader(new FileReader(file));
		
		//创建一个Properties集合，存储信息
		Properties pro = new Properties();
		
		//将流中的信息存储到集合中
		String line = null;
		while((line = br.readLine())!=null) {
			if(!line.startsWith("#")) {
				String []list = line.split("=");
				pro.setProperty(list[0], list[1]);
			}
		}
		pro.list(System.out);
		pro.setProperty("time", "Make more time");
		
		BufferedWriter bw = new BufferedWriter(new FileWriter(file));
		pro.store(bw, "new file");
		pro.list(System.out);
	}
	
	//模拟load方法
	public static void myLoad() throws IOException {
		Properties pro = new Properties();
		//String []str = new String[1024];
		//创建一个文件字符读取流，加入缓存
		BufferedReader buff = new BufferedReader(new FileReader("C:\\Users\\ZOOL\\Desktop\\fttx.txt"));
		String line = null;
		//通过缓冲区的方法，每次读取一行
		while((line = buff.readLine())!=null) {
			//判断字符串是否以#开头
			if(!line.startsWith("#")) {
				//如果不是，就将这个字符串用=进行切割，切割完，返回的是一个字符串数组
				String []arr = line.split("=");
				//System.out.println(arr[0]+" : "+arr[1]);
				pro.setProperty(arr[0], arr[1]);
			}
		}
		buff.close();
		pro.list(System.out);
	}
	
	public static void methodDemo_3() throws IOException {
		
		Properties pro = new Properties();
		//集合中的数据来自于一个文件
		//注意：必须要保证该文件中的数据是键值对
		//需要使用到读取流
		FileInputStream fis = new FileInputStream("C:\\Users\\ZOOL\\Desktop\\fttx.txt");//字节文件输入流
		//将文件中的数据加载到集合中
		pro.load(fis);
		pro.list(System.out);
	}

	public static void methodDemo_2() throws IOException {
		Properties pro = new Properties();
		pro.setProperty("csidbo", "zll19991219");
		pro.setProperty("sa", "Sa123456");
		pro.setProperty("fttx1", "8001");
		pro.setProperty("fttx2", "8020");
		pro.setProperty("fttx3", "19001");
		
		//想要将这些集合中的字符串键值信息持久化存储到文件中
		//需要关联输出流
		FileOutputStream fos = new FileOutputStream("C:\\Users\\ZOOL\\Desktop\\fttx.txt");//字节文件输出流
		
		//将集合中的数据存储到文件中，使用store方法
		pro.store(fos, new String("key+value"));
		fos.close();
	}

	public static void methodDemo() {
		Properties pro = new Properties();
		pro.setProperty("csidbo", "zll19991219");
		pro.setProperty("sa", "Sa123456");
		pro.setProperty("fttx1", "8001");
		pro.setProperty("fttx2", "8020");
		pro.setProperty("fttx3", "19001");
		
		//将属性列表输出到指定的输出流，此方法对调试很有用
		pro.list(System.out);
	}
	
	/* Properties集合的存和取
	 * */
	public static void propertiesDemo() {
		
		//创建一个Properties 的Map集合
		Properties pro = new Properties();
		//存储元素
		pro.setProperty("csidbo", "zll19991219");
		pro.setProperty("sa", "Sa123456");
		pro.setProperty("fttx1", "8001");
		pro.setProperty("fttx2", "8020");
		pro.setProperty("fttx3", "19001");
		
		//修改元素，键相同，值覆盖
		pro.setProperty("sa", "sa");
		
		//通过key获取值
		//String paws = pro.getProperty("csidbo");
		//System.out.println(paws);
		
		//将该集合中所有元素映射到Set集合中
		Set<String> keys = pro.stringPropertyNames();
		for(String key : keys) {
			String value = pro.getProperty(key);
			System.out.println(value);
		}
	}
}
