package day15;

public class StringDemo {

	public static void main(String[] args) {
		
		stringDemo2();
	}

	public static void stringDemo2() {
		
		//���ַ����������д�����"abc"���������ø�ֵ����s
		String s = "abc";
		
		//�ڶ��ڴ��д�����һ��String����
		String s1 = new String("abc");
		
		System.out.println("s:"+s);
		System.out.println("s1:"+s1);
		System.out.println(s==s1);
		
		//String���е�equals��д��Object���е�equals���������Լ��ıȽϷ���
		System.out.println(s.equals(s1));
	}

	/**
	 * ��ʾ�ַ�������ĵ�һ�ַ�ʽ������ȷ�ַ��������ص��ص�
	 * ����û�оʹ����������о�ֱ��ʹ��
	 * String����ص�
	 * �ַ�������һ������ʼ���Ͳ��ᱻ�ı�
	 */
	public static void stringDemo1() {
		String s = "abc";//"abc"�洢���ַ����������У������������û�оʹ���������о�ֱ��ʹ��
		//s = "ndf";
		String s1 = "abc";
		System.out.println(s==s1);
	}

}
