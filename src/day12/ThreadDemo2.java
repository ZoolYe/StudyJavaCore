package day12;
/* ��δ���һ���߳�
 * �����̷߳�ʽһ���̳�Thread��
 * 
 * ���裺
 * 1������һ����̳�Thread��
 * 2������Thread���е�run����
 * 3��ֱ�Ӵ���Thread����������
 * 4������start���������̣߳��������̵߳�����run����ִ��
 * 
 * ����ͨ��Thread��getName��ȡ�̵߳�����Thread-���(��0��ʼ)
 * */
public class ThreadDemo2 {

	public static void main(String[] args) {

		/* �����̵߳�Ŀ����Ϊ�˿���һ��ִ��·����ȥ�����ƶ��Ĵ������������ʵ��ͬʱ����
		 * �����е��ƶ�����������ִ��·��������
		 * jvm���������̵߳����񶼶���������������
		 * ���Զ�����߳����������
		 * Thread�����������̣߳��߳�����Ҫ����ģ�����Thread��Ҳ�����������
		 * ��������ͨ��Thread���е�run���������֣�Ҳ����˵��run�������Ƿ�װ
		 * �Զ����߳���������ĺ���
		 * run�����ж���ľ����߳�Ҫ���е��������
		 * �����߳���Ϊ�������ƶ����룬����ֻ�м̳�Thrad�࣬����дrun����
		 * ��Ҫ���еĴ��붨����run������
		 * */
		//Thread t = new Thread();
		
		Zool2 z1 = new Zool2("C");
		Zool2 z2 = new Zool2("Z");
		
		//�����߳�
		z1.start();
		z2.start();
		System.out.println(4/0);
		System.out.println("over");
	}

}

class Zool2 extends Thread{
	
	private String str;
	
	public void run() {
		loop();
	}
	
	public Zool2(String str) {
		//super("�̣߳�"+str);
		this.str = str;
	}
	
	public void loop() {
		for(int i=0; i<=10; i++) {
			//��ȡ��ǰ�̵߳����ã�����ȡ�̵߳�����
			System.out.println(Thread.currentThread().getName()+"  "+i+" : "+str);
		}
	}
	
}