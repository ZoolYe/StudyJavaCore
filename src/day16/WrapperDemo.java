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
		 * �ַ���--->������ֵ����
		 * 		1��ʹ�ð�װ���еľ�̬����xxx parseXxx("xxx���͵��ַ���")
		 * 			int parseInt("intstring");
		 * 			long parseLong("longstring");
		 * 			boolean parseBoolean("booleanstring");
		 * 			ֻ��Character��û��parse����
		 * 
		 * */
		String age = "20";
		//Integer i = new Integer(age);
		int a = Integer.parseInt(age);
		System.out.println(12+a);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.toBinaryString(-6));
		
	}

}
