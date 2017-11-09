package day20;

import java.util.Properties;
import java.util.Set;

public class SystemDemo {

	public static void main(String[] args) {
		
		/* System:类中的方法和属性都是静态的
		 * 常见方法：
		 * long currentTimeMillis();获取当前时间的毫秒值，1970年1月1日 减去当前的，日期的毫秒值
		 * */
		long ll = System.currentTimeMillis();
		//System.out.println(ll);
		
		//给系统设置一些属性信息，这些信息是全局的，其他程序都可以使用
		System.setProperty("user.home", "zoology");
		demo();
		//获取当前系统的回车符
		//System.out.println("hello"+System.getProperty("line.separator")+"word");
		
	}

	public static void demo() {
	
		//获取系统的属性信息，并存储到了Properties集合中,这个集合是Map集合的子类
		Properties prop = System.getProperties();
		
		/* Properties集合中存储都是String类型的键和值
		 * 最好使用它自己的存储和取出的方法，来完成元素的操作
		 * */
		
		//将Properties集合中的键转换成Set集合
		Set<String> keySet = prop.stringPropertyNames();
		
		for(String key : keySet) {
			String value = prop.getProperty(key);
			System.out.println(key+"---"+value);
		}
		
	}
	
}
