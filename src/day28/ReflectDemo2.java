package day28;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectDemo2 {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		//createNewObject();
		createNewObject_2();
	}

	public static void createNewObject_2() throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		//day28.Persion persion = new day28.Persion(12,"����");
		/* ��Ҫ��ȡָ�����ƶ�Ӧ���е������ֵĶ���ʱ�����ö����ʼ��ʱ��ʹ�ÿղ������캯��ʱ������β���
		 * ��Ȼ��ͨ��ָ���Ĺ��캯�����г�ʼ��������Ӧ���Ȼ�ȡ���ù��캯����ͨ���ֽ����ļ����󼴿����
		 * �÷����ǣ�getConstructor(paramterTypes);
		 * 
		 * */
		String className = "day28.Persion";
		//��Ѱ���������ļ��������ؽ��ڴ棬������Class����
		Class clazz = Class.forName(className);
		//��ȡ����ָ���Ĺ��캯������
		Constructor constructor = clazz.getConstructor(int.class,String.class);
		//ͨ���ù����������newIntstance�������ж���ĳ�ʼ��
		Object obj = constructor.newInstance(38,"����");
		
	}

	public static void createNewObject() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		//���ڣ�newʱ���ȸ��ݱ�new�����������Ѱ������ֽ����ļ��������ؽ��ڴ棬���������ֽ����ļ����󣬲����Ŵ������ֽ��ļ��Ķ�Ӧ��Person����
		//day28.Persion persion = new day28.Perssion
		
		//���ڣ�
		String className = "day28.Persion";
		//��Ѱ���������ļ��������ؽ��ڴ棬������Class����
		Class clazz = Class.forName(className);
		//��β�������Ķ����أ�
		Object obj = clazz.newInstance();
	}
	
}
