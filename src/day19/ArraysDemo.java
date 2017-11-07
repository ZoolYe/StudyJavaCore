package day19;

import java.util.Arrays;
import java.util.List;

public class ArraysDemo {

	public static void main(String[] args) {
		/* Arrays:���Ͽ�ܵĹ����࣬����ķ������Ǿ�̬��
		 * */
		/*int [] arr = {3,2,5,11,9,10};
		System.out.println(myToString(arr));*/
		
		//demo();
		demo2();
		
	}

	public static void demo2() {
		/* ��������е�Ԫ���Ƕ�����ôת�ɼ���ʱ��ֱ�ӽ������е�Ԫ����Ϊ�����е�Ԫ�ؽ��м��ϴ洢
		 * ��������е�Ԫ���ǻ���������ֵ����ô�Ὣ��������Ϊ�����е�Ԫ�ؽ��д洢
		 * */
		int [] arr = {3,2,5,11,9,10};
		String [] str = {"abc","xixi","cba","nba"};
		
		//List list = Arrays.asList(str);
		List<int[]> list = Arrays.asList(arr);
		System.out.println(list);
	}

	public static void demo() {
		/* �ص㣺List asList(����)������ת�ɼ���
		 * �ô�����ʵ����ʹ�ü��ϵķ������������е�Ԫ��
		 * ע�⣺����ĳ����ǹ̶��ģ����Զ��ڼ��ϵ���ɾ����ʱ������ʹ�õķ���ᷢ���쳣
		 * */
		String [] arr = {"abc","xixi","cba","nba"};
		List<String> list = Arrays.asList(arr);
		//list.add("heihei");//UnsupportedOperationException
		list.set(1, "chenmneg");
		System.out.println(list);
	}
	
	public static String myToString(int []arr ) {
		if(arr == null)
			return "null";
		if(arr.length == -1)
			return "{}";
		
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for(int i=0; i<arr.length; i++) {
			sb.append(arr[i]);
			if(i!=arr.length-1)
				sb.append(",");
		}
		sb.append("]");
		return sb.toString();
	}
	
}
