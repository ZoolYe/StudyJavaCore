package day19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class CollectionsDemo {

	public static void main(String[] args) {
		
		/* Collections:是集合框架的工具类
		 * 里面的方法都是静态的
		 * */
		List<String> list = new ArrayList<String>();
		list.add("abcde");
		list.add("cba");
		list.add("aa");
		list.add("zzz");
		list.add("cba");
		list.add("nba");
		list.add("z");
		//demo_1(list);
		//demo_2(list);
		//Collections.sort(list, new ComparByStrLen());
		demo_2(list, new ComparByStrLen());
		System.out.println(list);
	}

	public static<T extends Comparable<? super T>> void demo_1(List<T> list) {
		
		//对list集合进行指定顺序的排序
		Collections.sort(list);
		System.out.println(list);
	}
	
	public static <T extends Comparable<? super T>> void demo_2(List<T> list, Comparator<T> com) {
		
		//因为ArrayList集合是有序的，可以通过角标来操作元素
		for(int i=0;i<list.size(); i++) {//size获取集合里元素的个数
			
			for(int x=i+1;x<list.size();x++) {
				
				if(com.compare(list.get(i), list.get(x))>0) {
					T temp = list.get(i);
					list.set(i, list.get(x));
					list.set(x, temp);
				}
				
				/*//get返回的是指定角标上的元素，通过字符串的比较方法，获取两个元素的大小
				if(list.get(i).compareTo(list.get(x))>0) {
					//使用临时变量记录较大的值
					T temp = list.get(i);
					//set方法，将指定角标上的元素进行修改
					list.set(i,list.get(x));
					list.set(x, temp);
					//将list集合的i角标元素和x角标元素调换位置
					//Collections.swap(list, i, x);
				}*/
				
			}
			
		}
		
	}
	
	public static <T extends Comparable<? super T>> void demo_2(List<T> list) {
		
		//因为ArrayList集合是有序的，可以通过角标来操作元素
		for(int i=0;i<list.size(); i++) {//size获取集合里元素的个数
			
			for(int x=i+1;x<list.size();x++) {
				//get返回的是指定角标上的元素，通过字符串的比较方法，获取两个元素的大小
				if(list.get(i).compareTo(list.get(x))>0) {
					//使用临时变量记录较大的值
					T temp = list.get(i);
					//set方法，将指定角标上的元素进行修改
					list.set(i,list.get(x));
					list.set(x, temp);
					//将list集合的i角标元素和x角标元素调换位置
					//Collections.swap(list, i, x);
				}
				
			}
			
		}
		
	}
	
}
