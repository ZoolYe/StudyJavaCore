package day22;

import java.io.File;

public class FileDemo {

	public static void main(String[] args) {
		constructorDemo();
	}

	public static void constructorDemo() {
		//���Խ�һ���Ѵ��ڵģ����߲����ڵ��ļ�����Ŀ¼��װ��File����
		File file = new File("C:\\Users\\ZOOL\\Desktop\\a.txt");
		File file2 = new File("C:\\Users\\ZOOL\\Desktop","b.txt");
		
		File file3 = new File("C:\\Users\\ZOOL\\Desktop");
		File file4 = new File(file3,"c.txt");
		
		//File.separator���Ʒָ���/
		File file5 = new File("C:"+File.separator+"Users"+File.separator+"ZOOL"+File.separator+"Desktop");
		
		System.out.println(file5);
	}

}
