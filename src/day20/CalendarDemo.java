package day20;

import java.util.Calendar;

public class CalendarDemo {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		showDay(c);
		showDate(c);
		
	}

	public static void showDay(Calendar c) {
		//设置年月日
		c.set(2012, 11, 12);
		//按年偏移
		c.add(Calendar.YEAR, 5);
		//按月进行偏移
		c.add(Calendar.MONTH, 5);
	}


	public static void showDate(Calendar c) {
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH)+1;
		int day = c.get(Calendar.DAY_OF_MONTH);
		int week = c.get(Calendar.DAY_OF_WEEK);
		System.out.println(year+"年 "+month+"月 "+day+" 星期"+getWeek(week));
	}

	public static String getWeek(int week) {
		String []weeks = {"","星期天","星期一","星期二","星期三","星期四","星期五","星期六",};
		return weeks[week];
	}
	
}
