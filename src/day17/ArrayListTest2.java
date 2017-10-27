package day17;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest2 {

	//去除ArrayList集合中的重复元素
	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		/*al.add("abc1");
		al.add("abc2");
		al.add("abc1");
		al.add("abc2");
		al.add("abc3");
		al.add("abc4");*/
		
		al.add(new Persion("lisi1", 21));
		al.add(new Persion("lisi2", 22));
		al.add(new Persion("lisi1", 21));
		al.add(new Persion("lisi2", 22));
		al.add(new Persion("lisi3", 23));
		al.add(new Persion("lisi4", 24));
		
		System.out.println(al.toString());
		al = removeRepeatElement(al);
		System.out.println(al.toString());
	}

	/**
	 * 去除ArrayList集合中重复的元素
	 * 原理：建立一个临时的ArrayList集合，判断集合中是否包含次元素，
	 * 如果包含就不存入，然后将临时集合指向原来的集合
	 * @param 传入一个有重复元素的ArrayList集合
	 * @return 返回去除重复元素后的集合
	 * */
	public static ArrayList removeRepeatElement(ArrayList al) {
		
		//定义一个临时集合，存储原有集合的元素
		ArrayList temp = new ArrayList();
		
		//获取迭代器
		Iterator it = al.iterator();
		
		//循环遍历
		while(it.hasNext()) {
			Object obj = it.next();
			//判断临时集合里面是否包含次元素，如果不包含就添加到临时集合里
			if(!(temp.contains(obj))) {//对于List集合中的contains方法其实依据的是equals方法
				temp.add(obj);
			}
		}
		return temp;//返回临时集合
	}
	
}
