package day02;

public class OperateDemo2 {

	public static void main(String[] args) {

		//赋值运算符 = += -= *= /= %=
		/*int a,b,c;
		a = b = c = 4;*/
		
		int a = 4;
		a += 2;//a = a + 2;
		System.out.println(a);
		
		short s = 3;//赋值前会对数据进行检查,然后再转换
		s+=4;
		//s = s + 4;//不确定s数值的大小所以不能检查
		System.out.println(s);
	}

}