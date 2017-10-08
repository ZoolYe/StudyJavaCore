package day04;

public class BreakContinueDemo {

	public static void main(String[] args) {

		/* break:跳出语句
		 * break语句的作用范围，要么是switch语句，要么是循环语句
		 * 当break语句单独存在时，下面不要定义其他语句，因为执行不到
		 * break跳出的是所在的当前循环
		 * 如果出现了嵌套循环，break想要跳出制定的循环，可以通过标号来完成
		 * */
		/*for(int i=0; i<4; i++) {
			
			if(i==2) {
				break;
			}
			System.out.println(i);
			//break;
		}*/
	
		/*q:for(int i=1; i<=4; i++) {
			
			w:for(int x=1; x<=4; x++) {
				System.out.println(x);
				break q;
			}
			
		}*/
		
		/* continue:继续
		 * 作用的范围：循环结构
		 * continue:结束本次循环，继续下次循环
		 * 如果continue单独存在，下面不要有任何语句，因为执行不到
		 * */
	
		/*for(int i=1; i<11; i++) {
			if(i%2==0) {
				
				continue;
			}
			System.out.println(i);
		}*/
	
		s:for(int i=0; i<5; i++) {
			
			b:for(int x=0; x<4; x++) {
				System.out.println(i);
				continue s;
			}
			
		}
		
	}

}
