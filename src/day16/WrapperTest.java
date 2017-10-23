package day16;

import java.util.Arrays;

/* 对一个字符串中的数值进行从小到大的排序
 * "20 78 9 -7 88 36 29"
 * */

public class WrapperTest {

	public static void main(String[] args) {
		String str = "20 78 9 -7 88 36 29";
		String sn = shortString(str);
		System.out.println(sn);
	}

	public static String shortString(String str) {
		
		//把字符串变成字符串数组
		String [] str_arr = str.split(" ");
		
		//定义一个int数组，长度为字符串数组长度
		int [] int_arr = new int[str_arr.length];
		
		//将字符串数组变成int数组
		for(int i=0; i<str_arr.length; i++) {
			int_arr[i] = Integer.parseInt(str_arr[i]);
		}
		
		//将int数组的内容进行排序
		Arrays.sort(int_arr);
		
		//将int数组变成string
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<int_arr.length; i++) {
			sb.append(int_arr[i]+" ");
		}
		
		return sb.toString();
	}

}
