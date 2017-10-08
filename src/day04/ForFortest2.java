package day04;

public class ForFortest2 {

	public static void main(String[] args) {

		/* * * * * *
		 *  * * * *
		 *   * * *
		 *    * *
		 *     *
		 * */
		
		for(int i=1; i<=5; i++) {
			
			for(int x=1; x<i; x++) {
				System.out.print(" ");
			}
			
			for(int z=i; z<=5; z++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
		
	}

}
