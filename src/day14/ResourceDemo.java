package day14;

public class ResourceDemo {

	public static void main(String[] args) {
		//创建资源
		Resource r = new Resource();
		Input in = new Input(r);
		Output ou = new Output(r);
		Thread t1 = new Thread(in);
		Thread t2 = new Thread(ou);
		t1.start();
		t2.start();
	}

}
/* 线程间通讯：
 * 多个线程在处理同一资源，但是任务却不同
 */

//资源
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
					r.name = "张三";
					r.sex = "男";
					x = 1;
				}else {
					r.name = "花木兰";
					r.sex = "女";
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