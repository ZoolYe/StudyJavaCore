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
public class ResourceDemo3 {

	public static void main(String[] args) {
		//������Դ
		Resource3 r = new Resource3();
		Input3 in = new Input3(r);
		Output3 ou = new Output3(r);
		Thread t1 = new Thread(in);
		Thread t2 = new Thread(ou);
		t1.start();
		t2.start();
	}
}

//��Դ
class Resource3{
	
	private String name;
	private String sex;
	boolean flag = false;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public String getName() {
		return name;
	}
	
	public String getSex() {
		return sex;
	}
}

class Input3 implements Runnable{
	
	private Resource3 r;
	
	public Input3(Resource3 r) {
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
						r.setName("����");
						r.setSex("��");
					x = 1;
				}else {
					r.setName("��ľ��");
					r.setSex("Ů");
					x = 0;
				}
					r.flag = true;
					r.notify();
			}
		}
	}
}

class Output3 implements Runnable{
	
	private Resource3 r;
	
	public Output3(Resource3 r) {
		this.r = r;
	}
	
	public void run() {
		
		while(true) {
			synchronized (r) {
				
				if(r.flag) {
					System.out.println(r.getName()+"   "+r.getSex());
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