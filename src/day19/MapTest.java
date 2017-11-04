package day19;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapTest {

	public static void main(String[] args) {
		/* ��ϰ��
		 * "fdgavcbsacdfs"��ȡ���ַ����У�ÿһ����ĸ���ֵĴ���
		 * Ҫ���ӡ����ǣ�a(2)b(1)...;
		 * ���ڽ���ķ������֣���ĸ�ʹ���֮�������ӳ��Ĺ�ϵ���������ֹ�ϵ�ܶ�
		 * �ܶ����Ҫ�洢���ܴ���ӳ���ϵ�������������Map����
		 * ��ϵһ������������û��
		 * �Ǿ�ʹ��Map���ϣ��ַ��ֿ��Ա�֤Ψһ�Ե�һ���߱���˳����abcd������ʹ��TreeMap����
		 * �����������Ӧ�ô洢������ĸ�ʹ����Ķ�Ӧ��ϵ
		 * 1����Ϊ���������ַ����е���ĸ�������Ƚ��ַ�������ַ����顣
		 * 2�������ַ����飬��ÿһ����ĸ��Ϊ��ȥ��Map���������
		 * 	�������ĸ�������ڣ��ͽ�����ĸ��Ϊ����1��Ϊֵ�洢��Map������
		 * 	�������ĸ�����ڣ��ͽ�����ĸ����Ӧֵȡ����+1���ٽ�����ĸ�ͼ�1���ֵ�洢��Map������
		 * 	����ͬ��ֵ�ͻḲ��
		 * */
		
		String str = "fdgavcbs ashdas++__  dhaohwwwacdffs";
		
		Map<Character, Integer> map = getCharCount(str);
		String str1 = mapToString(map);
		System.out.println(str1);
	}

	public static Map<Character,Integer> getCharCount(String str) {
		
		//���ַ�������ַ�����
		char []chs = str.toCharArray();
		
		//����һ��Map���ϱ�
		Map<Character,Integer> map = new TreeMap<Character,Integer>();
		
		for(int i=0;i<chs.length; i++) {
			
			//������ǲ��Ǵ�Сд�ַ������������ַ��Ͳ����
			if(chs[i]>='a' && chs[i]<='z' || chs[i]>='A' && chs[i]<='Z') {
				
				//�������е���ĸ��Ϊ��ȥ��Map��
				Integer value = map.get(chs[i]);
			
				//�ж�ֵ�Ƿ�Ϊ��
				if(value==null) {
					map.put(chs[i], 1);
				}else {
					map.put(chs[i], value+1);
				}
			}
				//����������ַ�����������ѭ��
				continue;
		}
		
		/*Set<Entry<Character, Integer>> se = map.entrySet();
		Iterator<Entry<Character, Integer>> it = se.iterator();
		
		while(it.hasNext()) {
			
			Entry<Character, Integer> e = it.next();
			
			char key = e.getKey();
			int value = e.getValue();
			System.out.print(key+"("+value+") ");
			
		}*/
		return map;
	}

	public static String mapToString(Map<Character, Integer> map) {
		
		StringBuilder sb = new StringBuilder();
		Set<Entry<Character, Integer>> se = map.entrySet();
		Iterator<Entry<Character, Integer>> it = se.iterator();
		
			while(it.hasNext()) {
			
			Entry<Character, Integer> e = it.next();
			
			char key = e.getKey();
			int value = e.getValue();
			sb.append(key+"("+value+") ");
		}
			
			return sb.toString();
	}
	
}
