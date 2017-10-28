package day17;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {

		//对字符串长度进行排序
		TreeSet ts = new TreeSet(new ComparByStrLen());
		ts.add("aaaaa");
		ts.add("zz");
		ts.add("zool");
		ts.add("zool");
		ts.add("nbaq");
		ts.add("dbq");
		
		Iterator it = ts.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
