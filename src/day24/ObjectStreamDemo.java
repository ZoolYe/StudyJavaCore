package day24;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectStreamDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		//writeObj();
		readObj();
	}

	public static void readObj() throws IOException, IOException, ClassNotFoundException {
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\\\Users\\\\ZOOL\\\\Desktop\\\\obj.object"));
		//对象的反序列化
		Persion p = (Persion)ois.readObject();
		System.out.println(p.getName()+" : "+p.getAge());
		ois.close();
	}

	public static void writeObj() throws IOException, IOException {
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\ZOOL\\Desktop\\obj.object"));
		//对象的序列化，将对象排列存储到硬盘上，被序列化的对象，必须实现，Serializable接口
		oos.writeObject(new Persion("小强", 30));
		oos.close();
	}

}
