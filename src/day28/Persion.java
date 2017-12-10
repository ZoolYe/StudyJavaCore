package day28;

public class Persion {

	private int age;
	private String name;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Persion(int age, String name) {
		super();
		this.age = age;
		this.name = name;
		System.out.println("persion param run  "+this.name+" : "+this.age);
	}
	
	public Persion() {
		super();
		System.out.println("persion run");
	}

	public void show() {
		System.out.println("show: "+this.name+"    "+this.age);
	}
	
	private void method() {
		System.out.println("method:run");
	}
	
	public void paramMethod(String str , int num) {
		System.out.println("paramMethod run   "+str+"     "+num);
	}
	
	public static void staticMethod() {
		System.out.println("staticMethod  run ");
	}
	
}
