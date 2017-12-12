package day28.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo2 {

	public static void main(String[] args) {
		
		/* ������ʽ���ַ����ĳ���������
		 * 1��ƥ��
		 * 		��ʵ�õľ���String���е�matches����
		 * 2���и�
		 * 		��ʵʹ�õľ���String���е�split����
		 * 3���滻
		 * 		��ʵʹ�õľ���String���е�replaceAll����
		 * 4����ȡ
		 * */
		//functionDemo_1();
		//functionDemo_2();
		//fuctionDemo_3();
		fuctionDemo_4();
	}

	/* �����������ж���ķ�װ
	 * Pattern p = Pattern.compile("a*b");
	 * ͨ����������matcher�������ַ�����������ȡҪ���ַ���������ƥ��������Matcher
	 * Matcher m = p.matcher("aaaaab");
	 * ͨ��Matcherƥ��������ķ������ַ������в���
	 * boolean b = m.matcher();
	 * */
	public static void fuctionDemo_4() {
		String str = "da jia hao,ming tian bu fang jia!";
		String regex = "\\b[a-z]{3}\\b";
		//1���������װ�ɶ���
		Pattern p = Pattern.compile(regex);
		//2��ͨ����������ȡƥ��������
		Matcher m = p.matcher(str);
		//3��ʹ��Matcher����ķ������ַ������в���
		while(m.find()) {
			System.out.println(m.group());
		}
		
	}

	public static void fuctionDemo_3() {
		/*String str = "dashdas,,,arw...eyru;;;dl,";
		str = str.replaceAll("(.)\\1+","@");
		System.out.println(str);*/
		String tel = "17605881104";
		String str = tel.replace("\\d{3}\\d{4}\\d{4}", "$1****$3");
		System.out.println(str);
	}

	//�и�
	public static void functionDemo_2() {
		String str = "zhangsan###xiaoqiang@@@zhaoliu";
		String []name = str.split("(.)\\1+");
		for(String s : name) {
			System.out.println(s);
		}
	}

	//ƥ��
	public static void functionDemo_1() {
		
		//ƥ���ֻ������Ƿ���ȷ
		String tel = "18605881104";
		String regex = "1[3578]\\d{9}";
		boolean b = tel.matches(regex);
		System.out.println(b);
	}
	
}
