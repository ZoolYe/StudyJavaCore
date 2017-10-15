package day14;

public class JoinDemo {

	public static void main(String[] args)throws InterruptedException {
		
		Demo d = new Demo();
		Thread t1 = new Thread(d);
		Thread t2 = new Thread(d);
		t1.start();
		t2.start();
		t2.setPriority(Thread.MAX_PRIORITY);
		//t1.join();//t1线程申请执行权，临时加入一个线程运算时可以使用join方法
		
		for(int i=0; i<50; i++) {
			//System.out.println(Thread.currentThread().toString()+" : "+i);
		}
	}

}

class Demo implements Runnable{
	
	public void run() {
		for(int i=0; i<50; i++) {
			System.out.println(Thread.currentThread().toString()+" : "+i);
			//Thread.yield();//暂停当前正在执行的线程
		}
	}
}