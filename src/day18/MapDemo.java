package day18;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer, String>();
		// method(map);
		// method2(map);
		//method3(map);
		method4(map);
	}

	public static void method4(Map<Integer, String> map) {
		
		map.put(2, "Сǿ");
		map.put(8, "����");
		map.put(6, "����");
		map.put(3, "����");
		
		//��map�����е�value���뵽Collection������
		Collection<String> values = map.values();
		
		Iterator<String> it = values.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		//System.out.println(values);
	}

	public static void method3(Map<Integer, String> map) {

		map.put(2, "Сǿ");
		map.put(8, "����");
		map.put(6, "����");
		map.put(3, "����");

		/*
		 * ͨ��Mapת��Set���ϾͿ��Ե��� �ҵ���һ��������entrySet��
		 * �÷���������ֵ��ӳ���ϵ��Ϊ����洢����Set�����У������ӳ���ϵ�����;���Map.Entry����(���֤)
		 */
		Set<Map.Entry<Integer, String>> entrySet = map.entrySet();

		Iterator<Entry<Integer, String>> it = entrySet.iterator();

		while (it.hasNext()) {
			// next���ص����ͺͶ���ʱ��һ�£�Map.Entry
			Map.Entry<Integer, String> me = it.next();

			int key = me.getKey();
			String value = me.getValue();

			System.out.println(key + " : " + value);
			System.out.println(map.get(key));
		}

	}

	public static void method2(Map<Integer, String> map) {
		map.put(2, "Сǿ");
		map.put(8, "����");
		map.put(6, "����");
		map.put(3, "����");

		// ȡ��Map�е�����Ԫ��
		// ԭ��ͨ��keySet������ȡMap�е����еļ����ڵ�Set���ϣ���ͨ��Set�ĵ�������ȡÿһ������
		// �ٶ�ÿһ������ȡ���Ӧ��ֵ����

		// keySet,����һ��Set���ϣ���map�����е�key���뵽Set�����У�����ֵ��Set����
		Set<Integer> keySet = map.keySet();
		Iterator<Integer> it = keySet.iterator();
		while (it.hasNext()) {
			// ��¼��ȡ���ļ�
			int key = it.next();
			String value = map.get(key);
			System.out.println(key + " : " + value);
		}

	}

	// ѧ�� ����
	public static void method(Map<Integer, String> map) {

		// ���Ԫ��
		System.out.println(map.put(8, "����"));// null
		System.out.println(map.put(8, "Сǿ"));// ����,����ͬ����ֵ�Ḳ��
		System.out.println(map.put(2, "С��"));
		System.out.println(map.put(6, "����"));
		System.out.println(map);

		// ɾ��
		System.out.println("remove:" + map.remove(2));

		// �ж�
		System.out.println("containsKey:" + map.containsKey(6));

		// ��ȡ
		System.out.println("get:" + map.get(1));

	}

}
