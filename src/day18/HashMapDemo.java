package day18;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapDemo {

	public static void main(String[] args) {
		
		//将学生对象和学生归属地通过键值存储到Map集合中
		HashMap<Student, String> hm = new HashMap<Student, String>();
		hm.put(new Student("李四",38), "北京");
		hm.put(new Student("赵六",25), "上海");
		hm.put(new Student("小强",31), "沈阳");
		hm.put(new Student("旺财",28), "大连");
		hm.put(new Student("赵六",25), "武汉");
		
		//keySet返回得是key类型的值
		/*Set<Student> keySet = hm.keySet();
		Iterator<Student> it = keySet.iterator();*/
		
		Iterator<Student> it = hm.keySet().iterator();
		
		while(it.hasNext()) {
			Student key = it.next();
			String value = hm.get(key);
			System.out.println(key.getName()+" : "+key.getAge()+"  "+value);
		}
	}

}
