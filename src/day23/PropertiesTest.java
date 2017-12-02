package day23;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/* ���幦�ܣ���ȡһ��Ӧ�ó�������д������������5�Σ�����ʹ�ô����ѵ���ע�����ʾ������Ҫ�����г���
 * ˼·��
 * 1��Ӧ���м�����
 * ÿ�γ�����������Ҫ����һ�Σ���������ԭ�еĴ����Ͻ��м���
 * 2������������һ����������������ʱ����м���������������������ڴ沢��������
 * ���ǳ���һ����������������ʧ�ˣ���ô�ٴ������ó��򣬼����������±���ʼ����
 * ��������Ҫ�������ͬһ��Ӧ�ó���ʹ�õ���ͬһ���������������Ҫ���������������ڱ䳤
 * ���ڴ�洢��Ӳ���ļ���
 * 3�����ʹ������������أ�
 * ���ȣ���������ʱ��Ӧ���ȶ�ȡ������ڼ�¼��������Ϣ�������ļ�
 * ��ȡ��һ�μ������������������ô������ж�
 * ��Σ��Ըô���������������������Ĵ������´洢�������ļ���
 * 4���ļ��е���Ϣ����ν��д洢������
 * ֱ�Ӵ洢����ֵ���ԣ����ǲ���ȷ�����ݵĺ��壬���������־ͱ�ú���Ҫ
 * ����������ֺ�ֵ�Ķ�Ӧ�����Կ���ʹ�ü�ֵ��
 * ӳ���ϵMap���Ͽ��Ը㶨������Ҫ��ȡӲ���ϵ����ݣ�����Map+IO = Properties
 * */
public class PropertiesTest {

	public static void main(String[] args) throws IOException {
		
		getAppCount();
	}

	public static void getAppCount() throws IOException {
		
		//�������ļ���װ��File����
		File config = new File("C:\\Users\\ZOOL\\Desktop\\config.properties");
		//����ļ������ھʹ���һ��
		if(!config.exists()) {
			config.createNewFile();
		}
		//�ļ������ֽ��������ļ���
		FileInputStream fis = new FileInputStream(config);
		//�������ϣ����ڴ洢�ļ��е�������Ϣ
		Properties pro = new Properties();
		//���ļ��е����ݼ��ؽ�������
		pro.load(fis);
		
		//ͨ������ȡ�����е�ֵ
		String value = pro.getProperty("time");
		
		
		
		//�������������¼��ȡ���Ĵ���
		int count = 0;
		//���ֵ��Ϊ�գ��ͽ�ֵ��ֵ��������
		if(value!=null) {
			count = Integer.parseInt(value);
			
			//����������г���5�Σ����˳������
			if(count == 5) {
				System.out.println("�������ʹ�������ѵ�����ע��");
				System.exit(0);
			}
		}
		count++;
		//���ı��Ĵ��������´洢��������
		pro.setProperty("time", Integer.toString(count));
		//�������е����ݴ洢���ļ���
		pro.store(new FileWriter(config),"config file");
		
	}

}