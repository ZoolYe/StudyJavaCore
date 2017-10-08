package day03;

public class DoWhileDemo {

	public static void main(String[] args) {

		/*do {
			执行语句
		}while(条件表达式);*/
		
		int x = 3;
		
		//do while语句的特点，无论条件是否满足，循环体至少执行一次
		do {
			System.out.println(x);
		}while(x<1);
		
	}

}
