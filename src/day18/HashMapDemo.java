package day18;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapDemo {

	public static void main(String[] args) {
		
		//��ѧ�������ѧ��������ͨ����ֵ�洢��Map������
		HashMap<Student, String> hm = new HashMap<Student, String>();
		hm.put(new Student("����",38), "����");
		hm.put(new Student("����",25), "�Ϻ�");
		hm.put(new Student("Сǿ",31), "����");
		hm.put(new Student("����",28), "����");
		hm.put(new Student("����",25), "�人");
		
		//keySet���ص���key���͵�ֵ
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
