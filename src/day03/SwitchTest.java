package day03;

public class SwitchTest {

	public static void main(String[] args) {

		//根据用户输入数值对应出对应的星期
		
		int week = 2;
		
		switch(week) {
		
		case 1:
			System.out.println("星期一");
			break;
		case 2:
			System.out.println("星期二");
			break;
		case 3:
			System.out.println("星期三");
			break;
		case 4:
			System.out.println("星期四");
			break;
		case 5:
			System.out.println("星期五");
			break;
		case 6:
			System.out.println("星期六");
			break;
		case 7:
			System.out.println("星期天");
			break;
		default:
			System.out.println("没有对应的星期");
		}
		
		//根据月份对应出季节
		int y = 13;
		
		switch(y) {
		
		case 3:
		case 4:
		case 5:
			System.out.println(y+" 月是春季");
			break;
		
		case 6:
		case 7:
		case 8:
			System.out.println(y+" 月是夏季");
			break;
			
		case 9:
		case 10:
		case 11:
			System.out.println(y+" 月是秋季");
			break;
			
		case 12:
		case 1:
		case 2:
			System.out.println(y+" 月是冬天季");
			break;
			
		default:
			System.out.println("没有对应的季节");
		}
		
	}

}
