package day22;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;

public class FileMethodDemo {

	public static void main(String[] args) throws IOException {
		/* File����ĳ�������
		 * 1����ȡ
		 * 	1.1��ȡ�ļ�����
		 * 	1.2��ȡ�ļ�·��
		 * 	1.3��ȡ�ļ���С
		 * 	1.4��ȡ�ļ����޸�ʱ��
		 * 
		 * 2��������ɾ��
		 * 	boolean
		 * */
		//getDemo();
		createAndDeleteDemo();
	}

	public static void createAndDeleteDemo() throws IOException {
		File file = new File("C:\\Users\\ZOOL\\Desktop\\abc.exe");
		/* ����һ���µ��ļ�
		 * ���������һ������������ļ������ھʹ���һ�����ļ����ھ͸���
		 * createNewFile�ļ������ھʹ���һ�����ļ����ھͲ�����
		 * */
		boolean b = file.createNewFile();
		System.out.println(b);
		
		boolean b1 = file.delete();
		System.out.println(b1);
	}

	public static void getDemo() {
		File file = new File("D:\\ZOOL\\Java\\StudyJavaCore\\src\\day20\\IO��.txt");
		String fileName = file.getName();
		System.out.println(fileName);
		
		//��ȡ��ǰ�ļ������·��
		String filePath = file.getPath();
		System.out.println(filePath);
		
		//��ȡ��ǰ�ļ��ľ���·��
		String fileAbsPath = file.getAbsolutePath();
		System.out.println(fileAbsPath);
		
		//��ȡ���ļ��Ĵ�С
		long fileSize = file.length();
		System.out.println((double)(fileSize/1024));
		
		//��ȡ��ǰ���̵�ʣ��ռ�
		long len = file.getFreeSpace();
		System.out.println(len/1024/1024/1024);
		
		//��ȡ��ǰ�ļ������һ���޸�ʱ��
		long time = file.lastModified();
		Date data = new Date(time);
		//��ȡʱ���ʽ������������ʱ����ʾ��ʽ
		DateFormat df = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG);
		String newTime = df.format(data);
		System.out.println(newTime);
		
		String fud = file.getParent();
		System.out.println(fud);
	}
	
}
