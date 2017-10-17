package day15;

public class StringTest {

	public static void main(String[] args) {
		/*
		 * 给定一个字符串数组，按照字典的顺序从小到大的排序 {"nba","abc","cba","zz","qq","haha"}
		 */
		String[] str = { "nba", "abc", "cba", "zz", "qq", "haha" };
		printArray(str);
		stringSort(str);
		printArray(str);
		
		/* 一个子串在整串中出现的次数
		 * "nbaernbatynbauinbaopnba"
		 * */
		String str1 = "nbaernbatynbauinbaopnba";
		String key = "nba";
		int count = getStringIndexCount(str1, key);
		System.out.println(count);
	}

	public static int getStringIndexCount(String str,String key) {
		//定义变量记录子串出现的次数
		int count = 0;
		//记录子串出现的位置
		int index = 0;
		
		/* 循环判断，indexOf获取到子串第一次出现的位置，如果返回的值大于-1说明整串中有子串，并返回其第一次
		 * 出现的位置，然后用index变量记录住位置，然后获取从这个位置开始后面的子串，因为index记录的是key
		 * 第一个字母出现的位置，所以要加上key子串的长度，来从key末尾处的字母的后一位开始获取子串
		 * */
		while((index = str.indexOf(key))!=-1) {
			str = str.substring(index+key.length());
			count++;
		}
		return count;
	}
	
	public static void printArray(String[] str) {
		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i] + ", ");
		}
		System.out.println();
	}

	//将字符串按照字典的顺序从小到大的排序
	public static void stringSort(String[] str) {

		for (int i = 0; i < str.length; i++) {

			for (int x = i + 1; x < str.length; x++) {
				//调用字符串的方法compareTo，左边小于参数返回负数，大于返回正数，等于返回0
				if (str[i].compareTo(str[x]) > 0) {
					String temp = str[x];
					str[x] = str[i];
					str[i] = temp;
				}
			}

		}

	}

}
