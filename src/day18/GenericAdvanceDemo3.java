package day18;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class GenericAdvanceDemo3 {

	public static void main(String[] args) {
		
		TreeSet<Persion> tsp = new TreeSet<Persion>(new ComparByEName());
		tsp.add(new Persion("zhangsan2", 21));
		tsp.add(new Persion("zhangsan6", 19));
		tsp.add(new Persion("zhangsan1", 22));
		
		TreeSet<Student> tss = new TreeSet<Student>(new ComparByEName());
		tss.add(new Student("woaini11", 39));
		tss.add(new Student("woaini12", 32));
		tss.add(new Student("woaini16", 31));
		
		iterCompar(tsp);
		iterCompar(tss);
	}
	
	public static void iterCompar(Collection<? extends Persion> coll) {
		Iterator<? extends Persion> it = coll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next().toString());
		}
	}
	
}