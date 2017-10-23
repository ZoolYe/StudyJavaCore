package day16;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		List list = new ArrayList();
		show(list);
	}

	public static void show(List list) {
		//添加元素
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
		list.add("abc4");
		
		//插入元素
		//list.add(1, "abc9");
		
		//删除元素
		//list.remove(2);
		
		//修改元素
		list.set(2, "zool");
		
		//获取元素
		Object str = list.get(0);
		
		//获取子列表
		List l1 = list.subList(1, 3);
		System.out.println(l1);
		
		System.out.println(list);
	}	
}
