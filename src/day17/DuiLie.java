package day17;

import java.util.LinkedList;

public class DuiLie {

	private LinkedList link;
	
	public DuiLie() {
		link = new LinkedList();
	}
	
	//���Ԫ�أ���ӵ�ĩβ��
	public void myAdd(Object obj) {
		link.addLast(obj);
	}
	
	//��ȡ�������Ԫ�أ���ȡ��λ
	public Object myGet() {
		return link.removeFirst();
	}
	
	//�жϼ������Ƿ���Ԫ��
	public boolean isNull() {
		return link.isEmpty();
	}
	
}
