package day20;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
		
		/* ����һ���������ļ���д���ַ����ݵ��ַ��������
		 * ��Ȼ����һ���ļ���д���������ݣ���ô�ڴ�������ʱ���ͱ�����ȷ���ļ�(���ڴ洢���ݵ�Ŀ�ĵ�)
		 * ����ļ������ڣ�����Զ�����������ļ����ڣ���Ḳ��
		 * ������캯���м���true������ʵ�ֶ��ļ�������д
		 * */
		FileWriter fw = new FileWriter("demo.txt",true);
		
		/* ����Writer�����е�writer(string)�ŷ���д������
		 * ��ʵ����д�뵽����ʱ�洢��������
		 * */
		fw.write("zool"+System.getProperty("line.separator")+"cm");
		
		/* ����ˢ�£�������ֱ��д�뵽Ŀ�ĵ���
		 * */
		//fw.flush();
		
		//�ر������ر���Դ���ڹر�ǰ�����flushˢ�»������ݵ�Ŀ�ĵ�
		fw.close();
	}

}
