package day20;

import java.io.IOException;

public class RuntimeDemo {

	public static void main(String[] args) throws IOException, InterruptedException {

		/* Runtime:没有构造方法摘要，说明该类不可以创建对象
		 * 又发现还有非静态的方法，说明该类应该提供静态的返回该类对象的方法
		 * 而且只有一个，说明Runtime类使用了单列设计模式
		 * */
		Runtime r = Runtime.getRuntime();
		//r.exec("notepad.exe D:\\ZOOL\\Java\\StudyJavaCore\\src\\day16\\集合类的由来.txt");
		//r.exec("D:\\PotPlayer\\PotPlayerMini64.exe D:\\TDDOWNLOAD\\JavaSE基础视频20\\IO流\\01-IO流(输入流&输出流).mp4");
		//r.exec("D:\\Tencent\\QQ\\Bin\\QQScLauncher.exe");
		Process p = r.exec("mstsc.exe");
		
		Thread.sleep(5000);
		
		p.destroy();
	}

}
