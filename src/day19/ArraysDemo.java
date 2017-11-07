package day19;

import java.util.Arrays;
import java.util.List;

public class ArraysDemo {

	public static void main(String[] args) {
		/* Arrays:集合框架的工具类，里面的方法都是静态的
		 * */
		/*int [] arr = {3,2,5,11,9,10};
		System.out.println(myToString(arr));*/
		
		//demo();
		demo2();
		
	}

	public static void demo2() {
		/* 如果数组中的元素是对象，那么转成集合时，直接将数组中的元素作为集合中的元素进行集合存储
		 * 如果数组中的元素是基本类型数值，那么会将该数组作为集合中的元素进行存储
		 * */
		int [] arr = {3,2,5,11,9,10};
		String [] str = {"abc","xixi","cba","nba"};
		
		//List list = Arrays.asList(str);
		List<int[]> list = Arrays.asList(arr);
		System.out.println(list);
	}

	public static void demo() {
		/* 重点：List asList(数组)将数组转成集合
		 * 好处：其实可以使用集合的方法操作数组中的元素
		 * 注意：数组的长度是固定的，所以对于集合的增删方法时不可以使用的否则会发生异常
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
