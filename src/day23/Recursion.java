package day23;

public class Recursion {

	public static void main(String[] args) {
		
		/* �ݹ飺
		 * ��������ֱ�ӻ��߼�ӵĵ��õ�������
		 * ʹ�ã�һ�������ڱ��ظ�ʹ�ã���ÿ��ʹ��ʱ����������Ľ������һ�ε����йأ��Ϳ���ʹ�õݹ�
		 * ע�⣺
		 * 1���ݹ�һ��Ҫ��ȷ��������������ջ���
		 * 2��ע��һ�µݹ�Ĵ���
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
