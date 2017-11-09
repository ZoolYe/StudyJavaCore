package day20;

import java.util.Properties;
import java.util.Set;

public class SystemDemo {

	public static void main(String[] args) {
		
		/* System:���еķ��������Զ��Ǿ�̬��
		 * ����������
		 * long currentTimeMillis();��ȡ��ǰʱ��ĺ���ֵ��1970��1��1�� ��ȥ��ǰ�ģ����ڵĺ���ֵ
		 * */
		long ll = System.currentTimeMillis();
		//System.out.println(ll);
		
		//��ϵͳ����һЩ������Ϣ����Щ��Ϣ��ȫ�ֵģ��������򶼿���ʹ��
		System.setProperty("user.home", "zoology");
		demo();
		//��ȡ��ǰϵͳ�Ļس���
		//System.out.println("hello"+System.getProperty("line.separator")+"word");
		
	}

	public static void demo() {
	
		//��ȡϵͳ��������Ϣ�����洢����Properties������,���������Map���ϵ�����
		Properties prop = System.getProperties();
		
		/* Properties�����д洢����String���͵ļ���ֵ
		 * ���ʹ�����Լ��Ĵ洢��ȡ���ķ����������Ԫ�صĲ���
		 * */
		
		//��Properties�����еļ�ת����Set����
		Set<String> keySet = prop.stringPropertyNames();
		
		for(String key : keySet) {
			String value = prop.getProperty(key);
			System.out.println(key+"---"+value);
		}
		
	}
	
}
