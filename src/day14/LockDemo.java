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
/* �����ߣ�������
 * ��������������
 * while�жϱ�ǣ�������̻߳�ȡִ��Ȩ���Ƿ�Ҫ����
 * notifyAll����ˣ������߳�һ���ỽ�ѶԷ��߳�
 * notifyֻ�ܻ���һ���̣߳�������������˱�������û�������
 * 
 * jdk1.5�Ժ�ͬ��������װ���˶���
 * ��������������ʽ��ʽ���嵽�˸ö�����
 * ����ʽ�Ķ����������ʽ����
 * 
 * Lock�ӿڣ����������ͬ��������ͬ����������ͬ������ʽ�������������ʽ������
 * 		ͬʱ��Ϊ������һ�����ϼ��϶��������
 * 		lock()��������ȡ��  
 * 		unlock()���ͷ���(ͨ��������finally�������)
 * Condition�ӿڣ����������Object�е�wait notify notifyAll����
 * 		����Щ���������������Ľ����˷�װ�������Condition���������󣬿��Ժ��������������
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
			r.set("��Ѽ");
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
	//����һ��������
	Lock lock = new ReentrantLock();
	//ͨ�����е�������ȡ���ϵļ���������
	//Condition con = lock.newCondition();
	//ͨ�����е�����ȡ�����������һ����������ߣ�һ�����������
	Condition por_con = lock.newCondition();
	Condition con_con = lock.newCondition();
	
	public void set(String name) {
		
		lock.lock();
		try {
			//if�жϱ��ֻ���ж�һ�Σ��ᵼ�²������е��߳������ˣ��������ݴ���
			//while�жϱ�ǣ�������̻߳�ȡִ��Ȩ���Ƿ�Ҫ����
			while(flag) {
				try {
					por_con.await();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
				this.name = name+" : "+count+"ֻ";
				System.out.println(Thread.currentThread().getName()+"..������.."+this.name);
				count++;
				flag = true;
				//����ȫ���̣߳�����ֻ�����˱����̶߳��������
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
				System.out.println(Thread.currentThread().getName()+"..������.."+this.name);
				flag = false;
				por_con.signal();
		} finally {
			lock.unlock();
		}
		
	}
}