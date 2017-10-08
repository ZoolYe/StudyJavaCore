package day03;

public class IfTest2 {

	public static void main(String[] args) {
		
		//使用if来判断出月份对应的季节
		//春季是2.3.4月。夏季5,6,7月，秋季8.9.10月，冬季11,12,1月
		int x = 1;
		
		/*if(x>=2 && x<=4) {
			System.out.println(x+" 月是春季");
		}else if(x>=5 && x<=7) {
			System.out.println(x+" 月是夏季");
		}else if(x>=8 && x<=10) {
			System.out.println(x+" 月是秋季");
		}else if(x>=11 && x<=12 || x==1) {
			System.out.println(x+" 月是冬季");
		}else {
			System.out.println(x+" 没有这个月份");
		}*/
		
		if( x<1 || x>12) {
			System.out.println(x+" 没有这个月份");
		}else if (x>=2 && x<=4) {
			System.out.println(x+" 月是春季");
		}
		else if(x>=5 && x<=7) {
			System.out.println(x+" 月是夏季");
		}else if(x>=8 && x<=10) {
			System.out.println(x+" 月是秋季");
		}else {
			System.out.println(x+" 月是冬季");
		}
		
	}
}
