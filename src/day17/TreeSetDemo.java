package day17;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		//demo1();
		demo2();
		
	}

	public static void demo2() {
		TreeSet ts = new TreeSet(new ComparByName());
		ts.add(new Persion("zhangsan", 28));
		ts.add(new Persion("lisi", 21));
		ts.add(new Persion("zhouqi", 29));
		ts.add(new Persion("zhaoliu", 25));
		ts.add(new Persion("wangwu", 29));
		
		Iterator it = ts.iterator();
		while(it.hasNext()) {
			Persion p = (Persion)it.next();
			System.out.println(p.getName()+" : "+p.getAge());
		}
		
	}

	public static void demo1() {
		TreeSet ts = new TreeSet();
		ts.add("abc");
		ts.add("aa");
		ts.add("zaa");
		ts.add("nba");
		ts.add("cba");
		
		Iterator it = ts.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
