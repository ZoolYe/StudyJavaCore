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
		
		/* 将日期格式的字符串-->>日期对象
		 * 使用的是DateFormat类中的
		 * */
		String data = "1995.5.16";
		//获取日期格式工厂对象
		DateFormat dateFormat = DateFormat.getDateInstance();
		//通过DateFormat类的子类SimpleDateFormat，设置日期显示的格式，以便于能识别特定的格式
		dateFormat = new SimpleDateFormat("yyyyy.MM.dd");
		//将通过日期格式工厂，将日期转换成Date对象
		Date date = dateFormat.parse(data);
		System.out.println(date);
	}

	
	public static void methodDemo_2() {
		
		/* 对日期对象进行格式化
		 * 将日期对象->>日期格式的字符串
		 * 使用的是DateFormat类中的fromat方法
		 * */
		
		//如何使用自定义风格来显示时间日期
		SimpleDateFormat sdm = new SimpleDateFormat("yyyy♂♂mm♂♂dd");
		
		//获取时间对象
		Date date = new Date();
		
		//获取日期格式对象，具备着默认风格。FULL LONG等可以指定风格
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.FULL,DateFormat.MEDIUM);
		//DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL);
		
		System.out.println(sdm.format(date));
		
		//通过日期格式工厂，将Date对象转换成日期字符串
		//String dataStr = dateFormat.format(date);
		//System.out.println(dataStr);
	}
	
	public static void methodDemo_1() {

		// 返回当前时间的毫秒值
		long time = System.currentTimeMillis();// 1510491238050

		// 将当前日期和时间封装成Date对象
		Date date = new Date();

		// 将指定毫秒值封装成Date对象
		Date date2 = new Date(1510491238050l);

		System.out.println(date);
		System.out.println(date2);

		/*
		 * 日期对象和毫秒值之间的转换 毫秒值->>日期对象 1，可以通过Date对象的构造方法new Date(timeMillis);
		 * 2，还可以通过setTime设置 因为可以通过Date对象的方法对该日期的各个字段(年月日)进行操作
		 * 
		 * 日期对象->>毫秒值 1，getTmie() 因为可以通过具体的数值进行运算
		 */

		// 次日期是否在指定日期之后
		System.out.println(date2.after(date));

		// 次日期是否在指定日期之前
		System.out.println(date2.before(date));

		System.out.println(date2.compareTo(date));
		System.out.println(date2.toString());
	}

}
