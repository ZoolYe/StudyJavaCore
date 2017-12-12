package day28.regex;

/* ������ʽ�� ��ȷ�Ĺ����ʽ
 * ������ʽ���ڲ����ַ�������
 * ͨ��һЩ�ض��ķ��������ֵ�
 * ��������Ϊ������������ʽ������ҪѧϰһЩ����
 * */
public class RegexDemo {

	public static void main(String[] args) {
		//checkQQ("00");
		//������ʽ��һλ1-9 �ڶ�λ0-9���ң�0-9������Գ���4��14��
		//String regex = "[1-9][0-9]{4,14}";
		
		String str = "ao3b";
		String regex = "ao[1-2]b";
		System.out.println(str.matches(regex));
		
		//checkQQ_2("12345789", regex);
	}

	public static void checkQQ_2(String qq,String regex) {
		if(qq.matches(regex)) {
			System.out.println("QQ��ȷ");
		}
	}
	
	/* ���󣺶���һ�����ܶ�QQ�Ž���У��
	 * Ҫ�󣺳���5~15��ֻ�������֣�0���ܿ�ͷ
	 * */
	public static void checkQQ(String qq) {
		int len = qq.length();
		if(len>=5 && len<=15) {
			if(!qq.startsWith("0")) {
				try{
					long l = Long.parseLong(qq);
				}catch(NumberFormatException nfe){
					System.out.println("QQ��ֻ��������");
				}
					
			}else {
				System.out.println("QQ�Ų�����0��ͷ");
			}
		}else {
			System.out.println("QQ�ų��ȴ���");
		}
	}
	
}
