package day16;

public class WrapperDemo {

	public static void main(String[] args) {

		/* 基本数据类型包装类
		 * 为了方便操作基本数据类型，将其封装成了对象，在对象中定义了属性和行为丰富了该数据的操作
		 * 用于描述该对象的类就称之为基本数据类型包装类
		 * byte 	Byte
		 * short	Short
		 * int		Integer
		 * long		Long
		 * float	Float
		 * double	Double
		 * char		Character
		 * boolean	Boolean
		 * 
		 * Integer包装对象主要用基本类型和字符串之间的转换
		 * 基本类型--->字符串
		 * 		1，基本类型数值+""
		 * 		2，用String类中的静态方法valueOf(基本类型数值)
		 * 		3，用Integer的静态方法valueOf(基本类型数值)
		 * 字符串--->基本数值类型
		 * 		1，使用包装类中的静态方法xxx parseXxx("xxx类型的字符串")
		 * 			int parseInt("intstring");
		 * 			long parseLong("longstring");
		 * 			boolean parseBoolean("booleanstring");
		 * 			只有Character，没有parse方法
		 * 		2，如果字符串被Integer进行了对象的封装
		 * 			可以使用另一个非静态的方法，intValue();
		 * 			将一个Integer对象转成基本数据类型
		 * 
		 * */
		/*String age = "20";
		//Integer i = new Integer(age);
		int a = Integer.parseInt(age);
		System.out.println(12+a);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.toBinaryString(-6));
		String s = "123";
		Integer i = new Integer(s);
		System.out.println(i+456);*/
		
		/* 整数具备不同的进制体现
		 * 十进制-->>其它进制
		 * 		toBinaryString
		 * 		toOctalString
		 * 		toHexString
		 * 		toString
		 * 其它进制-->>十进制
		 * 		parseInt
		 * */
		//十进制-->>其它进制
		//将十进制转换成二进制
		System.out.println(Integer.toBinaryString(60));
		//将十进制转换成八进制
		System.out.println(Integer.toOctalString(60));
		//将十进制转换成十六进制
		System.out.println(Integer.toHexString(60));
		//将任意一个进制的数转换成任意进制
		System.out.println(Integer.toString(60,16));
		
		//其它进制-->>十进制
		System.out.println(Integer.parseInt("3c",16));
		
		Integer a = new Integer(3);
		Integer b = new Integer("3");
		System.out.println(a.equals(b));
		//如果两个对象内容相同返回0，如果比参数小返回-1，比参数大返回1
		System.out.println(a.compareTo(b));
		
		
	}

}
