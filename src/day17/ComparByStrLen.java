package day17;

import java.util.Comparator;

public class ComparByStrLen implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		String str1 = (String) o1;
		String str2 = (String) o2;
		
		int temp = str1.length() - str2.length();
		//如果temp等于0，再比较字符串的自然顺序，compare返回的是int性数值，如果不等于0直接返回相减后的结果
		return temp==0?str1.compareTo(str2):temp;
	}

}
