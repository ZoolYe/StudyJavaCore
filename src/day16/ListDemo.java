package day16;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		List list = new ArrayList();
		show(list);
	}

	public static void show(List list) {
		//���Ԫ��
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
		list.add("abc4");
		
		//����Ԫ��
		//list.add(1, "abc9");
		
		//ɾ��Ԫ��
		//list.remove(2);
		
		//�޸�Ԫ��
		list.set(2, "zool");
		
		//��ȡԪ��
		Object str = list.get(0);
		
		//��ȡ���б�
		List l1 = list.subList(1, 3);
		System.out.println(l1);
		
		System.out.println(list);
	}	
}
