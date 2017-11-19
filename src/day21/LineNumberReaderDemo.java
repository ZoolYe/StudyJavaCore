package day21;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class LineNumberReaderDemo {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("D:\\ZOOL\\Java\\StudyJavaCore\\src\\day21\\LineNumberReaderDemo.java");
		LineNumberReader lr = new LineNumberReader(fr);
		String line = null;
		//设置行号，从指定数字里开始
		lr.setLineNumber(0);
		while((line = lr.readLine())!=null) {
			//getLineNumber获取行号
			System.out.println(lr.getLineNumber()+" : "+line);
		}
	}

}
