package day03;

public class WhileTest {

	public static void main(String[] args) {

		//获取1到10的数字之和
		
		int i = 1,sum = 0;
		while(i<=100) {
			sum+=i;
			i++;
		}
		System.out.println(sum);
	}

}
