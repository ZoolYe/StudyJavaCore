package day03;

public class OperateDemo3 {

	public static void main(String[] args) {
		
		//�Ƚ������������Ľ��������true����false
		System.out.println(2<3);
		System.out.println(3!=2);
		
		/*
		 * �߼������������������boolean���͵ı��ʽ
		 * &���� (��������Ľ��ֻҪ��һ��Ϊfalse�����Ϊfalse��ֻ�����߶�Ϊtrue�������true)
		 * |:�� (��������Ľ��ֻҪ��һ��Ϊtrue�����Ϊtrue�����߶�Ϊfalse�������false)
		 * ^:���(���߽����ͬ���Ϊfalse����������ͬ�������true)
		 * !:��(!true = false !false = true)
		 * &&:��·��(��&��������һ�����������룬���������Ľ��Ϊfalseʱ���ұ߲���������)
		 * ||:��·��(��|������һ�����������ڣ������������Ϊtrueʱ���ұ߲���������)
		 * ~
		*/
		int x = 6;
		System.out.println(6&3);
	}

}