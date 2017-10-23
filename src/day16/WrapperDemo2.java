package day16;

public class WrapperDemo2 {

	public static void main(String[] args) {
		int num = 4;
		num = num + 5;

		Integer i = 4;// 自动装箱,变为对象以后多了一个值 null
		i = i + 5;//i = new Inteager(i.intValue()+5); i.value()自动拆箱
		show(12);
		
		Integer a = new Integer(127);
		Integer b = new Integer(127);
		System.out.println(a==b);//false
		System.out.println(a.equals(b));//true
		
		Integer c = 128;//jdk1.5以后，自动装箱，如果装箱的是一个字节，那么该数据会被共享不会重新开辟空间
		Integer d = 128;
		System.out.println(c==d);//
		System.out.println(c.equals(d));//true
	}

	public static void show(Object obj) {//Object obj = new Inteager(12);
		System.out.println("obj="+obj);
	}
	
}
