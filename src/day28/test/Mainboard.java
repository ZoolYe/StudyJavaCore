package day28.test;

public class Mainboard {

	public void run() {
		System.out.println("����������");
	}
	
	public void userPCI(PCI pci) {
		pci.open();
		pci.close();
	}
	
}
