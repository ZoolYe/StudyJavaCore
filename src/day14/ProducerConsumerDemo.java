package day14;

public class ProducerConsumerDemo {

	public static void main(String[] args) {
		Resrouce r = new Resrouce();
		Producer p = new Producer(r);
		Consumer c = new Consumer(r);
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
 * */

class Producer implements Runnable {
	
	private Resrouce r;
	
	public Producer(Resrouce r) {
		this.r = r;
	}
	
	public void run() {
		while(true) {
			r.set("烤鸭");
		}
	}
}

class Consumer implements Runnable{
	
	private Resrouce r;
	
	public Consumer(Resrouce r) {
		this.r = r;
	}
	
	public void run() {
		
		while(true) {
			r.out();
		}
		
	}
}

class Resrouce{
	
	private String name;
	private int count = 1;
	private boolean flag = false;
	
	public synchronized void set(String name) {
		//if判断标记只会判断一次，会导致不该运行的线程运行了，导致数据错误
		//while判断标记，解决了线程获取执行权后，是否要运行
		while(flag) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.name = name+" : "+count+"只";
		System.out.println(Thread.currentThread().getName()+"..生产者.."+this.name);
		count++;
		flag = true;
		//唤醒全部线程，避免只唤醒了本方线程而造成死锁
		this.notifyAll();
	}
	
	public synchronized void out() {
		while(!flag) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName()+"..消费者.."+this.name);
		flag = false;
		this.notifyAll();
	}
}