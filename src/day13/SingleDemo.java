package day13;

public class SingleDemo {

	public static void main(String[] args) {

	}

}

//多线程下的单例

//饿汉式
 class Single{
	 
	 private Single() {
		 
	 }
	 
	 private static final Single s = new Single();
	 
	 public static Single getInstance() {
		 return s;
	 }
 }
 
 //懒汉式
 class Single2{
	 private Single2() {
		 
	 }
	 
	 private static Single2 s = null;
	 
	 public static Single2 getInstance() {
		 
		 if(s==null) {
			 synchronized (Single2.class) {
				if(s==null) {
				 	s = new Single2();
				 }
			 
			 }
		 }
		 return s;
	 }
 }