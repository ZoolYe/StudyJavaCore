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
		
		//将c2中的元素添加到c1中
		/*System.out.println("c1"+c1);
		c1.addAll(c2);
		System.out.println("c1"+c1);
		System.out.println("c2"+c2);
		//将两个集合中的相同元素从调用removeAll的集合中删除
		c1.removeAll(c2);
		System.out.println("c1"+c1);
		System.out.println("c2"+c2);*/
		
		boolean c1ll = c1.contains(c2);
		boolean c2ll = c1.containsAll(c2);
		//System.out.println(c1ll);
		
		//取交集，保留和指定的集合相同的元素，而删除不同的元素
		//和removeAll功能相反
		c1.retainAll(c2);
		System.out.println(c1);
		
	}

	public static void show(Collection coll) {
		//1，添加元素
		coll.add("abc1");
		coll.add("abc2");
		coll.add("abc3");
		System.out.println(coll);
		
		//2，删除元素
		coll.remove("abc3");//会改变集合的长度
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
