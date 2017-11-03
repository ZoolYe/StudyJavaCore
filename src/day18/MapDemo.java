package day18;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer, String>();
		//method(map);
		method2(map);
	}

	public static void method2(Map<Integer, String> map) {
		map.put(2, "小强");
		map.put(8, "王武");
		map.put(6, "赵六");
		map.put(3, "李四");
		
		//取出Map中的所有元素
		//原理：通过keySet方法获取Map中的所有的键所在的Set集合，再通过Set的迭代器获取每一个键。
		//再对每一个键获取其对应的值即可
		
		//keySet,创建一个Set集合，将map集合中的key存入到Set集合中，返回值是Set集合
		Set<Integer> keySet = map.keySet();
		Iterator<Integer> it = keySet.iterator();
		while(it.hasNext()) {
			//记录获取到的键
			int key = it.next();
			String value = map.get(key);
			System.out.println(key+" : "+value);
		}
		
	}
	
	// 学号 姓名
	public static void method(Map<Integer, String> map) {

		// 添加元素
		System.out.println(map.put(8, "旺财"));//null
		System.out.println(map.put(8, "小强"));//旺财,存相同键，值会覆盖
		System.out.println(map.put(2, "小明"));
		System.out.println(map.put(6, "赵六"));
		System.out.println(map);
		
		//删除
		System.out.println("remove:"+map.remove(2));
		
		//判断
		System.out.println("containsKey:"+map.containsKey(6));
		
		//获取
		System.out.println("get:"+map.get(1));
		
	}

}
