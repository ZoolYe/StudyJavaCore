package day03;

public class IfTest2 {

	public static void main(String[] args) {
		
		//ʹ��if���жϳ��·ݶ�Ӧ�ļ���
		//������2.3.4�¡��ļ�5,6,7�£��＾8.9.10�£�����11,12,1��
		int x = 1;
		
		/*if(x>=2 && x<=4) {
			System.out.println(x+" ���Ǵ���");
		}else if(x>=5 && x<=7) {
			System.out.println(x+" �����ļ�");
		}else if(x>=8 && x<=10) {
			System.out.println(x+" �����＾");
		}else if(x>=11 && x<=12 || x==1) {
			System.out.println(x+" ���Ƕ���");
		}else {
			System.out.println(x+" û������·�");
		}*/
		
		if( x<1 || x>12) {
			System.out.println(x+" û������·�");
		}else if (x>=2 && x<=4) {
			System.out.println(x+" ���Ǵ���");
		}
		else if(x>=5 && x<=7) {
			System.out.println(x+" �����ļ�");
		}else if(x>=8 && x<=10) {
			System.out.println(x+" �����＾");
		}else {
			System.out.println(x+" ���Ƕ���");
		}
		
	}
}
