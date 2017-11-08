package day19;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ForEachDemo {

	public static void main(String[] args) {
		
		/* foreach��䣺
		 * ��ʽ��
		 * for(���� ���� ��Collection����|����)
		 * {
		 * 
		 * }
		 * ��ͳfor�͸߼�for������
		 * ��ͳfor������ɶ����ִ�кܶ�Σ���Ϊ���Զ������ѭ��������������
		 * �߼�for��һ�ּ���ʽ���������б�������Ŀ�꣬��Ŀ��Ҫô�����飬Ҫô��collection���м���
		 * ������ı�����������ǻ�ȡ�����е�Ԫ�أ�����ʹ�ø߼�for
		 * ���Ҫ������ĽǱ���в���������ʹ�ô�ͳfor
		 * */
		List<String> list = new ArrayList<String>();
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
		list.add("abc4");

		//����д
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
		
		//����ʹ�ø߼�for����map�����𣿲���ֱ��ʹ�ã����ǿ��Խ�mapת�ɵ��е�set���Ϳ���ʹ����
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
