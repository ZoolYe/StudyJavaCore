package day21;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyTextTest {

	public static void main(String[] args) throws IOException {
		
		//��ȡһ�����е��ı��ļ���ʹ���ַ�����ȡ�����ļ������
		FileReader fr = new FileReader("C:\\Users\\ZOOL\\Downloads\\rimet_10002068.apk");
		
		//����һ������·�������ڴ洢����������
		FileWriter fw = new FileWriter("E:\\�ĵ�\\����.apk");
		
		//��¼��ȡ�����ַ�
		int ch = 0;
		//read���ص����ַ���int������ʽ���������û���ַ��� ����-1
		while((ch = fr.read())!=-1) {
			//��Ϊ�����ϴ洢���κ��ļ����Ƕ�������ʽ�ģ�֮�����ܱ���������Ϊ��������
			fw.write(ch);
		}
		
		//�ر���Դ
		fr.close();
		fw.close();
	}

}
