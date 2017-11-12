package day20;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) throws ParseException {
		/* ��ϰ��
		 * "2012-3-17"��"2012-4-6"
		 * �м��ж�����
		 * ˼·��������ת���ɺ��룬�����
		 * ��λ�ȡ����ֵ��ͨ��Date����
		 * ��Ϊʱ�����ַ�����������Ҫ���ַ�������ת��Date����
		 * */
		
		String str1 = "2012-5-1";
		String str2 = "2012-4-6";
		
		//�����ڸ�ʽ���ַ���ת��Date����
		DateFormat df = DateFormat.getDateInstance();//��ȡ�ַ�����ʽ����
		df = new SimpleDateFormat("yyyy-MM-dd");
		Date date1 = df.parse(str1);
		Date date2 = df.parse(str2);
		
		//��ȡʱ��ĺ���ֵ
		long l1 = date1.getTime();
		long l2 = date2.getTime();
		
		//��ȡ����ֵ��ȡ����
		long l3 = Math.abs(l2 - l1);
		
		//������ֵת������
		int day = (int) (l3/1000/60/60/24);
		
		System.out.println(day);
	}

}
