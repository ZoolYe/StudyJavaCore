package day13;

public class SynFunctionLockDemo {

	public static void main(String[] args) {

		Ticket2 t = new Ticket2();//����һ���߳��������
		
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		t1.start();
		t2.start();
	}

}

class Ticket2 implements Runnable{
	
	Object obj = new Object();
	//��Ʊ
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
	
	/* ͬ������ʹ�õ�����this
	 * ͬ��������ͬ������������
	 * ͬ�����������ǹ̶���this
	 * ͬ����������������Ķ���
	 * ����ʹ��ͬ�������
	 * 
	 * ��̬��ͬ������ʹ�õ����Ǹú��������ֽ����ļ����󣬿�����getClass������ȡ��Ҳ���Ե�ǰ����.class��ʽ��ʾ
	 * */
	
	public synchronized void show() {
		if(num>0) {
			System.out.println(Thread.currentThread().getName()+" : "+num--);
		}
	}
	
}