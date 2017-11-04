package day18;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		
		TreeMap<Student, String> tm = new TreeMap<Student, String>(new ComparByEName());
		tm.put(new Student("����", 38), "����");
		tm.put(new Student("����", 25), "�Ϻ�");
		tm.put(new Student("Сǿ", 31), "����");
		tm.put(new Student("����", 28), "����");
		//tm.put(new Student("����", 25), "�人");

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
