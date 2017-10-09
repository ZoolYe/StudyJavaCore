package day03;

public class OperateTest {

	public static void main(String[] args) {

		System.out.println(2<<3);
		
		int a = 17,b = 9;
		/*int temp = 0;
		 temp = a;
		 a = b;
		 b = temp;
		 System.out.println(a+" "+b);*/
		 
		 a = a ^ b;
		 b = a ^ b;
		 a = a ^ b;
		 
		 System.out.println(a+" "+b);
		 
		 System.out.println(a<b?12:0 );
		 
	}

}