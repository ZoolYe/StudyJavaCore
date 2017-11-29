package day23;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {

	public static void main(String[] args) throws IOException {
		
		/* Map
		 * 	|--Hashtable
		 * 		|--Properties:
		 * Properties����:
		 * �ص㣺
		 * 1���ü����еļ���ֵ�����ַ�������
		 * 2�������е����ݿ��Ա��浽���У����ߴ����л�ȡ
		 * ͨ���ü������ڲ����Լ�ֵ����ʽ���ڵ������ļ�
		 * */
		//propertiesDemo();
		//methodDemo();
		//methodDemo_2();
		//methodDemo_3();
		//myLoad();
		//test();
		test_2();
	}

	public static void test_2() throws IOException {
		//����һ���ļ�����
		File file = new File("C:\\Users\\ZOOL\\Desktop\\fttx.txt");
		//����һ���ļ��ַ���ȡ��
		FileReader fr = new FileReader(file);
		//����һ���ַ���ȡ��������
		BufferedReader buff = new BufferedReader(fr);
		//�ж��ļ��Ƿ����
		if(!file.exists()) {
			//����ļ������� �ʹ���һ��
			file.createNewFile();
		}
		//����һ��Properties���ϣ����ڴ洢�ļ��е�������Ϣ,
		Properties pro = new Properties();
		//���ļ��е����ݼ��ؽ�������
		pro.load(buff);
		pro.list(System.out);
		buff.close();
		//�޸ļ�����keyΪtime��ֵ��Ϣ
		pro.setProperty("time", "��ʱ���������");
		//�������е���Ϣ�����浽�ļ���
		pro.store(new FileWriter(file), "new file");
		
		//�ر���Դ
		buff.close();
	}

	/* �����е������ļ��е���Ϣ�����޸�
	 * ��ȡ����ļ�����������ļ��еļ�ֵ���ݴ洢��������
	 * ��ͨ�����϶����ݽ����޸�
	 * ��ͨ�������޸ĺ�����ݴ洢���ļ���
	 * */
	public static void test() throws IOException {
		//��ȡ����ļ�
		File file = new File("C:\\Users\\ZOOL\\Desktop\\fttx.txt");
		//�ж��ļ��Ƿ���ڣ���������ھʹ���һ��
		if(!file.exists()) {
			file.createNewFile();
		}
		
		BufferedReader br = new BufferedReader(new FileReader(file));
		
		//����һ��Properties���ϣ��洢��Ϣ
		Properties pro = new Properties();
		
		//�����е���Ϣ�洢��������
		String line = null;
		while((line = br.readLine())!=null) {
			if(!line.startsWith("#")) {
				String []list = line.split("=");
				pro.setProperty(list[0], list[1]);
			}
		}
		pro.list(System.out);
		pro.setProperty("time", "Make more time");
		
		BufferedWriter bw = new BufferedWriter(new FileWriter(file));
		pro.store(bw, "new file");
		pro.list(System.out);
	}
	
	//ģ��load����
	public static void myLoad() throws IOException {
		Properties pro = new Properties();
		//String []str = new String[1024];
		//����һ���ļ��ַ���ȡ�������뻺��
		BufferedReader buff = new BufferedReader(new FileReader("C:\\Users\\ZOOL\\Desktop\\fttx.txt"));
		String line = null;
		//ͨ���������ķ�����ÿ�ζ�ȡһ��
		while((line = buff.readLine())!=null) {
			//�ж��ַ����Ƿ���#��ͷ
			if(!line.startsWith("#")) {
				//������ǣ��ͽ�����ַ�����=�����и�и��꣬���ص���һ���ַ�������
				String []arr = line.split("=");
				//System.out.println(arr[0]+" : "+arr[1]);
				pro.setProperty(arr[0], arr[1]);
			}
		}
		buff.close();
		pro.list(System.out);
	}
	
	public static void methodDemo_3() throws IOException {
		
		Properties pro = new Properties();
		//�����е�����������һ���ļ�
		//ע�⣺����Ҫ��֤���ļ��е������Ǽ�ֵ��
		//��Ҫʹ�õ���ȡ��
		FileInputStream fis = new FileInputStream("C:\\Users\\ZOOL\\Desktop\\fttx.txt");//�ֽ��ļ�������
		//���ļ��е����ݼ��ص�������
		pro.load(fis);
		pro.list(System.out);
	}

	public static void methodDemo_2() throws IOException {
		Properties pro = new Properties();
		pro.setProperty("csidbo", "zll19991219");
		pro.setProperty("sa", "Sa123456");
		pro.setProperty("fttx1", "8001");
		pro.setProperty("fttx2", "8020");
		pro.setProperty("fttx3", "19001");
		
		//��Ҫ����Щ�����е��ַ�����ֵ��Ϣ�־û��洢���ļ���
		//��Ҫ���������
		FileOutputStream fos = new FileOutputStream("C:\\Users\\ZOOL\\Desktop\\fttx.txt");//�ֽ��ļ������
		
		//�������е����ݴ洢���ļ��У�ʹ��store����
		pro.store(fos, new String("key+value"));
		fos.close();
	}

	public static void methodDemo() {
		Properties pro = new Properties();
		pro.setProperty("csidbo", "zll19991219");
		pro.setProperty("sa", "Sa123456");
		pro.setProperty("fttx1", "8001");
		pro.setProperty("fttx2", "8020");
		pro.setProperty("fttx3", "19001");
		
		//�������б������ָ������������˷����Ե��Ժ�����
		pro.list(System.out);
	}
	
	/* Properties���ϵĴ��ȡ
	 * */
	public static void propertiesDemo() {
		
		//����һ��Properties ��Map����
		Properties pro = new Properties();
		//�洢Ԫ��
		pro.setProperty("csidbo", "zll19991219");
		pro.setProperty("sa", "Sa123456");
		pro.setProperty("fttx1", "8001");
		pro.setProperty("fttx2", "8020");
		pro.setProperty("fttx3", "19001");
		
		//�޸�Ԫ�أ�����ͬ��ֵ����
		pro.setProperty("sa", "sa");
		
		//ͨ��key��ȡֵ
		//String paws = pro.getProperty("csidbo");
		//System.out.println(paws);
		
		//���ü���������Ԫ��ӳ�䵽Set������
		Set<String> keys = pro.stringPropertyNames();
		for(String key : keys) {
			String value = pro.getProperty(key);
			System.out.println(value);
		}
	}
}
