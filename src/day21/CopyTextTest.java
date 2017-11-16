package day21;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyTextTest {

	public static void main(String[] args) throws IOException {
		
		//读取一个已有的文本文件，使用字符流读取流和文件相关联
		FileReader fr = new FileReader("C:\\Users\\ZOOL\\Downloads\\rimet_10002068.apk");
		
		//创建一个绝对路径，用于存储读到的数据
		FileWriter fw = new FileWriter("E:\\文档\\钉钉.apk");
		
		//记录读取到的字符
		int ch = 0;
		//read返回的是字符的int表现形式，如果后面没有字符了 返回-1
		while((ch = fr.read())!=-1) {
			//因为电脑上存储的任何文件都是二进制形式的，之所以能被看到是因为被解析了
			fw.write(ch);
		}
		
		//关闭资源
		fr.close();
		fw.close();
	}

}
