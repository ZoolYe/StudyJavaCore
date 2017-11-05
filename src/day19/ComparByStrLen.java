package day19;

import java.util.Comparator;

public class ComparByStrLen implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		int temp = o1.length() - o2.length();
		return temp==0?o1.compareTo(o2):temp;
	}

}
