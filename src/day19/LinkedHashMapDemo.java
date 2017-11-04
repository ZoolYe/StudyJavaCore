package day19;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new LinkedHashMap<Integer,String>();
		hm.put(7, "����");
		hm.put(3, "����");
		hm.put(1, "ǧ��");
		hm.put(5, "����");
		
		/*Set<Entry<Integer, String>> se = hm.entrySet();
		Iterator<Entry<Integer, String>> it = se.iterator();*/
		
		Iterator<Entry<Integer, String>> it = hm.entrySet().iterator();
		
		while(it.hasNext()) {
			
			Entry<Integer, String> e = it.next();
			
			int key = e.getKey();
			String value = e.getValue();
			
			System.out.println(key+"  "+value);
			
		}
		
	}

}
