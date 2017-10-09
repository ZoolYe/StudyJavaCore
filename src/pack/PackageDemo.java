package pack;
//导包的原则：用到哪个类，就导入哪个类
import packa.*;//导入packa包中的所有类文件, 但是不能导入子包

/* packa\abc\*.java
 * import packa.abc.*;
 * */
public class PackageDemo {

	public static void main(String[] args) {
		
		//packa.DemoA pa = new packa.DemoA();
		DemoA pa = new DemoA();
		pa.show();
		packa.DemoB pb = new packa.DemoB();
		//pb.method();
	}

}
/* 总结:
 * 包与包之间的类进行访问，被访问的包中的类必须是public的，被访问的包中的类方法也必须是public的
 * 
 * 			public 		protected 		default		 private
 * 同一类中	  ok			ok			  ok			ok
 * 同一包中	  ok			ok			  ok
 * 子类中		  ok			ok
 * 不同包中 	  ok
 * */
