package day14;
/* 等待/唤醒机制
 * 涉及的方法：
 * 1.wait();让线程处于冻结状态，被wait的线程会被存储到线程池中
 * 2.notify();唤醒线程池中的一个线程(任意一个线程)
 * 3.notifyAll();唤醒线程池中的所有线程
 * 
 * 这些方法都必须定义在同步中
 * 因为这些方法是用于操作线程的状态
 * 必须要明确到底操作的是哪个锁上的线程
 * 
 * 为什么操作线程的方法定义在了object中？
 * 因为这些方法是监视器的方法，监视器其实就是锁，锁可以是任意的对象
 * 任意的对象调用的方法一定定义在object中
 * */
public class ResourceDemo2 {

	public static void main(String[] args) {
		//创建资源
		Resource2 r = new Resource2();
		Input2 in = new Input2(r);
		Output2 ou = new Output2(r);
		Thread t1 = new Thread(in);
		Thread t2 = new Thread(ou);
		t1.start();
		t2.start();
	}
}

//资源
class Resource2{
	String name;
	String sex;
	boolean flag = false;
}

class Input2 implements Runnable{
	
	private Resource2 r;
	
	public Input2(Resource2 r) {
		this.r = r;
	}
	
	public void run() {
		int x = 0;
		
		while(true) {
			synchronized (r) {
				
				if(r.flag) {
					try {
						r.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
				}
					if(x==0) {
					r.name = "张三";
					r.sex = "男";
					x = 1;
				}else {
					r.name = "花木兰";
					r.sex = "女";
					x = 0;
				}
					r.flag = true;
					r.notify();
			}
		}
	}
}

class Output2 implements Runnable{
	
	private Resource2 r;
	
	public Output2(Resource2 r) {
		this.r = r;
	}
	
	public void run() {
		
		while(true) {
			synchronized (r) {
				
				if(r.flag) {
					System.out.println(r.name+"   "+r.sex);
					r.flag = false;
					r.notify();
				}else {
					try {
						r.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
}