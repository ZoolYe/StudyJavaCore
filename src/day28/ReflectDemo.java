package day28;
/* JAVA反射机制是在运行状态中，对任意一个类(class文件)，都能够知道这个类的所有属性和方法
 * 对于任意一个对象，都能够调用他的任意一个方法和属性
 * 这种动态获取的信息以及动态调用对象的方法的功能称为Java语言的反射机制
 * 
 * 动态获取类中的信息，就是Java反射
 * 可以理解为对类的解剖
 * 
 * 要想对字节码文件进行解剖，必须要有字节码文件对象
 * 如何获取字节码文件对象？
 * */
public class ReflectDemo {

	public static void main(String[] args) throws ClassNotFoundException {
		//getClassObject_1();
		//getClassObject_2();
		getClassObject_3();
	}

	


	/* 方式三：
	 * 只要通过给定的类的字符串名称就可以获取该类，更为扩展
	 * 可以用Class类中的方法完成
	 * 该方法就是forName
	 * 这种方式只要有名称即可，更为方便，扩展性更强
	 * */
	public static void getClassObject_3() throws ClassNotFoundException {
		String className = "day28.Persion";
		Class clazz = Class.forName(className);
		System.out.println(clazz);
	}
	
	
	/* 方式二:
	 * 任何数据类型都具备一个静态的属性.class来获取其对应的Class对象
	 * 相对简单，但是还是要明确用到类中的静态成员
	 * 还是不够扩展
	 * */
	public static void getClassObject_2() {
		Class clazz = Persion.class;
		Class clazz1 = Persion.class;
		System.out.println(clazz==clazz1);
	}

	/* 获取字节码对象的方式
	 * 1，Object类中的getClass方法
	 * 想要用这种方式，必须要明确具体的类，并创建对象
	 * 麻烦
	 * */
	
	public static void getClassObject_1() {
		Persion p = new Persion();
		Class clazz = p.getClass();
		
		Persion p1 = new Persion();
		Class clazz1 = p1.getClass();
		
		System.out.println(clazz==clazz1);
	}
	
}
