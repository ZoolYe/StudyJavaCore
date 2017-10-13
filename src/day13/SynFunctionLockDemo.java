package day13;

public class SynFunctionLockDemo {

	public static void main(String[] args) {

		Ticket2 t = new Ticket2();//创建一个线程任务对象
		
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		t1.start();
		t2.start();
	}

}

class Ticket2 implements Runnable{
	
	Object obj = new Object();
	//车票
	private int num = 10;
	
	public void run() {
		the_ticket();
	}
	
	public void the_ticket() {
		
		while(true) {
			show();
			//synchronized (obj) {
				/*if(num>0) {
				try {
					
					Thread.sleep(100);
				}catch(InterruptedException ie) {
					System.out.println(ie);
				}
				System.out.println(Thread.currentThread().getName()+" : "+num--);
				}*/
			//}
			
		}
	}
	
	/* 同步函数使用的锁是this
	 * 同步函数和同步代码块的区别：
	 * 同步函数的锁是固定的this
	 * 同步代码块的锁是任意的对象
	 * 建议使用同步代码块
	 * 
	 * 静态的同步函数使用的锁是该函数所属字节码文件对象，可以用getClass方法获取，也可以当前类名.class形式表示
	 * */
	
	public synchronized void show() {
		if(num>0) {
			System.out.println(Thread.currentThread().getName()+" : "+num--);
		}
	}
	
}