package day17;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest2 {

	//ȥ��ArrayList�����е��ظ�Ԫ��
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
	 * ȥ��ArrayList�������ظ���Ԫ��
	 * ԭ������һ����ʱ��ArrayList���ϣ��жϼ������Ƿ������Ԫ�أ�
	 * ��������Ͳ����룬Ȼ����ʱ����ָ��ԭ���ļ���
	 * @param ����һ�����ظ�Ԫ�ص�ArrayList����
	 * @return ����ȥ���ظ�Ԫ�غ�ļ���
	 * */
	public static ArrayList removeRepeatElement(ArrayList al) {
		
		//����һ����ʱ���ϣ��洢ԭ�м��ϵ�Ԫ��
		ArrayList temp = new ArrayList();
		
		//��ȡ������
		Iterator it = al.iterator();
		
		//ѭ������
		while(it.hasNext()) {
			Object obj = it.next();
			//�ж���ʱ���������Ƿ������Ԫ�أ��������������ӵ���ʱ������
			if(!(temp.contains(obj))) {//����List�����е�contains������ʵ���ݵ���equals����
				temp.add(obj);
			}
		}
		return temp;//������ʱ����
	}
	
}
