package day04;

public class ForFor99 {

	public static void main(String[] args) {

		/* �žų˷���
		 * 1x1=1
		 * 1x2=2 2x2=4
		 * 1x3=3 2x3=6 3x3=9
		 * 
		 * \n:�س�
		 * \t:�Ʊ��
		 * \b:�˸�
		 * \r:���»س���
		 * Windowsϵͳ�лس������������ַ���ɵ�\r\n
		 * Linuxϵͳ�лس�������\n 
		 * */
		
		for(int i=1; i<=9; i++) {
			
			for(int x=1; x<=i; x++) {
				System.out.print(x+"x"+i+"="+x*i+"\t");
			}
			System.out.println();
		}
		
		//System.out.println("\"���\"");
		
	}

}
