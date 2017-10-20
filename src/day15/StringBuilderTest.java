package day15;

public class StringBuilderTest {

	public static void main(String[] args) {
		int []arr = new int[]{12,65,80,22,76,123,86,8};
		//String s = arrayToString(arr);
		String s = arrayToString2(arr);
		System.out.println(s);
	}

	//��һ��int�������ַ���
	public static String arrayToString(int []arr) {
		String str = null;
		for(int i=0;  i<arr.length; i++) {
			//������ʹ�����ַ�������Ϊû���һ�����ַ����������оͻ����һ���µ��ַ�������
			str += Integer.toString(arr[i]);
		}
		return str;
	}
	
	public static String arrayToString2(int []arr) {
		//����һ���ַ���������
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			sb.append(arr[i]);
		}
		return sb.toString();
	}
}
