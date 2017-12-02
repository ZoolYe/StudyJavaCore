package day24;

import java.io.Serializable;
/* Serializable:用于给被序列化的类加入ID号
 * 用于判断类和对象是否是同一版本
 * */
public class Persion implements Serializable/*标记接口*/{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//transient，非静态数据不想被序列化可以使用这个关键字 修饰
	public transient String name;
	private static int age;
	
	public Persion(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
