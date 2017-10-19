package day15;
/* StringBuffer:就是字符串缓冲区
 * 用于存储数据的容器
 * 特点：
 * 1，长度是可变的
 * 2，可以存储不同类型的数据
 * 3，最终要转成字符串进行使用
 * 4，可以对字符串进行修改
 * 
 * 既然是一个容器就应该具备一些功能
 * 1，添加：
 * 		StringBuffer append(data);
 * 		StringBuffer inster(index,data);
 * 2，删除：
 * 		StringBuffer delete(start,end);包含头，不包含尾
 * 		StringBuffer deleteCharAt(index);删除指定位置上的元素
 * 3，查找：
 * 		char charAt(index);
 * 		int indexOf(string);
 * 		int lastIndexOf(string);
 * 4，修改：
 * 		StringBuffer replace(start,end.string);
 * 		void setCharAt(index,char);
 * */
public class StringBufferDemo {

	public static void main(String[] args) {
		//bufferMethodDemo();
		bufferMethodDemo2();
	}

	public static void bufferMethodDemo2() {
		StringBuffer sb = new StringBuffer("abcdefsdhsdg");
		/*sb.delete(1, 3);
		sb.deleteCharAt(2);
		//清空缓冲区
		sb.delete(0, sb.length());*/
		sb.replace(1, 5, "wocaojava");
		sb.setCharAt(1, ' ');
		
		//设置长度，在空白的地方会添加空白字符
		sb.setLength(100);
		
		//字符串反转
		sb.reverse();
		System.out.println(sb);
	}

	public static void bufferMethodDemo() {
		//创建缓冲区对象
		StringBuffer sb = new StringBuffer("caonima");
		sb.append("hehhe").append("1").append("java");
		sb.append(true);
		sb.insert(2,99);
		System.out.println(sb);
		
	}
	
}
