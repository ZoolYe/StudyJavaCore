package day03;

public class SwitchTest {

	public static void main(String[] args) {

		//�����û�������ֵ��Ӧ����Ӧ������
		
		int week = 2;
		
		switch(week) {
		
		case 1:
			System.out.println("����һ");
			break;
		case 2:
			System.out.println("���ڶ�");
			break;
		case 3:
			System.out.println("������");
			break;
		case 4:
			System.out.println("������");
			break;
		case 5:
			System.out.println("������");
			break;
		case 6:
			System.out.println("������");
			break;
		case 7:
			System.out.println("������");
			break;
		default:
			System.out.println("û�ж�Ӧ������");
		}
		
		//�����·ݶ�Ӧ������
		int y = 13;
		
		switch(y) {
		
		case 3:
		case 4:
		case 5:
			System.out.println(y+" ���Ǵ���");
			break;
		
		case 6:
		case 7:
		case 8:
			System.out.println(y+" �����ļ�");
			break;
			
		case 9:
		case 10:
		case 11:
			System.out.println(y+" �����＾");
			break;
			
		case 12:
		case 1:
		case 2:
			System.out.println(y+" ���Ƕ��켾");
			break;
			
		default:
			System.out.println("û�ж�Ӧ�ļ���");
		}
		
	}

}
