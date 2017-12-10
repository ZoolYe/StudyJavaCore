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
		
		//��ȡ�������ķ���
		Method method = clazz.getMethod("paramMethod", String.class,int.class);
		//ͨ���ղ����Ĺ��췽����ȡ����
		Object obj = clazz.newInstance();
		//���з�����������󣬲���
		method.invoke(obj, "С��",29);
	}

	public static void getMethodDemo_2() throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		String str_class = "day28.Persion";
		Class clazz = Class.forName(str_class);
		
		//��ȡ�ղ���һ�㷽��
		Method method = clazz.getMethod("show",null);
		
		//ͨ���ղεĹ��캯����ȡ����
		//Object obj = clazz.newInstance();
		
		//��ȡָ�������Ĺ��캯��
		Constructor constructor = clazz.getConstructor(int.class,String.class);
		//����ȡ���󣬴������
		Object obj = constructor.newInstance(12,"����");
		//���з���
		method.invoke(obj, null);
	}

	/* ��ȡָ��class�еĹ�������
	 * */
	public static void getMethodDemo() throws ClassNotFoundException {
		String str_class = "day28.Persion";
		Class clazz = Class.forName(str_class);
		
		//��ȡ�Ķ��ǹ��еķ���
		//Method []method = clazz.getMethods();
		
		//��ȡ���������еķ���������˽�е�
		Method []method = clazz.getDeclaredMethods();
		
		for(Method me : method) {
			System.out.println(me);
		}
	}

}
