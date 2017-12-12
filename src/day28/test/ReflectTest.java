package day28.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/* ��������
 * */
public class ReflectTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
		Mainboard mainboard = new Mainboard();
		mainboard.run();
		// ÿ�����һ���豸����Ҫ�޸Ĵ��봫��һ���´����Ķ���
		// mainboard.userPCI(new Sunod());
		// �ܲ��ܲ��޸Ĵ���Ϳ�������������
		// ����new����ɣ������ǻ�ȡ��class�ļ������ڲ�ʵ�ִ�������Ķ���

		// ����һ��File���󣬹��������ļ�
		File configFile = new File("D:\\ZOOL\\Java\\StudyJavaCore\\src\\day28\\test\\pci.properties");

		// ����һ�����ϣ����ڴ洢���ļ��еļ�ֵ����Ϣ
		Properties properties = new Properties();
		// ����һ���ļ��ֽ�����������ȡ�ļ��е�����
		FileInputStream fis = new FileInputStream(configFile);
		// �����е����ݼ��ؽ�������
		properties.load(fis);

		//ѭ����ȡ�ֽ����ļ�
		for (int i = 0; i < properties.size(); i++) {
			String pciName = properties.getProperty("pci"+i);
			//ͨ�������е�ֵ��ȡ�ֽ����ļ�
			Class clazz = Class.forName(pciName);
			//ͨ���ֽ����ļ���������
			PCI pci = (PCI)clazz.newInstance();
			mainboard.userPCI(pci);
		}

	}

}
