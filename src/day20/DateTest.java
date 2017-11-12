package day20;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) throws ParseException {
		/* 练习：
		 * "2012-3-17"到"2012-4-6"
		 * 中间有多少天
		 * 思路：将日期转换成毫秒，再相减
		 * 如何获取毫秒值：通过Date对象
		 * 因为时间是字符串对象，所以要将字符串对象转成Date对象
		 * */
		
		String str1 = "2012-5-1";
		String str2 = "2012-4-6";
		
		//将日期格式的字符串转成Date对象
		DateFormat df = DateFormat.getDateInstance();//获取字符串格式工厂
		df = new SimpleDateFormat("yyyy-MM-dd");
		Date date1 = df.parse(str1);
		Date date2 = df.parse(str2);
		
		//获取时间的毫秒值
		long l1 = date1.getTime();
		long l2 = date2.getTime();
		
		//获取绝对值，取正数
		long l3 = Math.abs(l2 - l1);
		
		//将毫秒值转成天数
		int day = (int) (l3/1000/60/60/24);
		
		System.out.println(day);
	}

}
