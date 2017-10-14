package day14;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockDemo {

	public static void main(String[] args) {
		Resrouce2 r = new Resrouce2();
		Producer2 p = new Producer2(r);
		Consumer2 c = new Consumer2(r);
		Thread t0 = new Thread(p);
		Thread t1 = new Thread(p);
		Thread t2 = new Thread(c);
		Thread t3 = new Thread(c);
		t0.start();
		t1.start();
		t2.start();
		t3.start();
	}

}
/* 生产者，消费者
 * 多生产，多消费
 * while判断标记，解决了线程获取执行权后，是否要运行
 * notifyAll解决了，本方线程一定会唤醒对方线程
 * notify只能唤醒一个线程，如果本方唤醒了本方，是没有意义的
 * 
 * jdk1.5以后将同步和锁封装成了对象
 * 并将操作锁的隐式方式定义到了该对象中
 * 将隐式的动作变成了显式动作
 * 
 * Lock接口：出现替代了同步代码块和同步函数，将同步的隐式锁操作变成了显式锁操作
 * 		同时更为灵活，可以一个锁上加上多组监视器
 * 		lock()：方法获取锁  
 * 		unlock()：释放锁(通常定义在finally代码块中)
 * Condition接口：出现替代了Object中的wait notify notifyAll方法
 * 		将这些监视器方法单独的进行了封装，变成了Condition监视器对象，可以和任意锁进行组合
 * 		await();
 * 		signal();
 * 		signalAll();
 * */

class Producer2 implements Runnable {
	
	private Resrouce2 r;
	
	public Producer2(Resrouce2 r) {
		this.r = r;
	}
	
	public void run() {
		while(true) {
			r.set("烤鸭");
		}
	}
}

class Consumer2 implements Runnable{
	
	private Resrouce2 r;
	
	public Consumer2(Resrouce2 r) {
		this.r = r;
	}
	
	public void run() {
		
		while(true) {
			r.out();
		}
		
	}
}

class Resrouce2{
	
	private String name;
	private int count = 1;
	private boolean flag = false;
	//创建一个锁对象
	Lock lock = new ReentrantLock();
	//通过已有的锁，获取锁上的监视器对象
	//Condition con = lock.newCondition();
	//通过已有的锁获取两组监视器，一组监视消费者，一组监视生产者
	Condition por_con = lock.newCondition();
	Condition con_con = lock.newCondition();
	
	public void set(String name) {
		
		lock.lock();
		try {
			//if判断标记只会判断一次，会导致不该运行的线程运行了，导致数据错误
			//while判断标记，解决了线程获取执行权后，是否要运行
			while(flag) {
				try {
					por_con.await();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
				this.name = name+" : "+count+"只";
				System.out.println(Thread.currentThread().getName()+"..生产者.."+this.name);
				count++;
				flag = true;
				//唤醒全部线程，避免只唤醒了本方线程而造成死锁
				con_con.signal();
			
			} finally {
				lock.unlock();
			}
	}
	
	public void out() {
		lock.lock();
		try {
				while(!flag) {
				try {
					con_con.await();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
				System.out.println(Thread.currentThread().getName()+"..消费者.."+this.name);
				flag = false;
				por_con.signal();
		} finally {
			lock.unlock();
		}
		
	}
}