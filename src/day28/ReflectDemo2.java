package day28;

public class ReflectDemo2 {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		//createNewObject();
		createNewObject_2();
	}

	public static void createNewObject_2() {
		day28.Persion persion = new day28.Persion(12,"张三");
	}

	public static void createNewObject() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		//早期：new时候，先根据被new的类的名称找寻该类的字节码文件，并加载进内存，并创建该字节码文件对象，并接着创建该字节文件的对应的Person对象
		//day28.Persion persion = new day28.Perssion
		
		//现在：
		String className = "day28.Persion";
		//找寻该名称类文件，并加载进内存，并产生Class对象
		Class clazz = Class.forName(className);
		//如何产生该类的对象呢？
		Object obj = clazz.newInstance();
	}
	
}
