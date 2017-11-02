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

	/*? extends Persion 泛型的限定 只接收Persion类型或者Persion子类
		可以对类型进行限定：
		? extends E:接收E类型或者E类型的子类型对象。上限
		? super E:接收E类型或者E的父类型。下限
		一般存元素的时候都使用上限，因为这样取出都是按照上限类型来运算的，不会出现类型安全隐患
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
