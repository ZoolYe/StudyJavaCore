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
		map.put(2, "Сǿ");
		map.put(8, "����");
		map.put(6, "����");
		map.put(3, "����");
		
		//ȡ��Map�е�����Ԫ��
		//ԭ��ͨ��keySet������ȡMap�е����еļ����ڵ�Set���ϣ���ͨ��Set�ĵ�������ȡÿһ������
		//�ٶ�ÿһ������ȡ���Ӧ��ֵ����
		
		//keySet,����һ��Set���ϣ���map�����е�key���뵽Set�����У�����ֵ��Set����
		Set<Integer> keySet = map.keySet();
		Iterator<Integer> it = keySet.iterator();
		while(it.hasNext()) {
			//��¼��ȡ���ļ�
			int key = it.next();
			String value = map.get(key);
			System.out.println(key+" : "+value);
		}
		
	}
	
	// ѧ�� ����
	public static void method(Map<Integer, String> map) {

		// ���Ԫ��
		System.out.println(map.put(8, "����"));//null
		System.out.println(map.put(8, "Сǿ"));//����,����ͬ����ֵ�Ḳ��
		System.out.println(map.put(2, "С��"));
		System.out.println(map.put(6, "����"));
		System.out.println(map);
		
		//ɾ��
		System.out.println("remove:"+map.remove(2));
		
		//�ж�
		System.out.println("containsKey:"+map.containsKey(6));
		
		//��ȡ
		System.out.println("get:"+map.get(1));
		
	}

}
