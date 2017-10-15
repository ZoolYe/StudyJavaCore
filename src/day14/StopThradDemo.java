package day14;
/* ֹͣ�߳�
 * 1��stop����(�����ѹ�ʱ)
 * 2��run��������
 * ���������̵߳�����
 * �����ж�����ѭ���ṹ��ֻҪ����סѭ���Ϳ��Խ�������
 * ����ѭ��ͨ�����ñ�������
 * 
 * ����̴߳����˶���״̬���޷���ȡ��ǣ���ν����أ�
 * ����ʹ��interrupt()�������̴߳Ӷ���״̬ǿ�ƻָ�������״̬���������߳̾߱�cpu��ִ���ʸ�
 * ����ǿ�ƶ����ᷢ���ж��쳣��InterruptedExceptionҪ���д���
 * */
public class StopThradDemo {

	public static void main(String[] args) {
		StopThrad st = new StopThrad();
		
		Thread t1 = new Thread(st);
		Thread t2 = new Thread(st);
		t1.start();
		//��t2����Ϊ��̨�̣߳������ú��̨�̺߳�ǰ̨�߳̽����󣬺�̨�߳�Ҳ�����
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
				//���������쳣������Ǹ�Ϊ�٣����߳�ֹͣ����
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
			throw new RuntimeException("�봫��ָ��������");
		}
	}
	
}