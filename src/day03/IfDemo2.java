package day03;

public class IfDemo2 {

	public static void main(String[] args) {

		/* if���ĵڶ��ָ�ʽ
		 * if(�������ʽ){
		 * 	ִ�����
		 * }else{
		 * 	ִ�����
		 * }
		 * */
		
		int x = 3;
		
		if(x<1) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
		
		int a = 3,b;
		if(a>1)
			b = 100;
		else
			b = 200;
		System.out.println(b);
		
		//��Ԫ���������if else ���ļ�д��ʽ
		int b1 = a>1?100:200;
		
	}

}
