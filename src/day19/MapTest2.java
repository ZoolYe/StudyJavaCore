package day19;

public class MapTest2 {

	public static void main(String[] args) {
		/* Map在有映射关系时，可以优先考虑
		 * 在查表法中的应用较为多见
		 * */
		System.out.println(getWeek(7));
	}
	
	public static String getWeek(int week) {
		if(!(week >=1 && week<=7)) {
			throw new RuntimeException("不存在的星期，请输入正确的星期");
		}
		String [] weeks = {"","星期一","星期二","星期三","星期四","星期五","星期六","星期天",};
		return weeks[week];
		
	}
	
	
}
