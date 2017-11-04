package day19;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapTest {

	public static void main(String[] args) {
		/* 练习：
		 * "fdgavcbsacdfs"获取该字符串中，每一个字母出现的次数
		 * 要求打印结果是：a(2)b(1)...;
		 * 对于结果的分析发现，字母和次数之间存在着映射的关系，而且这种关系很多
		 * 很多就需要存储，能储存映射关系的容器有数组和Map集合
		 * 关系一方是有序编号吗？没有
		 * 那就使用Map集合，又发现可以保证唯一性的一方具备着顺序如abcd，可以使用TreeMap集合
		 * 这个集合最终应该存储的是字母和次数的对应关系
		 * 1，因为操作的是字符串中的字母，所以先将字符串变成字符数组。
		 * 2，遍历字符数组，用每一个字母作为键去查Map集合这个表
		 * 	如果该字母键不存在，就将该字母作为键，1作为值存储到Map集合中
		 * 	如果该字母键存在，就将该字母键对应值取出并+1，再将该字母和加1后的值存储到Map集合中
		 * 	键相同，值就会覆盖
		 * */
		
		String str = "fdgavcbs ashdas++__  dhaohwwwacdffs";
		
		Map<Character, Integer> map = getCharCount(str);
		String str1 = mapToString(map);
		System.out.println(str1);
	}

	public static Map<Character,Integer> getCharCount(String str) {
		
		//将字符串变成字符数组
		char []chs = str.toCharArray();
		
		//定义一个Map集合表
		Map<Character,Integer> map = new TreeMap<Character,Integer>();
		
		for(int i=0;i<chs.length; i++) {
			
			//如果不是不是大小写字符而是其他的字符就不检查
			if(chs[i]>='a' && chs[i]<='z' || chs[i]>='A' && chs[i]<='Z') {
				
				//将数组中的字母作为键去查Map表
				Integer value = map.get(chs[i]);
			
				//判断值是否为空
				if(value==null) {
					map.put(chs[i], 1);
				}else {
					map.put(chs[i], value+1);
				}
			}
				//如果是其他字符就跳过本次循环
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
