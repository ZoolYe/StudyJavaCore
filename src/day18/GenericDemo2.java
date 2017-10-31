package day18;

import java.util.Iterator;
import java.util.TreeSet;

public class GenericDemo2 {

	public static void main(String[] args) {
		TreeSet<Persion> ts = new TreeSet<Persion>(new ComparByName());
		ts.add(new Persion("lisiz",24));
		ts.add(new Persion("lisix",22));
		ts.add(new Persion("lisia",23));
		ts.add(new Persion("lisif",21));
		
		Iterator<Persion> it = ts.iterator();
		while(it.hasNext()){
			Persion p = it.next();
			System.out.println(p.getName()+" :"+p.getAge());
		}
	}

}
