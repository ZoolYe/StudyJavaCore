package day23;

import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamDemo {

	public static void main(String[] args) throws IOException {
		/* PrintStream��
		 * 1���ṩ�˴�ӡ�������ԶԶ�����������ֵ���д�ӡ�����������ݵı�ʾ��ʽ
		 * 2��������IO�쳣
		 * ���캯���������������͵�ֵ��
		 * 1���ַ���·��
		 * 2��File����
		 * 3���ֽ������
		 * */
		
		PrintStream out = new PrintStream("C:\\Users\\ZOOL\\Desktop\\print.txt");
		
		out.write(97);//ֻд���8λ
		
		//��97�ȱ���ַ���������ԭ�������ݴ�ӡ��Ŀ�ĵ�
		out.print(97);
		out.close();
	}

}
