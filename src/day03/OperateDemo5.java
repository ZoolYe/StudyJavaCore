package day03;

public class OperateDemo5 {

	public static void main(String[] args) {

		int x = 10,y;
		y = (x>11)?100:200;
		
		//获取两个数中的最大值
		int a = 5,b = 10;
		int z = a>b?a:b;
		
		//获取三个数中的最大值
		int o = 9,p = 2,q = 5;
		int max = o>p?o:p;
		int max2 = q>max?q:max;
		System.out.println(max2);
	}

}
