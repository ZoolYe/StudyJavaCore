package day24;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/* �ļ��и���
 * */
public class SplitFileDemo {

	//1048576/1024/1024 = 1M
	private static final int SIZE = 1048576;

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\ZOOL\\Downloads\\�ͻ��ʼ���ѵ.exe");
		/*splitFile(file);*/
		splitFile_2(file);
	}

	public static void splitFile_2(File file) throws IOException {
		
		//�ļ������ֽ���������Ҫ�и���ļ�
		FileInputStream fis = new FileInputStream(file);
		
		//��¼�ϴζ�ȡ��λ��
		int len = 0;
		//����һ����������ÿ�ζ�ȡSZIE��С������
		byte []buf = new byte[SIZE];
		//����һ���ļ�����ֽ������Ժ��ʼ������Ϊ���ڲ�֪���ļ���·��������
		FileOutputStream fos = null;
		//�����и��ļ��ĸ���
		int count = 1;
		//����һ��File���󣬹����и����ļ����λ��
		File dir = new File("C:\\\\Users\\\\ZOOL\\\\Desktop\\\\files");
		//�ж��ļ��Ƿ����
		if(!dir.exists()) {
			//�����ھʹ����ļ���
			dir.mkdirs();
		}
		//ѭ����ȡ��ÿ�ζ�ȡbuf�����С�����ݣ����ض�ȡ��λ�ã��������û�������˷���-1
		while((len = fis.read(buf))!=-1) {
			//ʵ����һ���ļ��ļ�����ֽ�������Ŀ���ļ�·�����ļ����������
			fos = new FileOutputStream(new File(dir, (count++)+".part"));
			//д�����ݵ��������ÿ��д�������С������
			fos.write(buf, 0, len);
			fos.close();
		}
		fis.close();
		
		//����һ�����飬���ڴ洢�и����ļ���Ϣ
		Properties pro = new Properties();
		//����һ���ļ����������File����
		
		//FileOutputStream sp_fos = new FileOutputStream(new File(dir,"part.txt"));
		//����һ���ļ�����ַ�������file����
		FileWriter fw = new FileWriter(new File(dir,"part.properties"));
		//���ļ����и������洢��������
		pro.setProperty("partCount", Integer.toString(count-1));
		//���ļ��и�֮ǰ�����ִ洢�������
		pro.setProperty("fileName", file.getName());
		//�������е����ݴ洢���ļ���
		//pro.store(sp_fos, "splitFile");
		//sp_fos.close();
		
		pro.store(fw, "�и����ļ���Ϣ������ɾ����ɾ�����и����ļ����ܺϲ���");
		fw.close();
		
	}

	public static void splitFile(File file) throws IOException {
		//��ȡ�ļ��Ĵ�С������1M�õ���1M�и�ɶ��ٸ��ļ�
		System.out.println("�������:"+(SIZE/1024/1024)+"M �еĻ����г�����"+((file.length()/SIZE)+1)+"���ļ�");
		
		//�ö�ȡ�������ļ�
		FileInputStream fis = new FileInputStream(file);
		
		//����һ��1M�Ļ�����
		byte []buf = new byte[SIZE];
		
		//����Ŀ�ģ�����и����ļ�
		FileOutputStream fos = null;
		int len = 0;
		//����һ�������������и���ļ���
		int count = 1;
		
		File dir = new File("C:\\Users\\ZOOL\\Desktop\\partFiles");
		//���Ŀ¼�����ھʹ���
		if(!dir.exists()) {
			dir.mkdirs();
		}
		
		//һ�ζ�ȡ1M��С������
		while((len = fis.read(buf))!=-1) {
			//�ļ�����ֽ�������File����File���������dir�ļ�·�������������ļ���
			fos = new FileOutputStream(new File(dir, (count++)+".part"));
			//д������
			fos.write(buf, 0, len);
		}
		fos.close();
		fis.close();
	}
	
}
