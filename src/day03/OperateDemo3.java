package day03;

public class OperateDemo3 {

	public static void main(String[] args) {
		
		//比较运算符运算完的结果必须是true或者false
		System.out.println(2<3);
		System.out.println(3!=2);
		
		/*
		 * 逻辑运算符用于连接两个boolean类型的表达式
		 * &：与 (两边运算的结果只要有一个为false结果就为false，只有两边都为true结果才是true)
		 * |:或 (两边运算的结果只要有一个为true结果就为true，两边都为false结果才是false)
		 * ^:异或(两边结果相同结果为false，如果结果不同，结果是true)
		 * !:非(!true = false !false = true)
		 * &&:短路与(和&的运算结果一样，区别在与，当左边运算的结果为false时，右边不参与运算)
		 * ||:短路或(和|运算结果一样，区别在于，当左边运算结果为true时，右边不参与运算)
		 * ~
		*/
		int x = 6;
		System.out.println(6&3);
	}

}