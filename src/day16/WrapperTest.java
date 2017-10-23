package day16;

import java.util.Arrays;

/* ��һ���ַ����е���ֵ���д�С���������
 * "20 78 9 -7 88 36 29"
 * */

public class WrapperTest {

	public static void main(String[] args) {
		String str = "20 78 9 -7 88 36 29";
		String sn = shortString(str);
		System.out.println(sn);
	}

	public static String shortString(String str) {
		
		//���ַ�������ַ�������
		String [] str_arr = str.split(" ");
		
		//����һ��int���飬����Ϊ�ַ������鳤��
		int [] int_arr = new int[str_arr.length];
		
		//���ַ���������int����
		for(int i=0; i<str_arr.length; i++) {
			int_arr[i] = Integer.parseInt(str_arr[i]);
		}
		
		//��int��������ݽ�������
		Arrays.sort(int_arr);
		
		//��int������string
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<int_arr.length; i++) {
			sb.append(int_arr[i]+" ");
		}
		
		return sb.toString();
	}

}
