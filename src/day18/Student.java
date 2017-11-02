package day18;

public class Student extends Persion{

	
	
	public Student() {
		super();
	}

	public Student(String name, int age) {
		super(name, age);
	}

	@Override
	public String toString() {
		return this.getName()+" : "+this.getAge();
	}
	
}
