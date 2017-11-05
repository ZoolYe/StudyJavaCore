package day19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


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
		demo_2(list, new ComparByStrLen());
		System.out.println(list);
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
