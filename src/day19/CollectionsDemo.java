package day19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

import day18.ComparByEName;


public class CollectionsDemo {

	public static void main(String[] args) {
		
		/* Collections:�Ǽ��Ͽ�ܵĹ�����
		 * ����ķ������Ǿ�̬��
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
		//demo_2(list, new ComparByStrLen());
		//System.out.println(list);
		//demo_2();
		//demo_3();
		System.out.println(list);
		//�������е�Ԫ��ȫ���滻��ָ������Ԫ��
		//Collections.fill(list, "woaini");
		Collections.shuffle(list);
		System.out.println(list);
	}

	public static void demo_3() {
		
		/*TreeSet<String> ts = new TreeSet<String>(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				int temp = o2.compareTo(o1);
				return temp;
			}
		});*/
		
		//Collections.reverseOrder()���߱�����Ȼ˳�������Ԫ�ؽ�����ת
		//TreeSet<String> ts = new TreeSet<String>(Collections.reverseOrder());
		
		TreeSet<String> ts = new TreeSet<String>(Collections.reverseOrder(new ComparByStrLen()));
		ts.add("abc");
		ts.add("hahaha");
		ts.add("zzz");
		ts.add("aa");
		ts.add("cba");
		System.out.println(ts);
	}
	
	public static void demo_2() {
		
		List<String> list = new ArrayList<String>();
		list.add("abcde");
		list.add("cba");
		list.add("aa");
		list.add("zzz");
		list.add("cba");
		list.add("nba");
		list.add("z");
		//Collections.sort(list);
		System.out.println(list);
		
		//int index = Collections.binarySearch(list, "z");
		//System.out.println(index);
		
		String str = Collections.max(list,new ComparByStrLen());
		System.out.println(str);
	}
	
	public static<T extends Comparable<? super T>> void demo_1(List<T> list) {
		
		//��list���Ͻ���ָ��˳�������
		Collections.sort(list);
		System.out.println(list);
	}
	
	public static <T extends Comparable<? super T>> void demo_2(List<T> list, Comparator<T> com) {
		
		//��ΪArrayList����������ģ�����ͨ���Ǳ�������Ԫ��
		for(int i=0;i<list.size(); i++) {//size��ȡ������Ԫ�صĸ���
			
			for(int x=i+1;x<list.size();x++) {
				
				if(com.compare(list.get(i), list.get(x))>0) {
					T temp = list.get(i);
					list.set(i, list.get(x));
					list.set(x, temp);
				}
				
				/*//get���ص���ָ���Ǳ��ϵ�Ԫ�أ�ͨ���ַ����ıȽϷ�������ȡ����Ԫ�صĴ�С
				if(list.get(i).compareTo(list.get(x))>0) {
					//ʹ����ʱ������¼�ϴ��ֵ
					T temp = list.get(i);
					//set��������ָ���Ǳ��ϵ�Ԫ�ؽ����޸�
					list.set(i,list.get(x));
					list.set(x, temp);
					//��list���ϵ�i�Ǳ�Ԫ�غ�x�Ǳ�Ԫ�ص���λ��
					//Collections.swap(list, i, x);
				}*/
				
			}
			
		}
		
	}
	
	public static <T extends Comparable<? super T>> void demo_2(List<T> list) {
		
		//��ΪArrayList����������ģ�����ͨ���Ǳ�������Ԫ��
		for(int i=0;i<list.size(); i++) {//size��ȡ������Ԫ�صĸ���
			
			for(int x=i+1;x<list.size();x++) {
				//get���ص���ָ���Ǳ��ϵ�Ԫ�أ�ͨ���ַ����ıȽϷ�������ȡ����Ԫ�صĴ�С
				if(list.get(i).compareTo(list.get(x))>0) {
					//ʹ����ʱ������¼�ϴ��ֵ
					T temp = list.get(i);
					//set��������ָ���Ǳ��ϵ�Ԫ�ؽ����޸�
					list.set(i,list.get(x));
					list.set(x, temp);
					//��list���ϵ�i�Ǳ�Ԫ�غ�x�Ǳ�Ԫ�ص���λ��
					//Collections.swap(list, i, x);
				}
				
			}
			
		}
		
	}
	
}
