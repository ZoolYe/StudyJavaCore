package day02;

public class OperateDemo {

	public static void main(String[] args) {

		//���������  + - * / %(ȡ��) +(���ӷ�)
		//++(����) --(�Լ�)
		
		int x = 6370;
		x = x / 1000 * 1000;
		
		//ȡģ���㣬������С���ұ߽���������
		//System.out.println(2%5);
		
		int a = 10,b;
		b = a++;
		System.out.println("b="+b + "a="+a);
		
		int i = 3;
		i = ++i;
		System.out.println(i);
		
	}

}