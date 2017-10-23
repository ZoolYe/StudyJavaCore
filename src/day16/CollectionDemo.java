package day16;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {

	public static void main(String[] args) {
		//Collection coll = new ArrayList();
		//show(coll);
		Collection c1 = new ArrayList();
		Collection c2 = new ArrayList();
		show(c1, c2);
		
		//��c2�е�Ԫ����ӵ�c1��
		/*System.out.println("c1"+c1);
		c1.addAll(c2);
		System.out.println("c1"+c1);
		System.out.println("c2"+c2);
		//�����������е���ͬԪ�شӵ���removeAll�ļ�����ɾ��
		c1.removeAll(c2);
		System.out.println("c1"+c1);
		System.out.println("c2"+c2);*/
		
		boolean c1ll = c1.contains(c2);
		boolean c2ll = c1.containsAll(c2);
		//System.out.println(c1ll);
		
		//ȡ������������ָ���ļ�����ͬ��Ԫ�أ���ɾ����ͬ��Ԫ��
		//��removeAll�����෴
		c1.retainAll(c2);
		System.out.println(c1);
		
	}

	public static void show(Collection coll) {
		//1�����Ԫ��
		coll.add("abc1");
		coll.add("abc2");
		coll.add("abc3");
		System.out.println(coll);
		
		//2��ɾ��Ԫ��
		coll.remove("abc3");//��ı伯�ϵĳ���
		//coll.removeAll(coll);
		//coll.clear();
		System.out.println(coll);
		System.out.println(coll.contains("abc2"));
		System.out.println(coll.size());
	}
	
	public static void show(Collection c1, Collection c2) {
		
		c1.add("abc1");
		c1.add("abc2");
		c1.add("abc3");
		c1.add("abc4");
		c1.add("abc5");
		c1.add("abc6");
		
		c2.add("abc1");
		c2.add("abc5");
		c2.add("abc6");
	}
	
}
