package day12;
/* ��δ���һ���߳�
 * �����̷߳�ʽһ���̳�Thread��
 * 
 * ���裺
 * 1������һ����̳�Thread��
 * 2������Thread���е�run����
 * 
 * */
public class ThreadDemo2 {

	public static void main(String[] args) {

		Zool2 z1 = new Zool2("C");
		Zool2 z2 = new Zool2("Z");
		z1.loop();
		z2.loop();
	}

}

class Zool2{
	
	private String str;
	
	public Zool2(String str) {
		this.str = str;
	}
	
	public void loop() {
		for(int i=0; i<=10; i++) {
			System.out.println(i+" : "+str);
		}
	}
	
}