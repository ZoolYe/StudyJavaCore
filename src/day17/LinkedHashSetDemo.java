package day17;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		
		LinkedHashSet hs = new LinkedHashSet();
		hs.add("hiahia");
		hs.add("xixi");
		hs.add("hehe");
		hs.add("haha");
		
		Iterator it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
