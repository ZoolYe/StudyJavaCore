package day18;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class GenericAdvanceDemo2 {

	public static void main(String[] args) {
		
		ArrayList<Worker> al1 = new ArrayList<Worker>();
		al1.add(new Worker("zhangsan",21));
		al1.add(new Worker("wocao", 11));
		iterCompar(al1);
		
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student("hehe",32));
		al.add(new Student("heihei",13));
		iterCompar(al);
	}

	/*? extends Persion ���͵��޶� ֻ����Persion���ͻ���Persion����
		���Զ����ͽ����޶���
		? extends E:����E���ͻ���E���͵������Ͷ�������
		? super E:����E���ͻ���E�ĸ����͡�����
		һ���Ԫ�ص�ʱ��ʹ�����ޣ���Ϊ����ȡ�����ǰ�����������������ģ�����������Ͱ�ȫ����
	*/
	public static void iterCompar(Collection<? extends Persion> coll) {
		Iterator<? extends Persion> it = coll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next().toString());
		}
	}
	
	/*public static void iterCompar(Collection<String> al) {
		Iterator<String> it = al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}*/
	
}
