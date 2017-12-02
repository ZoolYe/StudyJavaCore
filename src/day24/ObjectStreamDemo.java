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
		//����ķ����л�
		Persion p = (Persion)ois.readObject();
		System.out.println(p.getName()+" : "+p.getAge());
		ois.close();
	}

	public static void writeObj() throws IOException, IOException {
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\ZOOL\\Desktop\\obj.object"));
		//��������л������������д洢��Ӳ���ϣ������л��Ķ��󣬱���ʵ�֣�Serializable�ӿ�
		oos.writeObject(new Persion("Сǿ", 30));
		oos.close();
	}

}
