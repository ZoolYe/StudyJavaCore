package day14;

public class ThreadTest {

	public static void main(String[] args) {
		
		/*new Thread() {
			public void run() {
				for(int i=0; i<50; i++) {
					System.out.println("i = "+i);
				}
			}
		}.start();
		
		
		Runnable r = new Runnable() {
			public void run() {
				for(int x=0; x<50; x++) {
					System.out.println("x = "+x);
				}
			}
		};
		new Thread(r).start();
		
		for(int y=0; y<50; y++) {
			System.out.println("y = "+y);
		}*/
		
		new Thread(new Runnable() {
			
			public void run() {
				System.out.println("****");
			}
			
		}) {
			public void run() {
				System.out.println("....");
			}
		}.start();
		
	}
}

class Test implements Runnable{
	
	public void run(Thread t) {
		
	}
	
	//实现了接口，必须实现接口中的方法，或者将类声明为抽象类
	public void run() {
		
	}
}