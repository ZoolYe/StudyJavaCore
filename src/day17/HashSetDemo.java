package day17;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add("hiahia");
		hs.add("xixi");
		hs.add("hehe");
		hs.add("haha");
		hs.add("ab");
		hs.add("ba");
		
		System.out.println("ab".hashCode());
		System.out.println("ba".hashCode());
		
		Iterator it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
