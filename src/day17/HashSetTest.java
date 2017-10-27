package day17;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args) {
		
		/* HashSet�������ݽṹ�ǹ�ϣ�����Դ洢Ԫ�ص�ʱ��ʹ�õ�Ԫ�ص�hashCode������ȷ��λ��
		 * ���λ����ͬ����ͨ��Ԫ�ص�equals��ȷ���Ƿ���ͬ
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
