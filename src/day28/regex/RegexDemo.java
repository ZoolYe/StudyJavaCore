package day28.regex;

/* 正则表达式： 正确的规格表达式
 * 正则表达式用于操作字符串数据
 * 通过一些特定的符号来体现的
 * 所以我们为了掌握正则表达式，必须要学习一些符号
 * */
public class RegexDemo {

	public static void main(String[] args) {
		//checkQQ("00");
		//正则表达式第一位1-9 第二位0-9并且，0-9后面可以出现4至14次
		//String regex = "[1-9][0-9]{4,14}";
		
		String str = "ao3b";
		String regex = "ao[1-2]b";
		System.out.println(str.matches(regex));
		
		//checkQQ_2("12345789", regex);
	}

	public static void checkQQ_2(String qq,String regex) {
		if(qq.matches(regex)) {
			System.out.println("QQ正确");
		}
	}
	
	/* 需求：定义一个功能对QQ号进行校验
	 * 要求：长度5~15，只能是数字，0不能开头
	 * */
	public static void checkQQ(String qq) {
		int len = qq.length();
		if(len>=5 && len<=15) {
			if(!qq.startsWith("0")) {
				try{
					long l = Long.parseLong(qq);
				}catch(NumberFormatException nfe){
					System.out.println("QQ号只能是数字");
				}
					
			}else {
				System.out.println("QQ号不能以0开头");
			}
		}else {
			System.out.println("QQ号长度错误");
		}
	}
	
}
