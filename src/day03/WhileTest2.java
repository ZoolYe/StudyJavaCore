package day03;


public class WhileTest2 {

	public static void main(String[] args) {

		//1到100之间6的倍数出现的次数
		
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
