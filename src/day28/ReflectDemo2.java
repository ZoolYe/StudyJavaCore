package day28;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectDemo2 {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		//createNewObject();
		createNewObject_2();
	}

	public static void createNewObject_2() throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		//day28.Persion persion = new day28.Persion(12,"张三");
		/* 当要获取指定名称对应类中的所体现的对象时，而该对象初始化时不使用空参数构造函数时，该如何操作
		 * 既然是通过指定的构造函数进行初始化，所以应该先获取到该构造函数，通过字节码文件对象即可完成
		 * 该方法是：getConstructor(paramterTypes);
		 * 
		 * */
		String className = "day28.Persion";
		//找寻该名称类文件，并加载进内存，并产生Class对象
		Class clazz = Class.forName(className);
		//获取到了指定的构造函数对象
		Constructor constructor = clazz.getConstructor(int.class,String.class);
		//通过该构造器对象的newIntstance方法进行对象的初始化
		Object obj = constructor.newInstance(38,"西西");
		
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
