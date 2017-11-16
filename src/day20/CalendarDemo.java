package day20;

import java.util.Calendar;

public class CalendarDemo {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		showDay(c);
		showDate(c);
		
	}

	public static void showDay(Calendar c) {
		//����������
		c.set(2012, 11, 12);
		//����ƫ��
		c.add(Calendar.YEAR, 5);
		//���½���ƫ��
		c.add(Calendar.MONTH, 5);
	}


	public static void showDate(Calendar c) {
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH)+1;
		int day = c.get(Calendar.DAY_OF_MONTH);
		int week = c.get(Calendar.DAY_OF_WEEK);
		System.out.println(year+"�� "+month+"�� "+day+" ����"+getWeek(week));
	}

	public static String getWeek(int week) {
		String []weeks = {"","������","����һ","���ڶ�","������","������","������","������",};
		return weeks[week];
	}
	
}
