package day24;

import java.io.UnsupportedEncodingException;

public class EncodeDemo {

	public static void main(String[] args) throws UnsupportedEncodingException {
		/* 字符串-->字节数组：编码
		 * 字节数组-->字符串：解码
		 * 你好：GBK -60 -29 -70 -61
		 * 你好：UTF-8 -28 -67 -96 -27 -91 -67
		 * 如果编码编错了，就解不出来
		 * 如果编码编对了，解错了，有可能还能解
		 * */
		//demo();
		demo_2();
	}

	public static void demo_2() throws UnsupportedEncodingException {
		
		String str = "你好";
		//编码
		byte []buf = str.getBytes("GBK");
		
		//解码
		String str2 = new String(buf,"ISO8859-1");
		System.out.println(str2);
		
		byte []buf2 = str2.getBytes("ISO8859-1");
		for(byte buf3 : buf2) {
			System.out.println(buf3);
		}
		
		String str3 = new String(buf2);
		System.out.println(str3);
	}

	public static void demo() throws UnsupportedEncodingException {
		String str = "你好";
		//编码
		byte []buf = str.getBytes("UTF-8");
		for(byte bit : buf) {
			System.out.println(bit);
		}
		
		//解码
		String lin = new String(buf,"UTF-8");
		System.out.println(lin);
	}
	
}
