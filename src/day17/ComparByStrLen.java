package day17;

import java.util.Comparator;

public class ComparByStrLen implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		String str1 = (String) o1;
		String str2 = (String) o2;
		
		int temp = str1.length() - str2.length();
		//���temp����0���ٱȽ��ַ�������Ȼ˳��compare���ص���int����ֵ�����������0ֱ�ӷ��������Ľ��
		return temp==0?str1.compareTo(str2):temp;
	}

}
