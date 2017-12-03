package day24;

import java.io.UnsupportedEncodingException;

public class EncodeDemo {

	public static void main(String[] args) throws UnsupportedEncodingException {
		/* �ַ���-->�ֽ����飺����
		 * �ֽ�����-->�ַ���������
		 * ��ã�GBK -60 -29 -70 -61
		 * ��ã�UTF-8 -28 -67 -96 -27 -91 -67
		 * ����������ˣ��ͽⲻ����
		 * ����������ˣ�����ˣ��п��ܻ��ܽ�
		 * */
		//demo();
		demo_2();
	}

	public static void demo_2() throws UnsupportedEncodingException {
		
		String str = "���";
		//����
		byte []buf = str.getBytes("GBK");
		
		//����
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
		String str = "���";
		//����
		byte []buf = str.getBytes("UTF-8");
		for(byte bit : buf) {
			System.out.println(bit);
		}
		
		//����
		String lin = new String(buf,"UTF-8");
		System.out.println(lin);
	}
	
}
