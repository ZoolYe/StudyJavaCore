package day13;

public class DeadLockDemo {

	public static void main(String[] args) {

		Ticket3 t3 = new Ticket3();
		Thread t1 = new Thread(t3);
		Thread t2 = new Thread(t3);
		t1.start();
		t2.start();
		
	}

}
/* 死锁：常见情景之一：同步的嵌套
 * */
class Ticket3 implements Runnable{
	
	private int num = 1000000;
	boolean flag = true;
	Object obj = new Object();
	
	public void run() {
		
		if(flag) {
			while(true) {
				synchronized (obj) {
					show();
				}
				
			}
		}else {
			while(true) {
				this.show();
			}
		}
	}
	public synchronized void show() {
		synchronized (obj) {
			if(num>0) {
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+" : "+num--);
			}
		}
	}
}