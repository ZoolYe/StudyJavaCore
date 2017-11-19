package day21;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class LineNumberReaderDemo {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("D:\\ZOOL\\Java\\StudyJavaCore\\src\\day21\\LineNumberReaderDemo.java");
		LineNumberReader lr = new LineNumberReader(fr);
		String line = null;
		//�����кţ���ָ�������￪ʼ
		lr.setLineNumber(0);
		while((line = lr.readLine())!=null) {
			//getLineNumber��ȡ�к�
			System.out.println(lr.getLineNumber()+" : "+line);
		}
	}

}
