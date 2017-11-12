package day20;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) throws ParseException {
		//methodDemo_2();
		methodDemo_3();
	}

	public static void methodDemo_3() throws ParseException {
		
		/* �����ڸ�ʽ���ַ���-->>���ڶ���
		 * ʹ�õ���DateFormat���е�
		 * */
		String data = "1995.5.16";
		//��ȡ���ڸ�ʽ��������
		DateFormat dateFormat = DateFormat.getDateInstance();
		//ͨ��DateFormat�������SimpleDateFormat������������ʾ�ĸ�ʽ���Ա�����ʶ���ض��ĸ�ʽ
		dateFormat = new SimpleDateFormat("yyyyy.MM.dd");
		//��ͨ�����ڸ�ʽ������������ת����Date����
		Date date = dateFormat.parse(data);
		System.out.println(date);
	}

	
	public static void methodDemo_2() {
		
		/* �����ڶ�����и�ʽ��
		 * �����ڶ���->>���ڸ�ʽ���ַ���
		 * ʹ�õ���DateFormat���е�fromat����
		 * */
		
		//���ʹ���Զ���������ʾʱ������
		SimpleDateFormat sdm = new SimpleDateFormat("yyyy���mm���dd");
		
		//��ȡʱ�����
		Date date = new Date();
		
		//��ȡ���ڸ�ʽ���󣬾߱���Ĭ�Ϸ��FULL LONG�ȿ���ָ�����
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.FULL,DateFormat.MEDIUM);
		//DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL);
		
		System.out.println(sdm.format(date));
		
		//ͨ�����ڸ�ʽ��������Date����ת���������ַ���
		//String dataStr = dateFormat.format(date);
		//System.out.println(dataStr);
	}
	
	public static void methodDemo_1() {

		// ���ص�ǰʱ��ĺ���ֵ
		long time = System.currentTimeMillis();// 1510491238050

		// ����ǰ���ں�ʱ���װ��Date����
		Date date = new Date();

		// ��ָ������ֵ��װ��Date����
		Date date2 = new Date(1510491238050l);

		System.out.println(date);
		System.out.println(date2);

		/*
		 * ���ڶ���ͺ���ֵ֮���ת�� ����ֵ->>���ڶ��� 1������ͨ��Date����Ĺ��췽��new Date(timeMillis);
		 * 2��������ͨ��setTime���� ��Ϊ����ͨ��Date����ķ����Ը����ڵĸ����ֶ�(������)���в���
		 * 
		 * ���ڶ���->>����ֵ 1��getTmie() ��Ϊ����ͨ���������ֵ��������
		 */

		// �������Ƿ���ָ������֮��
		System.out.println(date2.after(date));

		// �������Ƿ���ָ������֮ǰ
		System.out.println(date2.before(date));

		System.out.println(date2.compareTo(date));
		System.out.println(date2.toString());
	}

}
