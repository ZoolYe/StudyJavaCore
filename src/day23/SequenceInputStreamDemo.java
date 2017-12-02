package day23;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class SequenceInputStreamDemo {

	public static void main(String[] args) throws IOException {

		/* ���󣺽�3�����ļ��е����ݺϲ���һ���ļ���
		 * */
		
		//Vector�Ѿ���ʱ�����Ƽ�ʹ��
		/*Vector<FileInputStream> v = new Vector<>();
		v.add(new FileInputStream("C:\\Users\\ZOOL\\Desktop\\1.txt"));
		v.add(new FileInputStream("C:\\Users\\ZOOL\\Desktop\\2.txt"));
		v.add(new FileInputStream("C:\\Users\\ZOOL\\Desktop\\3.txt"));
		Enumeration<FileInputStream> e = al.elements();*/
		
		ArrayList<FileInputStream> al = new ArrayList<FileInputStream>();
		al.add(new FileInputStream("C:\\Users\\ZOOL\\Desktop\\1.txt"));
		al.add(new FileInputStream("C:\\Users\\ZOOL\\Desktop\\2.txt"));
		al.add(new FileInputStream("C:\\Users\\ZOOL\\Desktop\\3.txt"));
		
		//Collections�������п��Խ�Collection�ӿڵ�ת��ö������
		//��ʵ���������ʵ��ԭ���õľ�������Ĵ���
		Enumeration<FileInputStream> en = Collections.enumeration(al);
		
		/*Iterator<FileInputStream> it = al.iterator();
		Enumeration<FileInputStream> en = new Enumeration<FileInputStream>() {

			@Override
			public boolean hasMoreElements() {
				return it.hasNext();
			}

			@Override
			public FileInputStream nextElement() {
				return it.next();
			}
		};*/
		
		//������
		SequenceInputStream sis = new SequenceInputStream(en);
		//����һ���ļ�����ֽ����������ļ�����
		FileOutputStream fos = new FileOutputStream("C:\\Users\\ZOOL\\Desktop\\4.txt");
		
		//����һ��byte���飬���ڻ�������
		byte []b = new byte[1024];
		//��¼�ϴζ�ȡ��λ��
		int len = 0;
		//ÿ�ζ�ȡ���鳤�ȵ��ֽ����ݣ����뵽����
		while((len = sis.read(b))!=-1) {
			//�������е�����д�����������0�Ǳ꿪ʼ���ϴζ�ȡ��λ�ý���
			fos.write(b,0,len);
			System.out.println(len);
		}
		fos.close();
		sis.close();
	}

}
