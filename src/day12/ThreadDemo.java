package day12;
/* 进程：正在进行中的程序(直译)
 * 线程：就是进程中一个负责程序执行的控制单元(执行路径)
 * 一个进程中可以有多个执行路径，称为多线程
 * 一个进程当中至少有一个线程
 * 开启多个线程是为了同时运行多部分代码
 * 每一个线程都有自己运行的内容，这个内容可以称为线程要执行的任务
 * 多线程好处:解决了多部分同时运行的问题
 * 多线程弊端：线程太多回到效率的降低
 * 其实应用程序的执行都是cpu在做着快速的切换完成的，这个切换时随机的
 * 
 * jvm启动时就启动了多个线程，至少有两个线程可以分析出来
 * 1，执行main函数的线程：该线程的任务代码都定义在main函数中
 * 2，负责垃圾回收的线程
 * 
 * */
public class ThreadDemo {

	public static void main(String[] args) {
		
		new Zool();
		new Zool();
		new Zool();
		System.gc();
		System.out.println("main");
	}

}
class Zool{
	public void finalize() {
		System.out.println("zool ok");
	}
}
