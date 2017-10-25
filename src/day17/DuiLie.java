package day17;

import java.util.LinkedList;

public class DuiLie {

	private LinkedList link;
	
	public DuiLie() {
		link = new LinkedList();
	}
	
	//添加元素，添加到末尾处
	public void myAdd(Object obj) {
		link.addLast(obj);
	}
	
	//获取集合里的元素，获取首位
	public Object myGet() {
		return link.removeFirst();
	}
	
	//判断集合里是否有元素
	public boolean isNull() {
		return link.isEmpty();
	}
	
}
