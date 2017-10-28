package day17;

import java.util.Comparator;

public class ComparByName implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Persion p1 = (Persion) o1;
		Persion p2 = (Persion) o2;
		int temp = p1.getName().compareTo(p2.getName());
		return temp==0?p1.getAge()-p2.getAge():temp;
		
	}

}
