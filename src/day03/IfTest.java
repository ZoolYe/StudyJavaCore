package day03;

public class IfTest {

	public static void main(String[] args) {

		int x = 8;
		
		if(x == 1) {
			System.out.println("星期一");
		}else if(x == 2) {
			System.out.println("星期二");
		}else if(x == 3) {
			System.out.println("星期三");
		}else if(x == 4) {
			System.out.println("星期四");
		}else if(x == 5) {
			System.out.println("星期五");
		}else if(x == 6) {
			System.out.println("星期六");
		}else if(x == 7) {
			System.out.println("星期天");
		}else {
			System.out.println("没有星期："+x);
		}
		
	}

}
