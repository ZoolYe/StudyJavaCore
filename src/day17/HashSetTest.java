package day17;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args) {
		
		/* HashSet集合数据结构是哈希表，所以存储元素的时候，使用的元素的hashCode方法来确定位置
		 * 如果位置相同，再通过元素的equals来确定是否相同
		 * */
		
		HashSet hs = new HashSet();
		hs.add(new Persion("lisi4", 25));
		hs.add(new Persion("lisi1", 21));
		hs.add(new Persion("lisi9", 28));
		hs.add(new Persion("lisi6", 26));
		hs.add(new Persion("lisi6", 26));
		
		Iterator it = hs.iterator();
		while(it.hasNext()) {
			Persion p = (Persion)it.next();
			System.out.println(p.getName()+"   "+p.getAge());
		}
	}

}
