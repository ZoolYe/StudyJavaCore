package day28.test;

public class Sunod implements PCI {

	@Override
	public void open() {
		System.out.println("声卡开启了");
	}

	@Override
	public void close() {
		System.out.println("声卡关闭了");
	}

}
