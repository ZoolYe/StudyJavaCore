package day28;
/* JAVA���������������״̬�У�������һ����(class�ļ�)�����ܹ�֪���������������Ժͷ���
 * ��������һ�����󣬶��ܹ�������������һ������������
 * ���ֶ�̬��ȡ����Ϣ�Լ���̬���ö���ķ����Ĺ��ܳ�ΪJava���Եķ������
 * 
 * ��̬��ȡ���е���Ϣ������Java����
 * �������Ϊ����Ľ���
 * 
 * Ҫ����ֽ����ļ����н��ʣ�����Ҫ���ֽ����ļ�����
 * ��λ�ȡ�ֽ����ļ�����
 * */
public class ReflectDemo {

	public static void main(String[] args) throws ClassNotFoundException {
		//getClassObject_1();
		//getClassObject_2();
		getClassObject_3();
	}

	


	/* ��ʽ����
	 * ֻҪͨ������������ַ������ƾͿ��Ի�ȡ���࣬��Ϊ��չ
	 * ������Class���еķ������
	 * �÷�������forName
	 * ���ַ�ʽֻҪ�����Ƽ��ɣ���Ϊ���㣬��չ�Ը�ǿ
	 * */
	public static void getClassObject_3() throws ClassNotFoundException {
		String className = "day28.Persion";
		Class clazz = Class.forName(className);
		System.out.println(clazz);
	}
	
	
	/* ��ʽ��:
	 * �κ��������Ͷ��߱�һ����̬������.class����ȡ���Ӧ��Class����
	 * ��Լ򵥣����ǻ���Ҫ��ȷ�õ����еľ�̬��Ա
	 * ���ǲ�����չ
	 * */
	public static void getClassObject_2() {
		Class clazz = Persion.class;
		Class clazz1 = Persion.class;
		System.out.println(clazz==clazz1);
	}

	/* ��ȡ�ֽ������ķ�ʽ
	 * 1��Object���е�getClass����
	 * ��Ҫ�����ַ�ʽ������Ҫ��ȷ������࣬����������
	 * �鷳
	 * */
	
	public static void getClassObject_1() {
		Persion p = new Persion();
		Class clazz = p.getClass();
		
		Persion p1 = new Persion();
		Class clazz1 = p1.getClass();
		
		System.out.println(clazz==clazz1);
	}
	
}
