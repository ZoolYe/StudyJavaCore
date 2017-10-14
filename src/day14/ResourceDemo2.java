package day14;
/* �ȴ�/���ѻ���
 * �漰�ķ�����
 * 1.wait();���̴߳��ڶ���״̬����wait���̻߳ᱻ�洢���̳߳���
 * 2.notify();�����̳߳��е�һ���߳�(����һ���߳�)
 * 3.notifyAll();�����̳߳��е������߳�
 * 
 * ��Щ���������붨����ͬ����
 * ��Ϊ��Щ���������ڲ����̵߳�״̬
 * ����Ҫ��ȷ���ײ��������ĸ����ϵ��߳�
 * 
 * Ϊʲô�����̵߳ķ�����������object�У�
 * ��Ϊ��Щ�����Ǽ������ķ�������������ʵ��������������������Ķ���
 * ����Ķ�����õķ���һ��������object��
 * */
public class ResourceDemo2 {

	public static void main(String[] args) {
		//������Դ
		Resource2 r = new Resource2();
		Input2 in = new Input2(r);
		Output2 ou = new Output2(r);
		Thread t1 = new Thread(in);
		Thread t2 = new Thread(ou);
		t1.start();
		t2.start();
	}
}

//��Դ
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
					r.name = "����";
					r.sex = "��";
					x = 1;
				}else {
					r.name = "��ľ��";
					r.sex = "Ů";
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