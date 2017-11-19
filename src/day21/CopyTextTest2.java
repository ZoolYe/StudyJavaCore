package day21;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyTextTest2 {

	public static void main(String[] args) {
		
		FileReader fr = null;
		FileWriter fw = null;
		
		 try {
			//创建一个字符读取流和文件相关联
			fr = new FileReader("k:\\文档\\富通天下.txt");
			
			//创建一个字符流输出流，设置绝对路径
			fw = new FileWriter("k:\\文档\\我操你妈逼的.txt");
			
			//创建一个临时容器，用于缓存读取到的字符
			char []chr = new char[1024];
			int len = 0;
			while((len = fr.read(chr))!=-1) {
				fw.write(chr,0,len);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		 finally {
			 
			 try {
			//关闭资源，如果不关掉资源，文件是删不掉的
			 if(fr!=null)
				 fr.close();
			 if(fw!=null)
				 fw.close();
			/*while(true) {
				fw.flush();
			}*/
			
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		 }
		 
		 
	}

}
