package day21;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("C:\\Users\\ZOOL\\Desktop\\�Ұ����װ��Ĺ���.txt",true);
		
		//�����ַ���д�����Ļ�����������ָ����Ҫ������������������
		BufferedWriter bw = new BufferedWriter(fw);
		//ʹ�û�������д�뷽�����Ƚ�����д�뵽��������
		bw.write("Make more time");
		//ʹ�û�������ˢ�·��������������е�����д��Ŀ�ĵ���
		bw.flush();
		//�رջ���������ʵ�رյľ��Ǳ����������������fw�ǲ���Ҫ�رյ�
		bw.close();
	}

}
