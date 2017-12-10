package day28;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectDemo4 {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		//getMethodDemo();
		//getMethodDemo_2();
		getMethodDemo_3();
	}

	public static void getMethodDemo_3() throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		String str_class = "day28.Persion";
		Class clazz = Class.forName(str_class);
		
		//获取带参数的方法
		Method method = clazz.getMethod("paramMethod", String.class,int.class);
		//通过空参数的构造方法获取对象
		Object obj = clazz.newInstance();
		//运行方法，传入对象，参数
		method.invoke(obj, "小明",29);
	}

	public static void getMethodDemo_2() throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		String str_class = "day28.Persion";
		Class clazz = Class.forName(str_class);
		
		//获取空参数一般方法
		Method method = clazz.getMethod("show",null);
		
		//通过空参的构造函数获取对象
		//Object obj = clazz.newInstance();
		
		//获取指定参数的构造函数
		Constructor constructor = clazz.getConstructor(int.class,String.class);
		//并获取对象，传入参数
		Object obj = constructor.newInstance(12,"哈哈");
		//运行方法
		method.invoke(obj, null);
	}

	/* 获取指定class中的公共函数
	 * */
	public static void getMethodDemo() throws ClassNotFoundException {
		String str_class = "day28.Persion";
		Class clazz = Class.forName(str_class);
		
		//获取的都是公有的方法
		//Method []method = clazz.getMethods();
		
		//获取本类中所有的方法，包括私有的
		Method []method = clazz.getDeclaredMethods();
		
		for(Method me : method) {
			System.out.println(me);
		}
	}

}
