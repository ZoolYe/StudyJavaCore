package day04;

public class FunctionDemo4 {

	public static void main(String[] args) {

		//printMultiplicationTable(7);
		print99();
	}

	/* 函数的重载
	 * 1，同一个类
	 * 2，同名
	 * 3，参数个数不同or参数类型不同
	 * 4，函数的重载和返回值类型无关
	 * 5，Java是严谨性语言，如果函数出现不确定性，会编译失败
	 * */
	
	//加法运算，两个整数的和
	public static int add(int a, int b) {
		return a+b;
	}
	
	//加法运算，两个小数的和
	public static double add(double a, double b) {
		return a+b;
	}
	
	//加法运算，三个整数的和
	public static int add(int a, int b, int c) {
		return add(a, b)+c;
	}
	
	//打印乘法表
	
	public static void printMultiplicationTable(int a) {
		
		for(int i=1; i<=a; i++) {
			
			for(int x=1; x<=i; x++) {
				System.out.print(x+"x"+i+"="+x*i+"\t");
			}
			System.out.println();
		}
		
	}
	
	public static void print99() {
		printMultiplicationTable(9);
	}
	
}
