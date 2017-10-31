package day18;

public class GenericDemo3 {

	public static void main(String[] args) {
		/*Tool t = new Tool();
		t.setObject(new Worker());
		Student stu = (Student) t.getObject();*/
		
		Tool<Student> tl = new Tool<Student>();
		tl.setObject(new Student());
	}

}
