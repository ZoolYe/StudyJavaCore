package day04;


public class ForForTest {

	public static void main(String[] args) {

		/* *****
		 * ****
		 * ***
		 * **
		 * *
		 * */
		/*for(int i=1; i<=5; i++) {
			
			for(int x=i; x<=5; x++) {
				System.out.print("*");
			}
			System.out.println();
		}*/
		
		/* *
		 * **
		 * ***
		 * ****
		 * *****
		 * */
		
		/*for(int i=1; i<=5; i++) {
			
			for(int x=1; x<= i; x++) {
				System.out.print("*");
			}
			System.out.println();
		}*/

		/* 54321
		 * 5432
		 * 543
		 * 54
		 * 5
		 * */
		
		/*for(int i=5; i>=1; i--) {
			
			for(int x=i; x>=1; x--) {
				System.out.print(x);
			}
			System.out.println();
		}
		*/
		/*for(int i=1; i<=5; i++) {
			
			for(int x=5; x>=i; x--) {
				System.out.print(x);
			}
			System.out.println();
		}*/
		
		
		/* 1
		 * 22
		 * 333
		 * 4444
		 * 55555
		 * */
		
		/*for(int i=1; i<=5; i++) {
			
			for(int x=1; x<=i; x++) {
				System.out.print(i);
			}
			System.out.println();
		}*/
		
		for(int i=1; i<=5; i++) {
			
			for(int x=1; x<=i; x++) {
				System.out.print(x+1);
			}
			System.out.println();
		}
		
	}

}
