package day16;

public class WrapperDemo2 {

	public static void main(String[] args) {
		int num = 4;
		num = num + 5;

		Integer i = 4;// �Զ�װ��,��Ϊ�����Ժ����һ��ֵ null
		i = i + 5;//i = new Inteager(i.intValue()+5); i.value()�Զ�����
		show(12);
		
		Integer a = new Integer(127);
		Integer b = new Integer(127);
		System.out.println(a==b);//false
		System.out.println(a.equals(b));//true
		
		Integer c = 128;//jdk1.5�Ժ��Զ�װ�䣬���װ�����һ���ֽڣ���ô�����ݻᱻ���������¿��ٿռ�
		Integer d = 128;
		System.out.println(c==d);//
		System.out.println(c.equals(d));//true
	}

	public static void show(Object obj) {//Object obj = new Inteager(12);
		System.out.println("obj="+obj);
	}
	
}
