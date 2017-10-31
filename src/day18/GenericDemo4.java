package day18;

public class GenericDemo4 {

	public static void main(String[] args) {

		Tool<String> tl = new Tool<String>();
		//tl.setObject("hehe");
		tl.show("haha");
		tl.show(new Persion());
		Tool.method(67);
		Tool.method("67");
	}

}
