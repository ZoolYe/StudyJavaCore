package day04;

public class FunctionDemo {

	public static void main(String[] args) {

		/*int sum = add(30, 20);
		System.out.println(sum);*/
		//printRectangle(4, 5);
		//System.out.println(isEqual(5, 5));
		//System.out.println(getMax(60, 61));
		//print99();
		System.out.println(getGrade(1));
	}

	/*static int add(int a,int b) {
		
		return a+b;
	}*/
	
	/* ���庯���ĸ�ʽ
	 * ���η� ����ֵ���� ������(�������� ��ʽ����,�������� ��ʽ����2,...){
	 * 		ִ�����
	 * 		return ����ֵ;
	 * }
	 * 
	 * ���������
	 * ����û�о���ķ���ֵ
	 * ��ʱreturn�ĺ���ֱ���÷ֺŽ���
	 * û�о��巵��ֵʱ������ֵ������void����ʾ
	 * �������ֵ������void����ô�����е�return������ʡ�Բ�д
	 * ����ֵ���ͺͲ������ͣ�û��ֱ�ӹ�ϵ
	 * 
	 * */
	
	//��
	public static int add(int a, int b) {
		return a+b;
	}
	
	//��
	public static int reduce(int a, int b) {
		return a-b;
	}
	
	//��
	public static int ride(int a, int b) {
		return a*b;
	}
	
	//��
	public static int except(int a, int b) {
		return a/b;
	}
	
	//�ж��������Ƿ����
	public static boolean isEqual(int a, int b) {
		return a==b;
	}	
	
	//��ȡ��������������
	public static int getMax(int a, int b) {
		/*int max=0;
		if(a>b) {
			max=a;
		}else {
			max=b;
		}
		return max;*/
		return a>b?a:b;
	}
	
	//�����û���������ִ�ӡ��Ӧ�ľ���
	public static void printRectangle(int a, int b) {
		
		for(int i=1; i<=a; i++) {
			
			for(int x=1; x<=b; x++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
	
	//���99�˷���
	public static void print99() {
		
		for(int i=1; i<=9; i++) {
			
			for(int x=1; x<=i; x++) {
				System.out.print(x+"x"+i+"="+x*i+"\t");
			}
			System.out.println();
		}
		
	}
	
	/* ���ݿ��Գɼ���ȡѧ��������Ӧ�ĵȼ�
	 * 90~100	A
	 * 80~89	B
	 * 70~79	C
	 * 60~69	D
	 * 60����		E
	 * */
	
	public static char getGrade(int score) {
		if(score>=90 && score<=100) {
			return 'A';
		}else if(score>=80 && score<=89) {
			return 'B';
		}else if(score>=70 && score<=79) {
			return 'C';
		}else if(score>=60 && score<=69) {
			return 'D';
		}else if(score<60 && score>=0) {
			return 'E';
		}else {
			return 'x';
		}
	}
	
}