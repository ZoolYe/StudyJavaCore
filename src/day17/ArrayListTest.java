package day17;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(new Persion("lisi1", 20));
		al.add(new Persion("lisi2", 22));
		al.add(new Persion("lisi3", 24));
		al.add(new Persion("lisi4", 23));
		al.add(15);
		
		Iterator it = al.iterator();
		while(it.hasNext()) {
			//System.out.println(((Persion) it.next()).getName());
			Persion p = (Persion) it.next();
			System.out.println(p.getName()+"   "+p.getAge());
		}
	}

}
