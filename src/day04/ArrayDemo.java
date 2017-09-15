package day04;
public class ArrayDemo {

	public static void main(String[] args) {

		//元素类型[] 数组名 = new 元素类型[元素个数或数组长度];
		int [] array = new int[] {1,2,3,4};
		System.out.println(array[3]);
	}
	/* JVM虚拟机对内存的划分
	 * 1，寄存器
	 * 2，本地方法区
	 * 3，栈内存
	 * 		栈内存存储的都是局部变量
	 * 		而且变量所属的作用域一旦结束，该变量就自动释放
	 * 5，堆内存
	 * 		存储的数组和对象(其实数组就是对象)凡是new建立的都在堆中
	 * 特点：
	 * 1，
	 * */
	
	//局部代码块。限定局部变量的生命周期
	{
		int age = 4;
	}
}