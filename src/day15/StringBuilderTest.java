package day15;

public class StringBuilderTest {

	public static void main(String[] args) {
		int []arr = new int[]{12,65,80,22,76,123,86,8};
		//String s = arrayToString(arr);
		String s = arrayToString2(arr);
		System.out.println(s);
	}

	//将一个int数组变成字符串
	public static String arrayToString(int []arr) {
		String str = null;
		for(int i=0;  i<arr.length; i++) {
			//不建议使用这种方法，因为没相加一次在字符串常量池中就会产生一个新的字符串常量
			str += Integer.toString(arr[i]);
		}
		return str;
	}
	
	public static String arrayToString2(int []arr) {
		//创建一个字符串缓冲区
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			sb.append(arr[i]);
		}
		return sb.toString();
	}
}
