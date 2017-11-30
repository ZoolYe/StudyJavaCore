package day23;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* ��ȡָ��Ŀ¼�£�ָ����չ�����ļ�(������Ŀ¼�е���Щ�ļ��ľ���·��д�뵽һ���ı��ļ���)
 * ��˵���ǽ���һ��ָ����չ�����ļ��б�
 * ˼·��
 * 1�����������ȱ���
 * 2��Ҫ�ڱ����Ĺ����н��й��ˣ�Ҫ���������������ݶ��洢��������
 * 3���������е����ݽ��б�������������·��д�뵽�ļ���
 * */
public class Test {

	public static void main(String[] args) throws IOException {
		//����һ���ļ����󣬹���Ҫ�������ļ���Ϣ
		File file = new File("D:\\ZOOL\\Java\\StudyJavaCore");
		//����һ��List�������ڴ洢File����
		List<File> listFile = new ArrayList<File>();
		//����һ���ļ�������
		FilenameFilter filter = new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				//�ļ�ĩβ��.javaΪ��β���ļ�
				return name.endsWith(".java");
			}
		};
		
		getFiles(file,filter,listFile);
		//����һ���ַ������������������Ҫд�����ļ�����
		BufferedWriter bw = new BufferedWriter(new FileWriter(new File("C:\\Users\\ZOOL\\Desktop\\listjava.txt")));
		write2File(bw,listFile);
	}

	/** 
	 * ��ָ��Ŀ¼�е����ݽ�����ȱ�����������ָ�������������й��ˣ������˺�����ݴ洢��ָ��������List��
	 * @param dir
	 * @param nameFilter
	 * @param listFile
	 * */
	public static void getFiles(File dir,FilenameFilter nameFilter,List<File> listFile) {
		//��ȡ��Ŀ¼�µ����ж��󣬴洢��files������
		File []files = dir.listFiles();
		//�����ļ�����
		for(File file : files) {
			//���file�������ļ���
			if(file.isDirectory()) {
				//�ݹ飬�������ô˷����������ļ�������ļ��������Լ����鴫������
				getFiles(file, nameFilter, listFile);
			}else {
				//�����ļ��������Ĺ��˷������ж��ļ��Ƿ���������
				if(nameFilter.accept(dir, file.getName())){
					//���ļ�������ӵ�list������
					listFile.add(file);
				}
			}
		}
	}

	public static void write2File(BufferedWriter bw,List<File> list) throws IOException {
		//���������е��ļ�����
		for(File file : list) {
			//���ļ��ľ���·��д�뵽ָ���ļ���
			bw.write(file.getAbsolutePath());
			//���ļ������һ�л���
			bw.newLine();
		}
		//�ر���Դ����ˢ��
		bw.close();
	}
	
}
