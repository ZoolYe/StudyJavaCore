package day28.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo2 {

	public static void main(String[] args) {
		
		/* 正则表达式对字符串的常见操作：
		 * 1，匹配
		 * 		其实用的就是String类中的matches方法
		 * 2，切割
		 * 		其实使用的就是String类中的split方法
		 * 3，替换
		 * 		其实使用的就是String类中的replaceAll方法
		 * 4，获取
		 * */
		//functionDemo_1();
		//functionDemo_2();
		//fuctionDemo_3();
		fuctionDemo_4();
	}

	/* 将正则规则进行对象的封装
	 * Pattern p = Pattern.compile("a*b");
	 * 通过正则对象的matcher方法和字符串关联，获取要对字符串操作的匹配器对象Matcher
	 * Matcher m = p.matcher("aaaaab");
	 * 通过Matcher匹配器对象的方法对字符串进行操作
	 * boolean b = m.matcher();
	 * */
	public static void fuctionDemo_4() {
		String str = "da jia hao,ming tian bu fang jia!";
		String regex = "\\b[a-z]{3}\\b";
		//1，将正则封装成对象
		Pattern p = Pattern.compile(regex);
		//2，通过正则对象获取匹配器对象
		Matcher m = p.matcher(str);
		//3，使用Matcher对象的方法对字符串进行操作
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

	//切割
	public static void functionDemo_2() {
		String str = "zhangsan###xiaoqiang@@@zhaoliu";
		String []name = str.split("(.)\\1+");
		for(String s : name) {
			System.out.println(s);
		}
	}

	//匹配
	public static void functionDemo_1() {
		
		//匹配手机号码是否正确
		String tel = "18605881104";
		String regex = "1[3578]\\d{9}";
		boolean b = tel.matches(regex);
		System.out.println(b);
	}
	
}
