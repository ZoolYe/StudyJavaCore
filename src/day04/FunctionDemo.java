package day04;

public class FunctionDemo {

	public static void main(String[] args) {

		/*int sum = add(30, 20);
		System.out.println(sum);*/
		//printRectangle(4, 5);
		//System.out.println(isEqual(5, 5));
		//System.out.println(getMax(60, 61));
		//print99();
		System.out.println(getGrade(1));
	}

	/*static int add(int a,int b) {
		
		return a+b;
	}*/
	
	/* 定义函数的格式
	 * 修饰符 返回值类型 函数名(参数类型 形式参数,参数类型 形式参数2,...){
	 * 		执行语句
	 * 		return 返回值;
	 * }
	 * 
	 * 特殊情况：
	 * 功能没有具体的返回值
	 * 这时return的后面直接用分号结束
	 * 没有具体返回值时，返回值类型用void来表示
	 * 如果返回值类型是void，那么函数中的return语句可以省略不写
	 * 返回值类型和参数类型，没有直接关系
	 * 
	 * */
	
	//加
	public static int add(int a, int b) {
		return a+b;
	}
	
	//减
	public static int reduce(int a, int b) {
		return a-b;
	}
	
	//乘
	public static int ride(int a, int b) {
		return a*b;
	}
	
	//除
	public static int except(int a, int b) {
		return a/b;
	}
	
	//判断两个数是否相等
	public static boolean isEqual(int a, int b) {
		return a==b;
	}	
	
	//获取两个数中最大的数
	public static int getMax(int a, int b) {
		/*int max=0;
		if(a>b) {
			max=a;
		}else {
			max=b;
		}
		return max;*/
		return a>b?a:b;
	}
	
	//根据用户输入的数字打印对应的矩形
	public static void printRectangle(int a, int b) {
		
		for(int i=1; i<=a; i++) {
			
			for(int x=1; x<=b; x++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
	
	//输出99乘法表
	public static void print99() {
		
		for(int i=1; i<=9; i++) {
			
			for(int x=1; x<=i; x++) {
				System.out.print(x+"x"+i+"="+x*i+"\t");
			}
			System.out.println();
		}
		
	}
	
	/* 根据考试成绩获取学生分数对应的等级
	 * 90~100	A
	 * 80~89	B
	 * 70~79	C
	 * 60~69	D
	 * 60以下		E
	 * */
	
	public static char getGrade(int score) {
		if(score>=90 && score<=100) {
			return 'A';
		}else if(score>=80 && score<=89) {
			return 'B';
		}else if(score>=70 && score<=79) {
			return 'C';
		}else if(score>=60 && score<=69) {
			return 'D';
		}else if(score<60 && score>=0) {
			return 'E';
		}else {
			return 'x';
		}
	}
	
}