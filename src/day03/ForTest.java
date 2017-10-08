package day03;

public class ForTest {

	public static void main(String[] args) {

		//使用for完成一个累加算法
		int sum = 0;
		for(int i = 0; i <= 100; i++) {
			sum+=i;
		}
		System.out.println(sum);
	}

	/* for和while的特点
	 * 1，for和while可以互换
	 * */
	
	/* 无限循环最简单的形式
	 * while(true){}
	 * for(;;){
	 * }
	 * */
	
	/* 什么时候使用循环结构
	 * 当对某些代码执行很多次时，使用循环结构
	 * 当对一个条件进行一次判断时，使用if语句
	 * 当对一个条件进行多次判断时，可以使用while语句
	 * 
	 * 注意：
	 * 在使用循环语句时，一定要明确哪些语句需要循环，哪些不需要循环
	 * 循环通常情况下，需要定义条件，需要控制循环次数
	 * */
	
}
