package day17;

public class Persion implements Comparable {
	
	private String name;
	private int age;
	
	public Persion(String name, int age) {
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
	
	@Override
	public int hashCode() {
		return this.name.hashCode()+age*27;
	}
	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(!(obj instanceof Persion))
			throw new ClassCastException("类型错误");
		Persion p = (Persion)obj;
		return this.name.equals(p.name) && this.age == p.age;
	}
	@Override
	public String toString() {
		return this.name+"  "+this.age;
	}
	@Override
	public int compareTo(Object o) {
		Persion p = (Persion) o;
		
		//优先按照年龄返回比较的数值
		int temp = this.age - p.age;
		return temp==0?this.name.compareTo(p.name):temp;
		
		//优先按照姓名返回比较的数值
		/*int temp = this.name.compareTo(p.name);
		return temp==0?this.age-p.age:temp;*/
		
		/*if(this.age > p.age )
			return 1;
		if(this.age < p.age)
			return -1;
		return this.name.compareTo(p.name);*/
	}
	
	
	
}
