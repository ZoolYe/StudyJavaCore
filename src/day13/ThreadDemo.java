package day13;
/* 创建线程的第一种方式：继承Thread类
 * 创建线程的第二种方式：实现Runnable接口
 * */
public class ThreadDemo {

	public static void main(String[] args) {
		Demo d1 = new Demo("str");
		Demo d2 = new Demo("str");
		Thread t1 = new Thread(d1);
		Thread t2 = new Thread(d2);
		t1.start();
		t2.start();
	}
}

/* 准备扩展Demo类的功能，让其中的内容可以作为线程的任务执行，通过接口的形式完成
 * 创建线程的第二种方式：实现Runnable接口
 * 1，定义类实现Runnable接口
 * 2，覆盖接口中的run方法，将线程的任务代码封装到run方法中
 * 3，通过Thread类创建线程对象，并将Runnable接口的子类对象作为Thread类的构造函数的参数进行传递
 * 		因为线程的任务都封装在Runnable接口的子类对象的run方法中，所以要在线程对象创建时就必须明确要
 * 		运行的任务
 * 4，调用线程对象的start方法，并开启线程
 * */
class Demo implements Runnable{
 
	
	public Demo(String strName) {
		
	}
	
	public void run() {
		loop();
	}
	
	public void loop() {
		for(int i=0; i<=20; i++) {
			System.out.println(Thread.currentThread().getName()+" :  "+i);
		}
	}
	
}
/*创建线程的第一种方式：继承Thread类
 * class Demo extends Thread{
 
	
	public Demo(String strName) {
		super(strName);
	}
	
	public void run() {
		loop();
	}
	
	public void loop() {
		for(int i=0; i<=20; i++) {
			System.out.println(Thread.currentThread().getName()+" :  "+i);
		}
	}
	
}*/