package day24;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

public class ByteArrayStreamDemo {

	public static void main(String[] args) {
		ByteArrayInputStream bais = new ByteArrayInputStream("abcdefg".getBytes());
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		
		int ch = 0;
		while((ch = bais.read())!=-1) {
			baos.write(ch);
		}
		
		System.out.println(baos.toString());
	}

}
