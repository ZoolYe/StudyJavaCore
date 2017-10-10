package day12;
/* 如何创建一个线程
 * 创建线程方式一：继承Thread类
 * 
 * 步骤：
 * 1，定义一个类继承Thread类
 * 2，覆盖Thread类中的run方法
 * 
 * */
public class ThreadDemo2 {

	public static void main(String[] args) {

		Zool2 z1 = new Zool2("C");
		Zool2 z2 = new Zool2("Z");
		z1.loop();
		z2.loop();
	}

}

class Zool2{
	
	private String str;
	
	public Zool2(String str) {
		this.str = str;
	}
	
	public void loop() {
		for(int i=0; i<=10; i++) {
			System.out.println(i+" : "+str);
		}
	}
	
}