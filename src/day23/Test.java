package day23;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* 获取指定目录下，指定扩展名的文件(包含子目录中的这些文件的绝对路径写入到一个文本文件中)
 * 简单说就是建立一个指定扩展名的文件列表
 * 思路：
 * 1，必须进行深度遍历
 * 2，要在遍历的过程中进行过滤，要将符合条件的内容都存储到容器中
 * 3，对容器中的内容进行遍历，并将绝对路径写入到文件中
 * */
public class Test {

	public static void main(String[] args) throws IOException {
		//创建一个文件对象，关联要操作的文件信息
		File file = new File("D:\\ZOOL\\Java\\StudyJavaCore");
		//创建一个List集合用于存储File对象
		List<File> listFile = new ArrayList<File>();
		//创建一个文件过滤器
		FilenameFilter filter = new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				//文件末尾是.java为结尾的文件
				return name.endsWith(".java");
			}
		};
		
		getFiles(file,filter,listFile);
		//创建一个字符输出流缓冲区，传入要写出的文件对象
		BufferedWriter bw = new BufferedWriter(new FileWriter(new File("C:\\Users\\ZOOL\\Desktop\\listjava.txt")));
		write2File(bw,listFile);
	}

	/** 
	 * 对指定目录中的内容进行深度遍历，并按照指定过滤器，进行过滤，将过滤后的内容存储到指定的容器List中
	 * @param dir
	 * @param nameFilter
	 * @param listFile
	 * */
	public static void getFiles(File dir,FilenameFilter nameFilter,List<File> listFile) {
		//获取此目录下的所有对象，存储到files数组中
		File []files = dir.listFiles();
		//遍历文件对象
		for(File file : files) {
			//如果file对象是文件夹
			if(file.isDirectory()) {
				//递归，继续调用此方法，将此文件对象和文件过滤器以及数组传给方法
				getFiles(file, nameFilter, listFile);
			}else {
				//调用文件过滤器的过滤方法，判断文件是否满足条件
				if(nameFilter.accept(dir, file.getName())){
					//将文件对象添加到list集合中
					listFile.add(file);
				}
			}
		}
	}

	public static void write2File(BufferedWriter bw,List<File> list) throws IOException {
		//遍历集合中的文件对象
		for(File file : list) {
			//将文件的绝对路径写入到指定文件中
			bw.write(file.getAbsolutePath());
			//向文件中添加一行换行
			bw.newLine();
		}
		//关闭资源，并刷新
		bw.close();
	}
	
}
