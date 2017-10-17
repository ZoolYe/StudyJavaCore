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
		String str1 = "nbaernbatynbauinbaopnba";
		String key = "nba";
		int count = getStringIndexCount(str1, key);
		System.out.println(count);
	}

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
