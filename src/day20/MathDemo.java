package day20;

import java.util.Random;

public class MathDemo {

	public static void main(String[] args) {
		
		/* Math:�ṩ�˲�����ѧ����ķ��������Ǿ�̬��
		 * ���õķ�����
		 * ceil():���ش��ڲ�������С����
		 * floor():����С�ڲ������������
		 * round():�����������������
		 * pow(a,b):a��b�η�
		 * */
		double d1 = Math.ceil(12.56);
		double d2 = Math.floor(12.56);
		double d3 = Math.round(12.56);
		int p1 = (int) Math.pow(2, 2);
		/*p(p1);
		p("d1: "+d1);
		p("d2: "+d2);
		p("d3: "+d3);*/
		
		Random r = new Random();
		for(int i=0; i<10; i++) {
			double d =Math.round(Math.random()*10); 
			double d4 = Math.round((r.nextDouble()*10));
			
			//����0-6֮����������������6
			int in = r.nextInt(6);
			p(in);
			
		}
		
	}

	public static void p(Object obj) {
		System.out.println(obj);
	}
}
