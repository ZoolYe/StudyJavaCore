package day18;

public class GenericDemo5 {

	public static void main(String[] args) {
		InterImp2<Integer> in2 = new InterImp2<Integer>();
		in2.show(6);
	}

}

//泛型接口，将泛型定义在接口上
interface Inter<T>{
	public void show(T t);
}

//实现泛型接口，但也不指定具体类型
class InterImp2 <Q> implements Inter<Q>{

	@Override
	public void show(Q q) {
		System.out.println(q);
	}
	
}

class InterImp implements Inter<String>{

	@Override
	public void show(String t) {
		System.out.println(t);
	}
	
}