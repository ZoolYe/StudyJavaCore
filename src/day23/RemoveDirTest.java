package day23;

import java.io.File;

/* 删除一个带内容的目录
 * 原理：必须从最里面往外删，需要深度遍历
 * */

public class RemoveDirTest {

	public static void main(String[] args) {
		File dir = new File("C:\\Users\\ZOOL\\Desktop\\Flivver");
		removerDir(dir);
	}

	public static void removerDir(File dir) {
		//dir路径下的所有文件及文件夹对象
		File []files = dir.listFiles();
		for(File file : files) {
			//如果file对象是目录，那就继续将目录深度遍历出来
			if(file.isDirectory()) {
				removerDir(file);
			}else {
				//如果不是目录那就直接删除此文件
				file.delete();
			}
		}
		//最后删除文件夹
		dir.delete();
	}
	
}
