package day15;
/* StringBuffer:�����ַ���������
 * ���ڴ洢���ݵ�����
 * �ص㣺
 * 1�������ǿɱ��
 * 2�����Դ洢��ͬ���͵�����
 * 3������Ҫת���ַ�������ʹ��
 * 4�����Զ��ַ��������޸�
 * 
 * ��Ȼ��һ��������Ӧ�þ߱�һЩ����
 * 1����ӣ�
 * 		StringBuffer append(data);
 * 		StringBuffer inster(index,data);
 * 2��ɾ����
 * 		StringBuffer delete(start,end);����ͷ��������β
 * 		StringBuffer deleteCharAt(index);ɾ��ָ��λ���ϵ�Ԫ��
 * 3�����ң�
 * 		char charAt(index);
 * 		int indexOf(string);
 * 		int lastIndexOf(string);
 * 4���޸ģ�
 * 		StringBuffer replace(start,end.string);
 * 		void setCharAt(index,char);
 * */
public class StringBufferDemo {

	public static void main(String[] args) {
		//bufferMethodDemo();
		bufferMethodDemo2();
	}

	public static void bufferMethodDemo2() {
		StringBuffer sb = new StringBuffer("abcdefsdhsdg");
		/*sb.delete(1, 3);
		sb.deleteCharAt(2);
		//��ջ�����
		sb.delete(0, sb.length());*/
		sb.replace(1, 5, "wocaojava");
		sb.setCharAt(1, ' ');
		
		//���ó��ȣ��ڿհ׵ĵط�����ӿհ��ַ�
		sb.setLength(100);
		
		//�ַ�����ת
		sb.reverse();
		System.out.println(sb);
	}

	public static void bufferMethodDemo() {
		//��������������
		StringBuffer sb = new StringBuffer("caonima");
		sb.append("hehhe").append("1").append("java");
		sb.append(true);
		sb.insert(2,99);
		System.out.println(sb);
		
	}
	
}
