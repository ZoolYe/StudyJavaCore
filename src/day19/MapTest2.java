package day19;

public class MapTest2 {

	public static void main(String[] args) {
		/* Map����ӳ���ϵʱ���������ȿ���
		 * �ڲ���е�Ӧ�ý�Ϊ���
		 * */
		System.out.println(getWeek(7));
	}
	
	public static String getWeek(int week) {
		if(!(week >=1 && week<=7)) {
			throw new RuntimeException("�����ڵ����ڣ���������ȷ������");
		}
		String [] weeks = {"","����һ","���ڶ�","������","������","������","������","������",};
		return weeks[week];
		
	}
	
	
}
