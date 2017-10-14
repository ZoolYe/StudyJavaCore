package day13;

public class DeadLockTest {

	public static void main(String[] args) {
		Test ta = new Test(true);
		Test tb = new Test(true);
		Thread t1 = new Thread(ta);
		Thread t2 = new Thread(tb);
		t1.start();
		t2.start();
	}

}

class Test implements Runnable{
	private boolean flag;
	public Test(boolean flag) {
		this.flag = flag;
	}
	
	public void run(){
		if(flag) {
			
			while(true) {
					synchronized (MyLock.locka) {
					System.out.println("if  lock a");
					synchronized (MyLock.lockb) {
						System.out.println("if  lock b");
					}
				}
			}
			
		}else {
			
			while(true) {
					synchronized (MyLock.lockb) {
					System.out.println("else  lock b");
					synchronized (MyLock.locka) {
						System.out.println("else  lock a");
					}
				}
			}
			
		}
	}
}

class MyLock{
	public static final Object locka = new Object();
	public static final Object lockb = new Object();
}