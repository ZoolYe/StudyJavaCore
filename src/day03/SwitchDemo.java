package day03;


public class SwitchDemo {

	public static void main(String[] args) {

		int x = 1;
		
		switch(x) {
		
			case 1:
				System.out.println("你妈妈咪");
				break;
			case 2:
				System.out.println("hahah");
				break;
			default:
				System.out.println("default");
		}
		
		int a = 3 , b = 9;
		char opr = '-';
		
		switch(opr) {//byte、short、int、char、String，枚举类型
		case '+':
			System.out.println(a+b);
			break;
		case '-':
			System.out.println(a-b);
			break;
		case '*':
			System.out.println(a*b);
			break;
		case '/':
			System.out.println(a/b);
			break;
		default:
			System.out.println("不支持的运算");
			break;
		}
		
	}

}
