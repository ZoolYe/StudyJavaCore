package day17;

public class LinkedTest {

	/* ʹ��LinkedList��ģ��һ����ջ���߶������ݽṹ
	 * ��ջ���Ƚ���� First In Last Out FILO
	 * ���У��Ƚ��ȳ� First In First Out FIFO
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
