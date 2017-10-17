package day15;

public class StringDemo {

	public static void main(String[] args) {
		
		stringDemo2();
	}

	public static void stringDemo2() {
		
		//在字符串常量池中创建了"abc"，并将引用赋值给了s
		String s = "abc";
		
		//在堆内存中创建了一个String对象
		String s1 = new String("abc");
		
		System.out.println("s:"+s);
		System.out.println("s1:"+s1);
		System.out.println(s==s1);
		
		//String类中的equals复写了Object类中的equals，建立了自己的比较方法
		System.out.println(s.equals(s1));
	}

	/**
	 * 演示字符串定义的第一种方式，并明确字符串常量池的特点
	 * 池中没有就创建，池中有就直接使用
	 * String类的特点
	 * 字符串对象一旦被初始化就不会被改变
	 */
	public static void stringDemo1() {
		String s = "abc";//"abc"存储在字符串常量池中，如果常量池中没有就创建，如果有就直接使用
		//s = "ndf";
		String s1 = "abc";
		System.out.println(s==s1);
	}

}
