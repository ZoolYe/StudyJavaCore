package day28;

public class ReflectDemo2 {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		//createNewObject();
		createNewObject_2();
	}

	public static void createNewObject_2() {
		day28.Persion persion = new day28.Persion(12,"����");
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
