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
		String str1 = "nbaernbatynbaunbainbaopnba";
		str1.trim();
		String key = "nba";
		//int count = getStringIndexCount(str1, key);
		int count = getStringIndexCount2(str1, key);
		System.out.println(count);
		
		//两个字符串中最大相同的子串
		String s1 = "adhqwbdayugdas";
		String s2 = "sdgbhqwjnj";
		String s = getMaxSubString(s1,s2);
		System.out.println(s);
	}

	
	public static String getMaxSubString(String s1,String s2) {
		
		for(int i=0; i<s2.length(); i++) {
			for(int a=0, b=s2.length()-i; b!=s2.length()+1; a++,b++) {
				String sub = s2.substring(a,b);
				if(s1.contains(sub))
					return sub;
			}
			return null;
		}
		
		return null;
	}


	public static int getStringIndexCount2(String str1, String key) {
		
		//记录子串出现的次数
		int count = 0;
		//记录子串出现的位置
		int index = 0;
		/* indexOf从指定位置开始获取子串出现的位置，用index记录住，第二次查找时，从第一次出现的位置后面
		 * 开始查找，所以要用第一次出现的位置加上子串的长度，来查找
		 * */
		while((index = str1.indexOf(key, index))!=-1) {
			//将上一次的查找的位置加上子串的长度来进行下一次查找
			index = index+key.length();
			count++;
		}
		return count;
	}

	/**
	 * 获取子串在整串中出现的次数
	 * 这种方法查找时字符串常量池中会出现很多字符串，不建议使用
	 * @param str 传入一个整串
	 * @param key 要查询的子串
	 * @return 返回子串出现的次数
	 * */
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
