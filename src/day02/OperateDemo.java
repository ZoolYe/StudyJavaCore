package day02;

public class OperateDemo {

	public static void main(String[] args) {

		//算术运算符  + - * / %(取余) +(连接符)
		//++(自增) --(自减)
		
		int x = 6370;
		x = x / 1000 * 1000;
		
		//取模运算，如果左边小于右边结果就是左边
		//System.out.println(2%5);
		
		int a = 10,b;
		b = a++;
		System.out.println("b="+b + "a="+a);
		
		int i = 3;
		i = ++i;
		System.out.println(i);
		
	}

}