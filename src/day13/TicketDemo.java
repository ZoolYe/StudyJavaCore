package day13;
/* 线程安全问题产生的原因：
 * 1，多个线程在操作共享的数据
 * 2，操作共享数据的线程代码有多条
 * 当一个线程在执行操作共享数据的多条代码的过程中，其他线程参与了运算
 * 就会导致线程安全问题的产生
 * 
 * 解决思路：
 * 就是将多条操作共享数据的线程代码封装起来，当有线程在执行这些代码的时候，其他线程不可以参与运算
 * 必须要当前线程把这些代码都执行完毕后，其他线程才可以参与运算
 * 在Java中，用同步代码块就可以解决这个问题
 * 同步代码块的格式：
 * synchronized(对象){
 * 	需要被同步的代码；
 * }
 * 同步的好处：解决了线程的安全问题
 * 同步的弊端：相对降低了效率，因为同步外的线程都会判断同步锁
 * 
 * 同步的前提：同步中必须有多个线程并使用同一个锁
 * */
public class TicketDemo {

	public static void main(String[] args) {

		/*Ticket t1 = new Ticket();
		Ticket t2 = new Ticket();
		t1.start();
		t2.start();*/
		
		Ticket t = new Ticket();//创建一个线程任务对象
		
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		t1.start();
		t2.start();
	}

}

/*class Ticket extends Thread{
	
	//车票
	private static int num = 10;
	
	public void run() {
		the_ticket();
	}
	
	public void the_ticket() {
		
		while(true) {
			if(num>0) {
				System.out.println(Thread.currentThread().getName()+" : "+num--);
			}
		}
	}
}*/

class Ticket implements Runnable{
	
	Object obj = new Object();
	//车票
	private int num = 10;
	
	public void run() {
		the_ticket();
	}
	
	public void the_ticket() {
		
		while(true) {
			
			synchronized (obj) {
				if(num>0) {
				try {
					
					Thread.sleep(100);
				}catch(InterruptedException ie) {
					System.out.println(ie);
				}
				System.out.println(Thread.currentThread().getName()+" : "+num--);
				}
			}
			
		}
	}
}