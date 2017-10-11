package day12;
/* 如何创建一个线程
 * 创建线程方式一：继承Thread类
 * 
 * 步骤：
 * 1，定义一个类继承Thread类
 * 2，覆盖Thread类中的run方法
 * 3，直接创建Thread类的子类对象
 * 4，调用start方法开启线程，并调用线程的任务run方法执行
 * 
 * 可以通过Thread的getName获取线程的名称Thread-编号(从0开始)
 * */
public class ThreadDemo2 {

	public static void main(String[] args) {

		/* 创建线程的目的是为了开启一条执行路径，去运行制定的代码和其它代码实现同时运行
		 * 而运行的制定代码就是这个执行路径的任务
		 * jvm创建的主线程的任务都定义在了主函数中
		 * 而自定义的线程任务在哪里？
		 * Thread类用于描述线程，线程是需要任务的，所以Thread类也对任务的描述
		 * 这个任务就通过Thread类中的run方法来体现，也就是说，run方法就是封装
		 * 自定义线程运行任务的函数
		 * run方法中定义的就是线程要运行的任务代码
		 * 开启线程是为了运行制定代码，所以只有继承Thrad类，并复写run方法
		 * 将要运行的代码定义在run方法中
		 * */
		//Thread t = new Thread();
		
		Zool2 z1 = new Zool2("C");
		Zool2 z2 = new Zool2("Z");
		
		//开启线程
		z1.start();
		z2.start();
		System.out.println(4/0);
		System.out.println("over");
	}

}

class Zool2 extends Thread{
	
	private String str;
	
	public void run() {
		loop();
	}
	
	public Zool2(String str) {
		//super("线程："+str);
		this.str = str;
	}
	
	public void loop() {
		for(int i=0; i<=10; i++) {
			//获取当前线程的引用，并获取线程的名字
			System.out.println(Thread.currentThread().getName()+"  "+i+" : "+str);
		}
	}
	
}