package day14;

public class JoinDemo {

	public static void main(String[] args)throws InterruptedException {
		
		Demo d = new Demo();
		Thread t1 = new Thread(d);
		Thread t2 = new Thread(d);
		t1.start();
		t2.start();
		t2.setPriority(Thread.MAX_PRIORITY);
		//t1.join();//t1�߳�����ִ��Ȩ����ʱ����һ���߳�����ʱ����ʹ��join����
		
		for(int i=0; i<50; i++) {
			//System.out.println(Thread.currentThread().toString()+" : "+i);
		}
	}

}

class Demo implements Runnable{
	
	public void run() {
		for(int i=0; i<50; i++) {
			System.out.println(Thread.currentThread().toString()+" : "+i);
			//Thread.yield();//��ͣ��ǰ����ִ�е��߳�
		}
	}
}