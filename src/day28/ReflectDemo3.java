package day28;

import java.lang.reflect.Field;

public class ReflectDemo3 {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, SecurityException, InstantiationException, IllegalAccessException {
		getFiedDemo();
	}

	public static void getFiedDemo() throws ClassNotFoundException, NoSuchFieldException, SecurityException, InstantiationException, IllegalAccessException {
		/* ��ȡ�ֽ����ļ��е��ֶ�
		 * */
		String str_name = "day28.Persion";
		Class clazz = Class.forName(str_name);
		//���ֻ���ù��е� ������˽�е�
		//Field field = clazz.getField("age");
		
		//ֻ��ȡ���࣬������˽��
		Field field = clazz.getDeclaredField("age");
		Object obj = clazz.newInstance();
		//��˽���ֶεķ���ȡ��Ȩ�޼�飬��������
		field.setAccessible(true);
		
		field.set(obj, 89);
		Object o = field.get(obj);
		
		System.out.println(o);
	}

}
