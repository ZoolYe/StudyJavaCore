package day28;

import java.lang.reflect.Field;

public class ReflectDemo3 {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, SecurityException, InstantiationException, IllegalAccessException {
		getFiedDemo();
	}

	public static void getFiedDemo() throws ClassNotFoundException, NoSuchFieldException, SecurityException, InstantiationException, IllegalAccessException {
		/* 获取字节码文件中的字段
		 * */
		String str_name = "day28.Persion";
		Class clazz = Class.forName(str_name);
		//这个只能拿公有的 不能拿私有的
		//Field field = clazz.getField("age");
		
		//只获取本类，但包含私有
		Field field = clazz.getDeclaredField("age");
		Object obj = clazz.newInstance();
		//对私有字段的访问取消权限检查，暴力访问
		field.setAccessible(true);
		
		field.set(obj, 89);
		Object o = field.get(obj);
		
		System.out.println(o);
	}

}
