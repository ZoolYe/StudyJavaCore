package day18;

/*
public class Tool {

	private Object obj;
	
	public void setObject(Object obj) {
		this.obj = obj;
	}
	
	public Object getObject() {
		return this.obj;
	}
	
}
*/

//在jdk1.5后，使用泛型来接收类中要操作的引用数据类型
//泛型类。什么时候用？当类中操作的引用数据类型不确定的时候，就使用泛型来表示
public class Tool<QQ>{
	private QQ object;

	public QQ getObject() {
		return object;
	}

	public void setObject(QQ object) {
		this.object = object;
	}
	
	//将泛型定义在方法上，泛型自定义
	public <WW> void show(WW ww) {
		System.out.println("show:"+ww);
	}
	
	//泛型跟着对象走的
	public void print(QQ q) {
		System.out.println("print:"+q);
	}
	
	/* 当方法静态方法时，不能访问类上定义的泛型。如果静态方法使用泛型，只能将泛型定义在方法上
	 * */
	public static <DD> void method(DD dd) {
		System.out.println("method"+dd);
	}
}