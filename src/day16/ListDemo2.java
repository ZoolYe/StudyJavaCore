package day16;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo2 {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
		list.add("abc4");
		
		//��ȡ�б����������,������ʵ���ڵ��������У���Ԫ�ؽ�����ɾ�Ĳ飬ֻ��List���Ͼ߱��õ�������
		ListIterator listit = list.listIterator();
		while(listit.hasNext()) {
			System.out.println(listit.next());
		}
		
		while(listit.hasPrevious()) {
			System.out.println(listit.previous());
		}
		
		
		
		/*while(listit.hasNext()) {
			Object obj = listit.next();
			if(obj.equals("abc2")) {
				listit.add("abc9");
			} 
			else {
				System.out.println(obj);
			}
		}
		System.out.println("next:"+listit.hasNext());
		System.out.println("p:"+listit.hasPrevious());
		System.out.println(list);*/
		
		/*Iterator it = list.iterator();
		while(it.hasNext()) {
			Object obj = it.next();
			if(obj.equals("abc2")) {
				//�ڵ��������в�Ҫʹ�ü��ϲ���Ԫ�أ����׳����쳣������ʹ��
				//Iterator�ӿڵ��ӽӿ�ListIteraotr����ɣ��ڵ��������ж�Ԫ�صĲ���
				list.add("abc9");
			}else {
				System.out.println(obj);
			}
			System.out.println(list);
		}*/
		
		
		//show(list);
	}

	public static void show(List list) {
		
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
		list.add("abc4");
		
		Iterator it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//list���е�ȡ��Ԫ��֮һ
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
	}

}
