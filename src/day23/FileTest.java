package day23;

import java.io.File;

/* 需求：对指定的目录进行所有内容的列出，包含子目录中的内容
 * 也可以理解为深度遍历
 * */
public class FileTest {

	public static void main(String[] args) {
		File dir = new File("D:\\ZOOL\\Java\\Flivver");
		listAll(dir);
	}

	public static void listAll(File dir) {
		//获取指定目录下当前的所有文件夹或者文件对象
		File []files = dir.listFiles();
		
		for(int i=0; i<files.length; i++) {
			//判断File对象是否是一个文件夹
			if(files[i].isDirectory()) {
				//System.out.println("dir: "+files[i]);
				//如果是文件夹，再次调用此方法，将此File对象再传入给方法
				listAll(files[i]);
			}
			else
				System.out.println("file: "+files[i]);
		}
		/*for(File file : files) {
			System.out.println(file.getAbsolutePath());
		}*/
	}

}
