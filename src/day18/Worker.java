package day18;

public class Worker extends Persion{
	
	public Worker() {
		super();
	}

	public Worker(String name, int age) {
		super(name, age);
	}

	@Override
	public String toString() {
		return this.getName()+" : "+this.getAge();
	}
	
}
