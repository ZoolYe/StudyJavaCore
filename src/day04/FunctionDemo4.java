package day04;

public class FunctionDemo4 {

	public static void main(String[] args) {

		//printMultiplicationTable(7);
		print99();
	}

	/* ����������
	 * 1��ͬһ����
	 * 2��ͬ��
	 * 3������������ͬor�������Ͳ�ͬ
	 * 4�����������غͷ���ֵ�����޹�
	 * 5��Java���Ͻ������ԣ�����������ֲ�ȷ���ԣ������ʧ��
	 * */
	
	//�ӷ����㣬���������ĺ�
	public static int add(int a, int b) {
		return a+b;
	}
	
	//�ӷ����㣬����С���ĺ�
	public static double add(double a, double b) {
		return a+b;
	}
	
	//�ӷ����㣬���������ĺ�
	public static int add(int a, int b, int c) {
		return add(a, b)+c;
	}
	
	//��ӡ�˷���
	
	public static void printMultiplicationTable(int a) {
		
		for(int i=1; i<=a; i++) {
			
			for(int x=1; x<=i; x++) {
				System.out.print(x+"x"+i+"="+x*i+"\t");
			}
			System.out.println();
		}
		
	}
	
	public static void print99() {
		printMultiplicationTable(9);
	}
	
}
