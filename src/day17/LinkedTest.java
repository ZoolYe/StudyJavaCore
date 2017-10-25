package day17;

public class LinkedTest {

	/* 使用LinkedList来模拟一个堆栈或者队列数据结构
	 * 堆栈：先进后出 First In Last Out FILO
	 * 队列：先进先出 First In First Out FIFO
	 * */
	
	public static void main(String[] args) {
		DuiLie d = new DuiLie();
		d.myAdd("abc1");
		d.myAdd("abc2");
		d.myAdd("abc3");
		d.myAdd("abc4");
		
		while(!d.isNull()) {
			System.out.println(d.myGet());
		}
		
	}

}
