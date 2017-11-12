package day20;

import java.util.Random;

public class MathDemo {

	public static void main(String[] args) {
		
		/* Math:提供了操作数学运算的方法，都是静态的
		 * 常用的方法：
		 * ceil():返回大于参数的最小整数
		 * floor():返回小于参数的最大整数
		 * round():返回四舍五入的整数
		 * pow(a,b):a的b次方
		 * */
		double d1 = Math.ceil(12.56);
		double d2 = Math.floor(12.56);
		double d3 = Math.round(12.56);
		int p1 = (int) Math.pow(2, 2);
		/*p(p1);
		p("d1: "+d1);
		p("d2: "+d2);
		p("d3: "+d3);*/
		
		Random r = new Random();
		for(int i=0; i<10; i++) {
			double d =Math.round(Math.random()*10); 
			double d4 = Math.round((r.nextDouble()*10));
			
			//返回0-6之间的随机数，不包含6
			int in = r.nextInt(6);
			p(in);
			
		}
		
	}

	public static void p(Object obj) {
		System.out.println(obj);
	}
}
