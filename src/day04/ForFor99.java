package day04;

public class ForFor99 {

	public static void main(String[] args) {

		/* 九九乘法表
		 * 1x1=1
		 * 1x2=2 2x2=4
		 * 1x3=3 2x3=6 3x3=9
		 * 
		 * \n:回车
		 * \t:制表符
		 * \b:退格
		 * \r:按下回车键
		 * Windows系统中回车符是由两个字符组成的\r\n
		 * Linux系统中回车符就是\n 
		 * */
		
		for(int i=1; i<=9; i++) {
			
			for(int x=1; x<=i; x++) {
				System.out.print(x+"x"+i+"="+x*i+"\t");
			}
			System.out.println();
		}
		
		//System.out.println("\"你好\"");
		
	}

}
