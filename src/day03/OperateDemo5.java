package day03;

public class OperateDemo5 {

	public static void main(String[] args) {

		int x = 10,y;
		y = (x>11)?100:200;
		
		//��ȡ�������е����ֵ
		int a = 5,b = 10;
		int z = a>b?a:b;
		
		//��ȡ�������е����ֵ
		int o = 9,p = 2,q = 5;
		int max = o>p?o:p;
		int max2 = q>max?q:max;
		System.out.println(max2);
	}

}
