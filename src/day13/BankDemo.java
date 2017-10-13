package day13;

public class BankDemo {

	public static void main(String[] args) {
		Cus c = new Cus();
		Thread t1 = new Thread(c);
		Thread t2 = new Thread(c);
		t1.start();
		t2.start();
	}

}

class Cus implements Runnable{
	
	private Bank b = new Bank();
	
	public void run() {
		saveMoney();
	}
	
	public void saveMoney() {
		for(int i = 0; i<3; i++) {
			b.add(100);
		}
	}
	
}

class Bank{
	private Object obj = new Object();
	private int sum = 0;
	//´æÇ®
	public synchronized void add(int num) {//Í¬²½º¯Êý
		
		//synchronized (obj) {
			sum = sum+num;
			System.out.println("Óà¶î£º "+sum);
		//}
		
	}
	
}