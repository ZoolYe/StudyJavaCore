package day04;

public class BreakContinueDemo {

	public static void main(String[] args) {

		/* break:�������
		 * break�������÷�Χ��Ҫô��switch��䣬Ҫô��ѭ�����
		 * ��break��䵥������ʱ�����治Ҫ����������䣬��Ϊִ�в���
		 * break�����������ڵĵ�ǰѭ��
		 * ���������Ƕ��ѭ����break��Ҫ�����ƶ���ѭ��������ͨ����������
		 * */
		/*for(int i=0; i<4; i++) {
			
			if(i==2) {
				break;
			}
			System.out.println(i);
			//break;
		}*/
	
		/*q:for(int i=1; i<=4; i++) {
			
			w:for(int x=1; x<=4; x++) {
				System.out.println(x);
				break q;
			}
			
		}*/
		
		/* continue:����
		 * ���õķ�Χ��ѭ���ṹ
		 * continue:��������ѭ���������´�ѭ��
		 * ���continue�������ڣ����治Ҫ���κ���䣬��Ϊִ�в���
		 * */
	
		/*for(int i=1; i<11; i++) {
			if(i%2==0) {
				
				continue;
			}
			System.out.println(i);
		}*/
	
		s:for(int i=0; i<5; i++) {
			
			b:for(int x=0; x<4; x++) {
				System.out.println(i);
				continue s;
			}
			
		}
		
	}

}
