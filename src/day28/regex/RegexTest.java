package day28.regex;

import java.util.TreeSet;

public class RegexTest {

	public static void main(String[] args) {

		/* 1�����ƿڳԣ���������...����������ҪҪҪ....ҪҪҪҪѧ....ѧѧѧѧѧ....ѧѧ���...����......���...���̳�..�̳̳̳�.�̳�
		 * 2����IP��ַ����
		 * 3�����ʼ���ַУ��
		 * */
		//test_1();
		//test_2();
		test_3();
	}

	public static void test_3() {
		String mail = "www.iphone@foxmail.567";
		String regex = "\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*"; 
		boolean b = mail.matches(regex);
		System.out.println(b);
	}

	/* IP��ַ����
	 * 192.168.34.21 127.0.0.1 3.3.3.3 105.70.11.55
	 * */
	public static void test_2() {
String ip_str = "192.168.10.34  127.0.0.1  3.3.3.3  105.70.11.55";
		
		
		//1,Ϊ����ip���԰����ַ���˳��Ƚϣ�ֻҪ��ip��ÿһ�ε�λ����ͬ��
		//���ԣ����㣬����ÿһλ��������0���в��䡣ÿһ�ζ�������0.
		
		ip_str = ip_str.replaceAll("(\\d+)", "00$1");
		System.out.println(ip_str);
		
		//Ȼ��ÿһ�α�������3λ��
		ip_str = ip_str.replaceAll("0*(\\d{3})", "$1");
		System.out.println(ip_str);
		
		
		//1����ip��ַ�г���
		String[] ips = ip_str.split(" +");
		
		TreeSet<String> ts = new TreeSet<String>();
		
		for(String  ip : ips){
//			System.out.println(ip);
			ts.add(ip);
		}
		
		for(String ip : ts){
			System.out.println(ip.replaceAll("0*(\\d+)", "$1"));
		}
	}

	public static void test_1() {
		String str = "��������...����������ҪҪҪ....ҪҪҪҪѧ....ѧѧѧѧѧ....ѧѧ���...����......���...���̳�..�̳̳̳�.�̳�";
		//1�����ַ����е�.ȥ�������滻
		str = str.replaceAll("\\.", "");
		//2���滻����
		str = str.replaceAll("(.)\\1+", "$1");
		System.out.println(str);
	}
	
}
