package day22;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
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
		 * 
		 * 3，判断
		 * 	
		 * 4，重命名	
		 * */
		//getDemo();
		//createAndDeleteDemo();
		//isDemo();
		//renameToDemo();
		//listRootsDemo();
		//listDemo();
		//listDemo_2();
		listDemo_3();
	}

	public static void listDemo_3() {
		File dir = new File("D:\\ZOOL\\Java");
		//SuffxFilter,自定义过滤器
		File []files = dir.listFiles(new SuffixFilter(".png"));
		for(File file : files) {
			System.out.println(file);
		}
	}

	public static void listDemo_2() {
		File dir = new File("C:\\");
		//获取当前目录下的所有File对象,FileFilter文件过滤器
		File []files = dir.listFiles(new FileFilter() {
			
			@Override
			public boolean accept(File pathname) {
				//isHidden文件是否是隐藏文件
				return !pathname.isHidden();
			}
		});
		
		for(File file : files) {
			System.out.println(file);
		}
	}

	public static void listDemo() {
		File file = new File("D:\\ZOOL\\Java");
		
		//FilenameFilter文件过滤器
		String []names = file.list(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				return name.endsWith(".java");
			}
		});
		
		for(String name : names) {
			System.out.println(name);
		}
	}

	public static void listRootsDemo() {
		
		//不区分大小写
		File file = new File("D:\\ZOOL\\java");
		/*System.out.println("getFreeSpace"+file.getFreeSpace());
		System.out.println("getTotalSpace"+file.getTotalSpace());
		System.out.println("getUsableSpace"+file.getUsableSpace());*/
		
		//获取当前目录下的文件以及文件夹的名称，包含隐藏文件，调用此方法file对象封装的必须是目录，否则会发生空指针异常
		//如果目录存在但是没有内容，会返回一个数组，但是长度为0
		String []names = file.list();
		for(String name : names) {
			System.out.println(name);
		}
		
		//获取当前系统全部盘符
		/*File []files = File.listRoots();
		for(File file : files) {
			System.out.println(file);
		}*/
	}
	
	public static void renameToDemo() {
		File file = new File("C:\\\\Users\\\\ZOOL\\\\Desktop\\\\LenovoHdReport.dir");
		File file2 = new File("D:\\lenovo.dir");
		//从命名，移动文件
		boolean b = file.renameTo(file2);
		System.out.println(b);
	}
	
	public static void isDemo() {
		//File file = new File("C:\\Users\\ZOOL\\Desktop\\LenovoHdReport.xt");
		File file = new File("C:\\Users\\ZOOL\\Desktop\\LenovoHdReport.txt");
		file.mkdirs();
		//判断文件是否存在，最好先判断是否存在
		boolean b = file.exists();
		boolean b2 = file.isFile();//是否是文件
		boolean b3 = file.isDirectory();//是否是目录
		System.out.println(b);
		System.out.println(b2);
		System.out.println(b3);
	}
	
	public static void createAndDeleteDemo() throws IOException {
		
		
		File dir = new File("C:\\Users\\ZOOL\\Desktop\\zool\\a\\b\\c\\d\\e\\f\\g\\h\\i\\j\\k\\l");
		//boolean b = dir.mkdir();//创建一个单级目录
		boolean b = dir.mkdirs();//创建多级目录
		File file = new File("C:\\\\Users\\\\ZOOL\\\\Desktop\\\\zool\\1.txt");
		file.createNewFile();
		//boolean b1 = dir.delete();//
		//file.delete();
		//System.out.println(b+" : "+b1);
		
		/*File file = new File("C:\\Users\\ZOOL\\Desktop\\abc.exe");
		 创建一个新的文件
		 * 和输出流不一样，输出流，文件不存在就创建一个，文件存在就覆盖
		 * createNewFile文件不存在就创建一个，文件存在就不创建
		 * 
		boolean b = file.createNewFile();
		System.out.println(b);
		
		boolean b1 = file.delete();
		System.out.println(b1);*/
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
