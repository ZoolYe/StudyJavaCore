package day15;

public class StringMethodDemo {

	public static void main(String[] args) {
		
		/* ������������˼����ַ������й��ܷ���
		 * "abc"
		 * 1����ȡ��
		 * 	1.1��ȡ�ַ����е��ַ�����(����)
		 * 		int length();
		 * 	1.2����λ�û�ȡ�ַ�
		 * 		char charAt(int index);
		 * 	1.3�����ַ���ȡ���ַ����еĵ�һ�γ��ֵ�λ��
		 * 		int indexOf(int ch);
		 * 		��ָ��λ�ý���ch��������һ�γ��ֵ�λ��
		 * 		int indexOf(int ch,int fromIndex);
		 * 		int indexOf(String str);
		 * 		int indexOf(String str,int fromIndex);
		 * 		�����ַ�����ȡ���ַ����еĵ�һ�γ��ֵ�λ��
		 * 		int lastIndexOf(int ch);
		 *		int lastIndexOf(int ch,int fromIndex);
		 *		int lastIndexOf(String str);
		 *		int lastIndexOf(String str,int fromIndex);
		 *	1.4��ȡ�ַ����е�һ�����ַ�����Ҳ��֮Ϊ�Ӵ�
		 *		String substring(int beginIndex);
		 *		//����begin������end
		 *		String substring(int beginIndex,int endIndex);
		 *2��ת����
		 *	2.1���ַ�������ַ�������(���ַ��������и�)
		 *		String[] split(String regex);�漰��������ʽ
		 *	2.2���ַ�������ַ�����
		 *		char[] toCharArray();
		 *	2.3���ַ�������ֽ�����
		 *		char[] getBytes;
		 *	2.4���ַ����е���ĸת�ɴ�Сд
		 *		String toUpperCase();��д
		 *		String toLowerCse();Сд
		 *	2.5���ַ����е��ƶ����ݽ����滻
		 *		String replace(char oldChar,char newChar);
		 *		String replace(String s1,String s2);
		 *	2.6���ַ������˵Ŀո�ȥ��
		 *		String trim();
		 *	2.7���ַ�����������
		 *		String concat(string);
		 *3���жϣ�
		 *	3.1�����ַ��������Ƿ���ͬ��
		 *		boolean equals(Object obj);
		 *		//���Դ�Сд�ַ����Ƚ�����
		 *		boolean equalsIgnoreCase(String str);
		 *	3.2�ַ������Ƿ�����ƶ��ַ���
		 *		boolean contains(String str);
		 *	3.3�ַ����Ƿ���ָ���ַ�����ͷ���Ƿ���ָ���ַ�����β
		 *		boolean startsWith(string);
		 *		boolean endsWith(string);
		 *4���Ƚϣ�
		 *	4.1�Ƚ������ַ������ֵ�,�Ƚ��ǻ����ַ����е�ÿ���ַ���Unicodeֵ
		 *		int compareTo(String anotherString);
		 * */
		
		//stringMethodDemo();
		//stringMethodDemo2();
		//stringMethodDemo3();
		stringMethodDemo4();
		
		/*char []ch = {'w','c','a','w','v'};
		String s = new String(ch);
		System.out.println(s.indexOf('w',1));*/
	}	

	public static void stringMethodDemo4() {
		String s = "a";
		System.out.println(s.compareTo("A"));
	}

	private static void stringMethodDemo3() {
		String s = "abc";
		//System.out.println(s.equals("ABC".toLowerCase()));
		//System.out.println(s.equalsIgnoreCase("ABC"));
		String s2 = "ArrayDemo.java";
		System.out.println(s2.startsWith("Arr"));
		System.out.println(s2.endsWith(".java"));
	}

	public static void stringMethodDemo2() {
		String s = "����.����.����";
		String s1 = "����,����,����";
		String s2 = "ab��";
		//��Ҫ����\\��б��
		String []arr = s.split("\\.");
		for(int i=0; i<arr.length; i++) {
			//System.out.println(arr[i]);
		}
		
		char[] ch = s1.toCharArray();
		for(int i=0; i<ch.length; i++) {
			//System.out.print(ch[i]);
		}
		
		byte[] bit = s2.getBytes();
		for (int i = 0; i < bit.length; i++) {
			//System.out.println(bit[i]);
		}
		//System.out.println(s2.toUpperCase());
		//System.out.println(s2.replace('��', 'a'));
		
		String s3 = "java";
		String s4 = s3.replace('o', 'p');
		System.out.println(s3==s4);//true
		System.out.println("  as  e   d s ".trim());
	}

	private static void stringMethodDemo() {
		
		String s = "abcdbcae";
		System.out.println("length:"+s.length());//8
		System.out.println("char:"+s.charAt(2));//c
		
		//���ǿ��Ը���-1���жϸ��ַ������ַ����Ƿ����
		System.out.println("index:"+s.indexOf('k'));//2
		System.out.println("lastIndex:"+s.lastIndexOf('a'));//6
		
		System.out.println(s.substring(4));
		System.out.println(s.substring(3, 5));
	}

}
