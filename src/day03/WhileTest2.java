package day03;


public class WhileTest2 {

	public static void main(String[] args) {

		//1��100֮��6�ı������ֵĴ���
		
		int i = 1;
		int sum = 0;
		
		/*while(i<=100) {
			
			while(i%6==0) {
				i++;
				sum++;
			}
			i++;
		}
		System.out.println(sum);*/
		
		while(i<=100) {
			
			if(i%6==0) {
				sum++;
			}
			i++;
		}
		System.out.println(sum);
		
	}

}
