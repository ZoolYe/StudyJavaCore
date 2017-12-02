package day24;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Properties;

public class MergeFile {

	public static void main(String[] args) throws IOException {
		File dir = new File("C:\\Users\\ZOOL\\Desktop\\files");
		//mergeFile(dir);
		mergeFile_2(dir);
	}

	public static void mergeFile_2(File dir) throws IOException {
		//����ļ�·��������
		if(!dir.exists())
			return;
		
		//ͨ������������ȡ�ļ�
		File []files = dir.listFiles(new SuffixFilter(".properties"));
		//��ȡ��һ��File����
		File proFile = files[0];
		
		//����һ���ļ������ֽ�����File����
		//FileInputStream fis = new FileInputStream(new File(dir,"part.txt"));
		//����һ���ļ���ȡ�ַ�������File����
		FileReader fr = new FileReader(new File(dir,proFile.getName()));
		//����һ�����ϣ����ڴ洢�����ļ��е���Ϣ
		Properties pro = new Properties();
		//���ļ��е���Ϣ���ؽ�������
		//pro.load(fis);
		//���ļ��е���Ϣ���ؽ�������
		pro.load(fr);
		//ͨ������ȡֵ
		String partCount = pro.getProperty("partCount");
		String fileName = pro.getProperty("fileName");
		System.out.println(fileName);
		//����һ���ļ������ֽ������ϣ����ڴ洢������
		ArrayList<FileInputStream> al = new ArrayList<>();
		//ѭ����������Ӷ���ѭ���Ĵ����ǣ����������ļ��л�ȡ����ֵ
		for(int i=1; i<=Integer.parseInt(partCount);i++) {
			//����������������File����File����dir��Ŀ���ļ���·����.part���ļ�������
			al.add(new FileInputStream(new File(dir,i+".part")));
		}
		//����һ���ļ������ֽ���ö�٣�ͨ��Collections���Ϲ�����ķ�������al����ת��ö��
		Enumeration<FileInputStream> en = Collections.enumeration(al);
		//����һ������������ö����ӽ���
		SequenceInputStream sis = new SequenceInputStream(en);
		//����һ���ļ�����ֽ�������File����File�������dir��Ŀ���ļ�·����fileName���ļ�����
		FileOutputStream fos = new FileOutputStream(new File(dir,fileName));
		//��¼ÿ�ζ�ȡ��λ��
		int len = 0;
		//����һ���ֽڻ����������ڴ洢ÿ�ζ�ȡ��������
		byte []buf = new byte[1024];
		//ѭ����ȡ��ÿ�ζ�ȡ��������С�����ݣ���ȡ��󷵻�-1
		while((len = sis.read(buf))!=-1) {
			//������д������
			fos.write(buf, 0, len);
		}
		fos.close();
		sis.close();
	}

	/**
	 * �ļ��ϲ���
	 * @param dir ������Ƭ���ļ���·��
	 * */
	public static void mergeFile(File dir) throws IOException {

		//����һ�����ϣ����ڴ洢�ļ�����������
		ArrayList<FileInputStream> al = new ArrayList<>();
		
		for(int i=1;i<=63; i++) {
			//������������ļ��������ӵ�������
			al.add(new FileInputStream(new File(dir,i+".part")));
		}
		
		//����һ��ö�ٶ��󣬽�����al����ת��ö��
		Enumeration<FileInputStream> en = Collections.enumeration(al);
		//����һ��������������ö�ٶ���
		SequenceInputStream sis = new SequenceInputStream(en);
		//����һ���ļ�����ֽ���������Ŀ���ļ�·��
		FileOutputStream fos = new FileOutputStream("C:\\Users\\ZOOL\\Desktop\\�ͻ��ʼ���ѵ.exe");
		//����һ�������������ڴ洢ÿ�ζ�ȡ������
		byte []buf = new byte[1024];
		//��¼�ϴζ�ȡ��λ��
		int len = 0;
		//ѭ����ȡ���ݣ�ÿ�ζ�ȡ�����С�����ݣ����ض�ȡ��λ�ã����λ��Ϊ-1�ͽ�����ȡ
		while((len = sis.read(buf))!=-1) {
			//����ȡ��������д�뵽�������ÿ��д�������С������
			fos.write(buf, 0, len);
		}
		sis.close();
		fos.close();
	}
	
}
