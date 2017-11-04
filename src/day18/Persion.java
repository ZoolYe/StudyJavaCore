package day18;

public class Persion implements Comparable<Persion>{

	private int age;
	private String name;

	public Persion() {
		super();
	}

	public Persion(String name, int age) {
		super();
		this.age = age;
		this.name = name;
	}

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

	@Override
	public String toString() {
		return "Persion: "+getName()+"  "+getAge();
	}

	@Override
	public int compareTo(Persion p) {
		//Persion per = p;
		
		//按姓名进行排序
		/*int temp = this.name.compareTo(p.name);
		return temp ==0?this.age - p.age:temp;*/
		
		//按年龄进行排序
		int temp = this.age - p.age;
		return temp==0?this.name.compareTo(p.name):temp;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persion other = (Persion) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
