package day03;

public class IfDemo2 {

	public static void main(String[] args) {

		/* if语句的第二种格式
		 * if(条件表达式){
		 * 	执行语句
		 * }else{
		 * 	执行语句
		 * }
		 * */
		
		int x = 3;
		
		if(x<1) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
		
		int a = 3,b;
		if(a>1)
			b = 100;
		else
			b = 200;
		System.out.println(b);
		
		//三元运算符就是if else 语句的简写格式
		int b1 = a>1?100:200;
		
	}

}
