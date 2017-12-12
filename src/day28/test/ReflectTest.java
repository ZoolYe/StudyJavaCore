package day28.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/* 电脑运行
 * */
public class ReflectTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
		Mainboard mainboard = new Mainboard();
		mainboard.run();
		// 每次添加一个设备都需要修改代码传递一个新创建的对象
		// mainboard.userPCI(new Sunod());
		// 能不能不修改代码就可以完成这个动作
		// 不用new来完成，而是是获取其class文件，在内部实现创建对象的动作

		// 创建一个File对象，关联配置文件
		File configFile = new File("D:\\ZOOL\\Java\\StudyJavaCore\\src\\day28\\test\\pci.properties");

		// 创建一个集合，用于存储，文件中的键值对信息
		Properties properties = new Properties();
		// 创建一个文件字节输入流，读取文件中的数据
		FileInputStream fis = new FileInputStream(configFile);
		// 将流中的数据加载进集合中
		properties.load(fis);

		//循环获取字节码文件
		for (int i = 0; i < properties.size(); i++) {
			String pciName = properties.getProperty("pci"+i);
			//通过集合中的值获取字节码文件
			Class clazz = Class.forName(pciName);
			//通过字节码文件产生对象
			PCI pci = (PCI)clazz.newInstance();
			mainboard.userPCI(pci);
		}

	}

}
