package day19;

public class ParamterDemo {

	public static void main(String[] args) {
		/*int []arr = {2,31,1,5,6};
		System.out.println(add(arr));*/
		
		int sum = newAdd(2,31,1,5,6);
		System.out.println(sum);
	}

	/* �����Ŀɱ����
	 * ��ʵ����һ�����飬���ǽ��յ��������Ԫ��
	 * �Զ�����ЩԪ�ط�װ�����飬���˵����ߵ���д
	 * ע�⣺�ɱ�������ͣ����붨���ڲ����б��β��
	 * */
	public static int newAdd(int... arr) {
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum+=arr[i];
		}
		return sum;
	}
	
	public static int add(int []arr) {
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum+=arr[i];
		}
		return sum;
	}
	
}
