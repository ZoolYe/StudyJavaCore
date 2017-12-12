package day28.test;

public class Mainboard {

	public void run() {
		System.out.println("主板运行了");
	}
	
	public void userPCI(PCI pci) {
		pci.open();
		pci.close();
	}
	
}
