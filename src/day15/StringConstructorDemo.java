package day15;

public class StringConstructorDemo {

	public static void main(String[] args) {
		
		stringConstructorDemo();
		stringConstructorDemo2();
	}

	public static void stringConstructorDemo2() {
		char []ch = {'w','a','p','q','r'};
		//从1角标开始，取三个变成字符串
		String s = new String(ch,1,3);
		System.out.println(s);
	}

	private static void stringConstructorDemo() {
		
		//等效于String s = ""; 但是不等效String s = null;
		String s = new String();
		
		byte [] arr = {65,66,67,68};
		String s1 = new String(arr);
		System.out.println(s1);
		
		
	}
	
}
