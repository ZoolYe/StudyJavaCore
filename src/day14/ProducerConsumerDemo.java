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
/* �����ߣ�������
 * ��������������
 * while�жϱ�ǣ�������̻߳�ȡִ��Ȩ���Ƿ�Ҫ����
 * notifyAll����ˣ������߳�һ���ỽ�ѶԷ��߳�
 * notifyֻ�ܻ���һ���̣߳�������������˱�������û�������
 * */

class Producer implements Runnable {
	
	private Resrouce r;
	
	public Producer(Resrouce r) {
		this.r = r;
	}
	
	public void run() {
		while(true) {
			r.set("��Ѽ");
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
		//if�жϱ��ֻ���ж�һ�Σ��ᵼ�²������е��߳������ˣ��������ݴ���
		//while�жϱ�ǣ�������̻߳�ȡִ��Ȩ���Ƿ�Ҫ����
		while(flag) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.name = name+" : "+count+"ֻ";
		System.out.println(Thread.currentThread().getName()+"..������.."+this.name);
		count++;
		flag = true;
		//����ȫ���̣߳�����ֻ�����˱����̶߳��������
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
		System.out.println(Thread.currentThread().getName()+"..������.."+this.name);
		flag = false;
		this.notifyAll();
	}
}