package day21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestDemo {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("E:\\UÅÌÎÄ¼þ\\¼òÀú\\±ÚÖ½.jpg");
		BufferedReader br = new BufferedReader(fr);
		FileWriter fw = new FileWriter("C:\\Users\\ZOOL\\Desktop\\haha.png");
		BufferedWriter bw = new BufferedWriter(fw);
		int ch = 0;
		while((ch = br.read())!=-1){
			bw.write(ch);
		}
		bw.flush();
		br.close();
		bw.close();
	}

}
