package day18;

/*
public class Tool {

	private Object obj;
	
	public void setObject(Object obj) {
		this.obj = obj;
	}
	
	public Object getObject() {
		return this.obj;
	}
	
}
*/

//��jdk1.5��ʹ�÷�������������Ҫ������������������
//�����ࡣʲôʱ���ã������в����������������Ͳ�ȷ����ʱ�򣬾�ʹ�÷�������ʾ
public class Tool<QQ>{
	private QQ object;

	public QQ getObject() {
		return object;
	}

	public void setObject(QQ object) {
		this.object = object;
	}
	
	//�����Ͷ����ڷ����ϣ������Զ���
	public <WW> void show(WW ww) {
		System.out.println("show:"+ww);
	}
	
	//���͸��Ŷ����ߵ�
	public void print(QQ q) {
		System.out.println("print:"+q);
	}
	
	/* ��������̬����ʱ�����ܷ������϶���ķ��͡������̬����ʹ�÷��ͣ�ֻ�ܽ����Ͷ����ڷ�����
	 * */
	public static <DD> void method(DD dd) {
		System.out.println("method"+dd);
	}
}