package day13;
/* �̰߳�ȫ���������ԭ��
 * 1������߳��ڲ������������
 * 2�������������ݵ��̴߳����ж���
 * ��һ���߳���ִ�в����������ݵĶ�������Ĺ����У������̲߳���������
 * �ͻᵼ���̰߳�ȫ����Ĳ���
 * 
 * ���˼·��
 * ���ǽ����������������ݵ��̴߳����װ�����������߳���ִ����Щ�����ʱ�������̲߳����Բ�������
 * ����Ҫ��ǰ�̰߳���Щ���붼ִ����Ϻ������̲߳ſ��Բ�������
 * ��Java�У���ͬ�������Ϳ��Խ���������
 * ͬ�������ĸ�ʽ��
 * synchronized(����){
 * 	��Ҫ��ͬ���Ĵ��룻
 * }
 * ͬ���ĺô���������̵߳İ�ȫ����
 * ͬ���ı׶ˣ���Խ�����Ч�ʣ���Ϊͬ������̶߳����ж�ͬ����
 * 
 * ͬ����ǰ�᣺ͬ���б����ж���̲߳�ʹ��ͬһ����
 * */
public class TicketDemo {

	public static void main(String[] args) {

		/*Ticket t1 = new Ticket();
		Ticket t2 = new Ticket();
		t1.start();
		t2.start();*/
		
		Ticket t = new Ticket();//����һ���߳��������
		
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		t1.start();
		t2.start();
	}

}

/*class Ticket extends Thread{
	
	//��Ʊ
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
	//��Ʊ
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