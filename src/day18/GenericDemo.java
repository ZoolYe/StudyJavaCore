package day18;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericDemo {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("abc");
		al.add("bc");
		
		Iterator<String> it = al.iterator();
		
		while(it.hasNext()) {
			String str = it.next();
			System.out.println(str);
		}
	}
	
}
