package day18;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class GenericAdvanceDemo {

	public static void main(String[] args) {
		
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("abc");
		al1.add("cda");
		al1.add("hehe");
		
		
		ArrayList<String> al2 = new ArrayList<String>();
		al1.add("abc2");
		al1.add("cda2");
		al1.add("hehe2");
		
		iterCompar(al2);
		iterCompar(al1);
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("wocao");
		iterCompar(hs);
		
		HashSet<Integer> hs2 = new HashSet<Integer>();
		hs2.add(56);
		hs2.add(1);
		hs2.add(6);
		
		iterCompar(hs2);
		
	}

	public static void iterCompar(Collection<?> coll) {
		Iterator<?> it = coll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	/*public static void iterCompar(Collection<String> al) {
		Iterator<String> it = al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}*/
	
}
