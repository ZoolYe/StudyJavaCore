package day16;

public class WrapperDemo {

	public static void main(String[] args) {

		/* �����������Ͱ�װ��
		 * Ϊ�˷�����������������ͣ������װ���˶����ڶ����ж��������Ժ���Ϊ�ḻ�˸����ݵĲ���
		 * ���������ö������ͳ�֮Ϊ�����������Ͱ�װ��
		 * byte 	Byte
		 * short	Short
		 * int		Integer
		 * long		Long
		 * float	Float
		 * double	Double
		 * char		Character
		 * boolean	Boolean
		 * 
		 * Integer��װ������Ҫ�û������ͺ��ַ���֮���ת��
		 * ��������--->�ַ���
		 * 		1������������ֵ+""
		 * 		2����String���еľ�̬����valueOf(����������ֵ)
		 * 		3����Integer�ľ�̬����valueOf(����������ֵ)
		 * �ַ���--->������ֵ����
		 * 		1��ʹ�ð�װ���еľ�̬����xxx parseXxx("xxx���͵��ַ���")
		 * 			int parseInt("intstring");
		 * 			long parseLong("longstring");
		 * 			boolean parseBoolean("booleanstring");
		 * 			ֻ��Character��û��parse����
		 * 		2������ַ�����Integer�����˶���ķ�װ
		 * 			����ʹ����һ���Ǿ�̬�ķ�����intValue();
		 * 			��һ��Integer����ת�ɻ�����������
		 * 
		 * */
		/*String age = "20";
		//Integer i = new Integer(age);
		int a = Integer.parseInt(age);
		System.out.println(12+a);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.toBinaryString(-6));
		String s = "123";
		Integer i = new Integer(s);
		System.out.println(i+456);*/
		
		/* �����߱���ͬ�Ľ�������
		 * ʮ����-->>��������
		 * 		toBinaryString
		 * 		toOctalString
		 * 		toHexString
		 * 		toString
		 * ��������-->>ʮ����
		 * 		parseInt
		 * */
		//ʮ����-->>��������
		//��ʮ����ת���ɶ�����
		System.out.println(Integer.toBinaryString(60));
		//��ʮ����ת���ɰ˽���
		System.out.println(Integer.toOctalString(60));
		//��ʮ����ת����ʮ������
		System.out.println(Integer.toHexString(60));
		//������һ�����Ƶ���ת�����������
		System.out.println(Integer.toString(60,16));
		
		//��������-->>ʮ����
		System.out.println(Integer.parseInt("3c",16));
		
		Integer a = new Integer(3);
		Integer b = new Integer("3");
		System.out.println(a.equals(b));
		//�����������������ͬ����0������Ȳ���С����-1���Ȳ����󷵻�1
		System.out.println(a.compareTo(b));
		
		
	}

}
