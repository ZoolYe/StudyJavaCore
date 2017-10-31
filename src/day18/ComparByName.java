package day18;

import java.util.Comparator;

public class ComparByName implements Comparator<Persion> {

	@Override
	public int compare(Persion o1, Persion o2) {
		int temp = o1.getName().compareTo(o2.getName());
		return temp==0?o1.getAge()-o2.getAge():temp;
	}

}
