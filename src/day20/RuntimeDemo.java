package day20;

import java.io.IOException;

public class RuntimeDemo {

	public static void main(String[] args) throws IOException, InterruptedException {

		/* Runtime:û�й��췽��ժҪ��˵�����಻���Դ�������
		 * �ַ��ֻ��зǾ�̬�ķ�����˵������Ӧ���ṩ��̬�ķ��ظ������ķ���
		 * ����ֻ��һ����˵��Runtime��ʹ���˵������ģʽ
		 * */
		
		//��ȡRuntimeʵ��
		Runtime r = Runtime.getRuntime();
		//r.exec("notepad.exe D:\\ZOOL\\Java\\StudyJavaCore\\src\\day16\\�����������.txt");
		//r.exec("D:\\PotPlayer\\PotPlayerMini64.exe D:\\TDDOWNLOAD\\JavaSE������Ƶ20\\IO��\\01-IO��(������&�����).mp4");
		//r.exec("D:\\Tencent\\QQ\\Bin\\QQScLauncher.exe");
		
		//ͨ��Runtimeʵ����ִ��ָ�����򣬷���һ������
		Process p = r.exec("cmd.exe");
		
		Thread.sleep(5000);
		
		//���ٴ˽����еĳ���
		p.destroy();
	}

}