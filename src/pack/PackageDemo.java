package pack;
//������ԭ���õ��ĸ��࣬�͵����ĸ���
import packa.*;//����packa���е��������ļ�, ���ǲ��ܵ����Ӱ�

/* packa\abc\*.java
 * import packa.abc.*;
 * */
public class PackageDemo {

	public static void main(String[] args) {
		
		//packa.DemoA pa = new packa.DemoA();
		DemoA pa = new DemoA();
		pa.show();
		packa.DemoB pb = new packa.DemoB();
		//pb.method();
	}

}
/* �ܽ�:
 * �����֮�������з��ʣ������ʵİ��е��������public�ģ������ʵİ��е��෽��Ҳ������public��
 * 
 * 			public 		protected 		default		 private
 * ͬһ����	  ok			ok			  ok			ok
 * ͬһ����	  ok			ok			  ok
 * ������		  ok			ok
 * ��ͬ���� 	  ok
 * */
