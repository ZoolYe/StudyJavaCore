package day14;

public class ResourceDemo {

	public static void main(String[] args) {
		//������Դ
		Resource r = new Resource();
		Input in = new Input(r);
		Output ou = new Output(r);
		Thread t1 = new Thread(in);
		Thread t2 = new Thread(ou);
		t1.start();
		t2.start();
	}

}
/* �̼߳�ͨѶ��
 * ����߳��ڴ���ͬһ��Դ����������ȴ��ͬ
 */

//��Դ
class Resource{
	String name;
	String sex;
}

class Input implements Runnable{
	
	private Resource r;
	
	public Input(Resource r) {
		this.r = r;
	}
	
	public void run() {
		int x = 0;
		
		while(true) {
			synchronized (r) {
					if(x==0) {
					r.name = "����";
					r.sex = "��";
					x = 1;
				}else {
					r.name = "��ľ��";
					r.sex = "Ů";
					x = 0;
				}
			}
		}
	}
}

class Output implements Runnable{
	
	private Resource r;
	
	public Output(Resource r) {
		this.r = r;
	}
	
	public void run() {
		
		while(true) {
			synchronized (r) {
				System.out.println(r.name+"   "+r.sex);
			}
		}
	}
}