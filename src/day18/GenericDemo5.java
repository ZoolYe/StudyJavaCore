package day18;

public class GenericDemo5 {

	public static void main(String[] args) {
		InterImp2<Integer> in2 = new InterImp2<Integer>();
		in2.show(6);
	}

}

//���ͽӿڣ������Ͷ����ڽӿ���
interface Inter<T>{
	public void show(T t);
}

//ʵ�ַ��ͽӿڣ���Ҳ��ָ����������
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