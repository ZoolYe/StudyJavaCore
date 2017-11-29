package day23;

public class Recursion {

	public static void main(String[] args) {
		
		/* 递归：
		 * 函数自身直接或者间接的调用到了自身
		 * 使用：一个功能在被重复使用，并每次使用时，参与运算的结果和上一次调用有关，就可以使用递归
		 * 注意：
		 * 1，递归一定要明确条件。否则容易栈溢出
		 * 2，注意一下递归的次数
		 * */
		//show();
		//toBin(6);
		System.out.println(getSum(5));
	}

	public static int getSum(int sum) {
		if(sum==1) {
			return 1;
		}
		int i = sum+getSum(sum-1);
		System.out.println(i);
		return i;
	}

	public static void toBin(int num) {
		if(num>0) {
			int n = num%2;
			toBin(num/2);
			System.out.print(n);
		}
	}
	
	public static void show() {
		show();
	}
	
}
