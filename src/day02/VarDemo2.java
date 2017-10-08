package day02;

public class VarDemo2 {

	public static void main(String[] args) {

		/*int a = 3;
		byte b = 5;
		//自动类型提升
		a = a+b;*/
		
		byte b = 3;
		//数字默认的是int类型	
		b = (byte)(b + 200); //强制类型转换
		
		/*System.out.println((char)('a'+1));
		System.out.println((char)'你'+0 < (char)'好'+0);*/
		
		byte c = 3;
		
		byte b1 = 7;
		byte b2 = 3;
		
		c = 3+7;
		
		int i = Integer.MAX_VALUE;
		int i2 = Integer.MIN_VALUE;
		
		System.out.println(i-i2);
	}

}
