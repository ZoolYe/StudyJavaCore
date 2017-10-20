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
		 * 字符串--->基本数值类型
		 * 		1，使用包装类中的静态方法xxx parseXxx("xxx类型的字符串")
		 * 			int parseInt("intstring");
		 * 			long parseLong("longstring");
		 * 			boolean parseBoolean("booleanstring");
		 * 			只有Character，没有parse方法
		 * 
		 * */
		String age = "20";
		//Integer i = new Integer(age);
		int a = Integer.parseInt(age);
		System.out.println(12+a);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.toBinaryString(-6));
		
	}

}
