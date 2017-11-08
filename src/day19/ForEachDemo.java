package day19;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ForEachDemo {

	public static void main(String[] args) {
		
		/* foreach语句：
		 * 格式：
		 * for(类型 变量 ：Collection集合|数组)
		 * {
		 * 
		 * }
		 * 传统for和高级for的区别？
		 * 传统for可以完成对语句执行很多次，因为可以定义控制循环的增量和条件
		 * 高级for是一种简化形式，它必须有被遍历的目标，该目标要么是数组，要么是collection单列集合
		 * 对数组的遍历如果仅仅是获取数组中的元素，可以使用高级for
		 * 如果要对数组的角标进行操作，建议使用传统for
		 * */
		List<String> list = new ArrayList<String>();
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
		list.add("abc4");

		//简化书写
		for(String s : list) {
			System.out.println(s);
		}
		
		int [] arr = {3,1,5,6,7};
		for(int i: arr) {
			System.out.println(i);
		}
		
		/*Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}*/
		
		//可以使用高级for遍历map集合吗？不能直接使用，但是可以将map转成单列的set，就可以使用了
		Map<Integer, String> map = new HashMap<Integer,String>();
		map.put(5, "wangwu");
		map.put(6, "zhaoliu");
		map.put(7, "xiaoqiang");
		map.put(3, "zhangsan");
		
		for(Integer key : map.keySet()) {
			String value = map.get(key);
			System.out.println(key+" : "+value);
		}
		
		for(Map.Entry<Integer, String> me : map.entrySet()) {
			Integer key = me.getKey();
			String value = me.getValue();
			System.out.println(key+" - "+value);
		}
		
	}

}
