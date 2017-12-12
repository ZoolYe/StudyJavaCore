package day28.test;

public class Mouse implements PCI {

	@Override
	public void open() {
		System.out.println("鼠标开启了");
	}

	@Override
	public void close() {
		System.out.println("鼠标关闭了");
	}

}
