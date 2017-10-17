package day15;

public class StringMethodDemo {

	public static void main(String[] args) {
		
		/* 按照面向对象的思想对字符串进行功能分类
		 * "abc"
		 * 1，获取：
		 * 	1.1获取字符串中的字符个数(长度)
		 * 		int length();
		 * 	1.2根据位置获取字符
		 * 		char charAt(int index);
		 * 	1.3根据字符获取在字符串中的第一次出现的位置
		 * 		int indexOf(int ch);
		 * 		从指定位置进行ch的索引第一次出现的位置
		 * 		int indexOf(int ch,int fromIndex);
		 * 		int indexOf(String str);
		 * 		int indexOf(String str,int fromIndex);
		 * 		根据字符串获取在字符串中的第一次出现的位置
		 * 		int lastIndexOf(int ch);
		 *		int lastIndexOf(int ch,int fromIndex);
		 *		int lastIndexOf(String str);
		 *		int lastIndexOf(String str,int fromIndex);
		 *	1.4获取字符串中的一部分字符串，也称之为子串
		 *		String substring(int beginIndex);
		 *		//包含begin不包含end
		 *		String substring(int beginIndex,int endIndex);
		 *2，转换：
		 *	2.1将字符串变成字符串数组(将字符串进行切割)
		 *		String[] split(String regex);涉及到正则表达式
		 *	2.2将字符串变成字符数组
		 *		char[] toCharArray();
		 *	2.3将字符串变成字节数组
		 *		char[] getBytes;
		 *	2.4将字符串中的字母转成大小写
		 *		String toUpperCase();大写
		 *		String toLowerCse();小写
		 *	2.5将字符串中的制定内容进行替换
		 *		String replace(char oldChar,char newChar);
		 *		String replace(String s1,String s2);
		 *	2.6将字符串两端的空格去除
		 *		String trim();
		 *	2.7将字符串进行连接
		 *		String concat(string);
		 *3，判断：
		 *	3.1两个字符串内容是否相同？
		 *		boolean equals(Object obj);
		 *		//忽略大小写字符串比较内容
		 *		boolean equalsIgnoreCase(String str);
		 *	3.2字符串中是否包含制定字符串
		 *		boolean contains(String str);
		 *	3.3字符串是否以指定字符串开头，是否以指定字符串结尾
		 *		boolean startsWith(string);
		 *		boolean endsWith(string);
		 *4，比较：
		 *	4.1比较两个字符串的字典,比较是基于字符串中的每个字符的Unicode值
		 *		int compareTo(String anotherString);
		 * */
		
		//stringMethodDemo();
		//stringMethodDemo2();
		//stringMethodDemo3();
		stringMethodDemo4();
		
		/*char []ch = {'w','c','a','w','v'};
		String s = new String(ch);
		System.out.println(s.indexOf('w',1));*/
	}	

	public static void stringMethodDemo4() {
		String s = "a";
		System.out.println(s.compareTo("A"));
	}

	private static void stringMethodDemo3() {
		String s = "abc";
		//System.out.println(s.equals("ABC".toLowerCase()));
		//System.out.println(s.equalsIgnoreCase("ABC"));
		String s2 = "ArrayDemo.java";
		System.out.println(s2.startsWith("Arr"));
		System.out.println(s2.endsWith(".java"));
	}

	public static void stringMethodDemo2() {
		String s = "张三.李四.王五";
		String s1 = "张三,李四,王五";
		String s2 = "ab你";
		//需要两个\\反斜线
		String []arr = s.split("\\.");
		for(int i=0; i<arr.length; i++) {
			//System.out.println(arr[i]);
		}
		
		char[] ch = s1.toCharArray();
		for(int i=0; i<ch.length; i++) {
			//System.out.print(ch[i]);
		}
		
		byte[] bit = s2.getBytes();
		for (int i = 0; i < bit.length; i++) {
			//System.out.println(bit[i]);
		}
		//System.out.println(s2.toUpperCase());
		//System.out.println(s2.replace('你', 'a'));
		
		String s3 = "java";
		String s4 = s3.replace('o', 'p');
		System.out.println(s3==s4);//true
		System.out.println("  as  e   d s ".trim());
	}

	private static void stringMethodDemo() {
		
		String s = "abcdbcae";
		System.out.println("length:"+s.length());//8
		System.out.println("char:"+s.charAt(2));//c
		
		//我们可以根据-1来判断该字符或者字符串是否存在
		System.out.println("index:"+s.indexOf('k'));//2
		System.out.println("lastIndex:"+s.lastIndexOf('a'));//6
		
		System.out.println(s.substring(4));
		System.out.println(s.substring(3, 5));
	}

}
