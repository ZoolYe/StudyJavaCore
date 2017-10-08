package day04;

public class ForForDemo {

	public static void main(String[] args) {

		/*for(int x=0; x<3; x++) {
			
			for(int y=0; y<4; y++) {
				System.out.println("haha");
			}
			
		}*/
		
		/* #####
		 * #####
		 * #####
		 * #####
		 * */
		
		for(int i=0; i<4; i++) { //外循环控制的是行数
			for(int x=0; x<5; x++) { //内循环控制的是列数
				System.out.print("#");
			}
			System.out.println();
		}
		
	}

}
