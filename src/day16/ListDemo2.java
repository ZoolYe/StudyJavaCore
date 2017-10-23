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
		
		//获取列表迭代器对象,它可以实现在迭代过程中，对元素进行增删改查，只有List集合具备该迭代功能
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
				//在迭代过程中不要使用集合操作元素，容易出现异常，可以使用
				//Iterator接口的子接口ListIteraotr来完成，在迭代过程中对元素的操作
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
		
		//list特有的取出元素之一
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
	}

}
