package day18;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		
		TreeMap<Student, String> tm = new TreeMap<Student, String>(new ComparByEName());
		tm.put(new Student("李四", 38), "北京");
		tm.put(new Student("赵六", 25), "上海");
		tm.put(new Student("小强", 31), "沈阳");
		tm.put(new Student("旺财", 28), "大连");
		//tm.put(new Student("赵六", 25), "武汉");

		//Iterator<Student> it = tm.keySet().iterator();

		Set<Entry<Student, String>> es = tm.entrySet();
		
		Iterator<Entry<Student, String>> it = es.iterator();
		
		//Iterator<Entry<Student, String>> it = tm.entrySet().iterator();
		
		while (it.hasNext()) {
			
			Entry<Student, String> e = it.next();
			Student key = e.getKey();
			String value = e.getValue();
			
			System.out.println(key+value);
			
			/*Entry<Student, String> key = it.next();
			String value = tm.get(key);
			System.out.println(key.getName() + " : " + key.getAge() + "  " + value);*/
		}
	}

}
