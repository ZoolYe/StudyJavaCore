package day22;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
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
		 * 
		 * 3���ж�
		 * 	
		 * 4��������	
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
		//SuffxFilter,�Զ��������
		File []files = dir.listFiles(new SuffixFilter(".png"));
		for(File file : files) {
			System.out.println(file);
		}
	}

	public static void listDemo_2() {
		File dir = new File("C:\\");
		//��ȡ��ǰĿ¼�µ�����File����,FileFilter�ļ�������
		File []files = dir.listFiles(new FileFilter() {
			
			@Override
			public boolean accept(File pathname) {
				//isHidden�ļ��Ƿ��������ļ�
				return !pathname.isHidden();
			}
		});
		
		for(File file : files) {
			System.out.println(file);
		}
	}

	public static void listDemo() {
		File file = new File("D:\\ZOOL\\Java");
		
		//FilenameFilter�ļ�������
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
		
		//�����ִ�Сд
		File file = new File("D:\\ZOOL\\java");
		/*System.out.println("getFreeSpace"+file.getFreeSpace());
		System.out.println("getTotalSpace"+file.getTotalSpace());
		System.out.println("getUsableSpace"+file.getUsableSpace());*/
		
		//��ȡ��ǰĿ¼�µ��ļ��Լ��ļ��е����ƣ����������ļ������ô˷���file�����װ�ı�����Ŀ¼������ᷢ����ָ���쳣
		//���Ŀ¼���ڵ���û�����ݣ��᷵��һ�����飬���ǳ���Ϊ0
		String []names = file.list();
		for(String name : names) {
			System.out.println(name);
		}
		
		//��ȡ��ǰϵͳȫ���̷�
		/*File []files = File.listRoots();
		for(File file : files) {
			System.out.println(file);
		}*/
	}
	
	public static void renameToDemo() {
		File file = new File("C:\\\\Users\\\\ZOOL\\\\Desktop\\\\LenovoHdReport.dir");
		File file2 = new File("D:\\lenovo.dir");
		//���������ƶ��ļ�
		boolean b = file.renameTo(file2);
		System.out.println(b);
	}
	
	public static void isDemo() {
		//File file = new File("C:\\Users\\ZOOL\\Desktop\\LenovoHdReport.xt");
		File file = new File("C:\\Users\\ZOOL\\Desktop\\LenovoHdReport.txt");
		file.mkdirs();
		//�ж��ļ��Ƿ���ڣ�������ж��Ƿ����
		boolean b = file.exists();
		boolean b2 = file.isFile();//�Ƿ����ļ�
		boolean b3 = file.isDirectory();//�Ƿ���Ŀ¼
		System.out.println(b);
		System.out.println(b2);
		System.out.println(b3);
	}
	
	public static void createAndDeleteDemo() throws IOException {
		
		
		File dir = new File("C:\\Users\\ZOOL\\Desktop\\zool\\a\\b\\c\\d\\e\\f\\g\\h\\i\\j\\k\\l");
		//boolean b = dir.mkdir();//����һ������Ŀ¼
		boolean b = dir.mkdirs();//�����༶Ŀ¼
		File file = new File("C:\\\\Users\\\\ZOOL\\\\Desktop\\\\zool\\1.txt");
		file.createNewFile();
		//boolean b1 = dir.delete();//
		//file.delete();
		//System.out.println(b+" : "+b1);
		
		/*File file = new File("C:\\Users\\ZOOL\\Desktop\\abc.exe");
		 ����һ���µ��ļ�
		 * ���������һ������������ļ������ھʹ���һ�����ļ����ھ͸���
		 * createNewFile�ļ������ھʹ���һ�����ļ����ھͲ�����
		 * 
		boolean b = file.createNewFile();
		System.out.println(b);
		
		boolean b1 = file.delete();
		System.out.println(b1);*/
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
