package day22;

import java.io.File;

public class FileDemo {

	public static void main(String[] args) {
		constructorDemo();
	}

	public static void constructorDemo() {
		//可以将一个已存在的，或者不存在的文件或者目录封装成File对象
		File file = new File("C:\\Users\\ZOOL\\Desktop\\a.txt");
		File file2 = new File("C:\\Users\\ZOOL\\Desktop","b.txt");
		
		File file3 = new File("C:\\Users\\ZOOL\\Desktop");
		File file4 = new File(file3,"c.txt");
		
		//File.separator名称分隔符/
		File file5 = new File("C:"+File.separator+"Users"+File.separator+"ZOOL"+File.separator+"Desktop");
		
		System.out.println(file5);
	}

}
