package day15;

public class StringTest {

	public static void main(String[] args) {
		/*
		 * ����һ���ַ������飬�����ֵ��˳���С��������� {"nba","abc","cba","zz","qq","haha"}
		 */
		String[] str = { "nba", "abc", "cba", "zz", "qq", "haha" };
		
		printArray(str);
		stringSort(str);
		printArray(str);
		
		/* һ���Ӵ��������г��ֵĴ���
		 * "nbaernbatynbauinbaopnba"
		 * */
		String str1 = "nbaernbatynbaunbainbaopnba";
		str1.trim();
		String key = "nba";
		//int count = getStringIndexCount(str1, key);
		int count = getStringIndexCount2(str1, key);
		System.out.println(count);
		
		//�����ַ����������ͬ���Ӵ�
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
		
		//��¼�Ӵ����ֵĴ���
		int count = 0;
		//��¼�Ӵ����ֵ�λ��
		int index = 0;
		/* indexOf��ָ��λ�ÿ�ʼ��ȡ�Ӵ����ֵ�λ�ã���index��¼ס���ڶ��β���ʱ���ӵ�һ�γ��ֵ�λ�ú���
		 * ��ʼ���ң�����Ҫ�õ�һ�γ��ֵ�λ�ü����Ӵ��ĳ��ȣ�������
		 * */
		while((index = str1.indexOf(key, index))!=-1) {
			//����һ�εĲ��ҵ�λ�ü����Ӵ��ĳ�����������һ�β���
			index = index+key.length();
			count++;
		}
		return count;
	}

	/**
	 * ��ȡ�Ӵ��������г��ֵĴ���
	 * ���ַ�������ʱ�ַ����������л���ֺܶ��ַ�����������ʹ��
	 * @param str ����һ������
	 * @param key Ҫ��ѯ���Ӵ�
	 * @return �����Ӵ����ֵĴ���
	 * */
	public static int getStringIndexCount(String str,String key) {
		//���������¼�Ӵ����ֵĴ���
		int count = 0;
		//��¼�Ӵ����ֵ�λ��
		int index = 0;
		
		/* ѭ���жϣ�indexOf��ȡ���Ӵ���һ�γ��ֵ�λ�ã�������ص�ֵ����-1˵�����������Ӵ������������һ��
		 * ���ֵ�λ�ã�Ȼ����index������¼סλ�ã�Ȼ���ȡ�����λ�ÿ�ʼ������Ӵ�����Ϊindex��¼����key
		 * ��һ����ĸ���ֵ�λ�ã�����Ҫ����key�Ӵ��ĳ��ȣ�����keyĩβ������ĸ�ĺ�һλ��ʼ��ȡ�Ӵ�
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

	//���ַ��������ֵ��˳���С���������
	public static void stringSort(String[] str) {

		for (int i = 0; i < str.length; i++) {

			for (int x = i + 1; x < str.length; x++) {
				//�����ַ����ķ���compareTo�����С�ڲ������ظ��������ڷ������������ڷ���0
				if (str[i].compareTo(str[x]) > 0) {
					String temp = str[x];
					str[x] = str[i];
					str[i] = temp;
				}
			}

		}

	}

}
