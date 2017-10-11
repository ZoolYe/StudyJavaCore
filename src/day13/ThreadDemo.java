package day13;
/* �����̵߳ĵ�һ�ַ�ʽ���̳�Thread��
 * �����̵߳ĵڶ��ַ�ʽ��ʵ��Runnable�ӿ�
 * */
public class ThreadDemo {

	public static void main(String[] args) {
		Demo d1 = new Demo("str");
		Demo d2 = new Demo("str");
		Thread t1 = new Thread(d1);
		Thread t2 = new Thread(d2);
		t1.start();
		t2.start();
	}
}

/* ׼����չDemo��Ĺ��ܣ������е����ݿ�����Ϊ�̵߳�����ִ�У�ͨ���ӿڵ���ʽ���
 * �����̵߳ĵڶ��ַ�ʽ��ʵ��Runnable�ӿ�
 * 1��������ʵ��Runnable�ӿ�
 * 2�����ǽӿ��е�run���������̵߳���������װ��run������
 * 3��ͨ��Thread�ഴ���̶߳��󣬲���Runnable�ӿڵ����������ΪThread��Ĺ��캯���Ĳ������д���
 * 		��Ϊ�̵߳����񶼷�װ��Runnable�ӿڵ���������run�����У�����Ҫ���̶߳��󴴽�ʱ�ͱ�����ȷҪ
 * 		���е�����
 * 4�������̶߳����start�������������߳�
 * */
class Demo implements Runnable{
 
	
	public Demo(String strName) {
		
	}
	
	public void run() {
		loop();
	}
	
	public void loop() {
		for(int i=0; i<=20; i++) {
			System.out.println(Thread.currentThread().getName()+" :  "+i);
		}
	}
	
}
/*�����̵߳ĵ�һ�ַ�ʽ���̳�Thread��
 * class Demo extends Thread{
 
	
	public Demo(String strName) {
		super(strName);
	}
	
	public void run() {
		loop();
	}
	
	public void loop() {
		for(int i=0; i<=20; i++) {
			System.out.println(Thread.currentThread().getName()+" :  "+i);
		}
	}
	
}*/