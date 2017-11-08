package day19;

public class ParamterDemo {

	public static void main(String[] args) {
		/*int []arr = {2,31,1,5,6};
		System.out.println(add(arr));*/
		
		int sum = newAdd(2,31,1,5,6);
		System.out.println(sum);
	}

	/* 函数的可变参数
	 * 其实就是一个数组，但是接收的是数组的元素
	 * 自动将这些元素封装成数组，简化了调用者的书写
	 * 注意：可变参数类型，必须定义在参数列表的尾处
	 * */
	public static int newAdd(int... arr) {
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum+=arr[i];
		}
		return sum;
	}
	
	public static int add(int []arr) {
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum+=arr[i];
		}
		return sum;
	}
	
}
