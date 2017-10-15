package day14;
/* 停止线程
 * 1，stop方法(方法已过时)
 * 2，run方法结束
 * 怎样控制线程的任务？
 * 任务中都会有循环结构，只要控制住循环就可以结束任务
 * 控制循环通常就用标记来完成
 * 
 * 如果线程处于了冻结状态，无法读取标记，如何结束呢？
 * 可以使用interrupt()方法将线程从冻结状态强制恢复到运行状态中来，让线程具备cpu的执行资格
 * 但是强制动作会发生中断异常，InterruptedException要进行处理
 * */
public class StopThradDemo {

	public static void main(String[] args) {
		StopThrad st = new StopThrad();
		
		Thread t1 = new Thread(st);
		Thread t2 = new Thread(st);
		t1.start();
		//将t2设置为后台线程，当设置后后台线程后，前台线程结束后，后台线程也会结束
		t2.setDaemon(true);
		t2.start();
		try {
			Thread.sleep(1000);
			t1.interrupt();
			//t2.interrupt();
			//st.setFlag(0);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//t1.interrupt();
	}

}

class StopThrad implements Runnable{
	
	private boolean flag = true;
	private int num = 0;
	public synchronized void run() {
		
		while(flag) {
			
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println(Thread.currentThread().getName()+"....."+e);
				//处理发生的异常，将标记改为假，让线程停止运行
				flag = false;
			}
			
			System.out.println(Thread.currentThread().getName()+" : "+num++);
		}
		
	}
	
	public void setFlag(int i) {
		
		if(i==0) {
			flag = false;
		}else if(i==1) {
			flag = true;
		}else {
			System.exit(0);
			throw new RuntimeException("请传入指定的数据");
		}
	}
	
}