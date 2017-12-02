package day24;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo {

	public static void main(String[] args) throws IOException {
		/* RandomAccessFile:
		 * ����IO��ϵ�е�����
		 * �ص㣺
		 * 1���ö����ܶ�������д
		 * 2���ö����ڲ�ά����һ��byte���飬��ͨ��ָ����Բ��������е�Ԫ��
		 * 3������ͨ��getFilePointer������ȡָ���λ�ã���ͨ��seek����ָ���λ��
		 * 4����ʵ�ö�����ǽ��ֽ����������ֽ�����������˷�װ
		 * 5���ö����Դ����Ŀ��ֻ�����ļ���ͨ�����캯�����Ϳ��Կ���
		 * */
		//writeFile();
		readFile();
		//randomWrite();
	}
	
	public static void randomWrite() throws IOException {
		RandomAccessFile raf = new RandomAccessFile("C:\\\\Users\\\\ZOOL\\\\Desktop\\\\racc.r", "rw");
		raf.seek(16);
		raf.write("����".getBytes());
		raf.writeInt(12);
		raf.close();
	}
	
	public static void readFile() throws IOException {
		RandomAccessFile raf = new RandomAccessFile("C:\\\\Users\\\\ZOOL\\\\Desktop\\\\racc.r", "r");
		raf.seek(16);//����ָ���λ�þ�������Ķ�ȡ
		byte []buf = new byte[4];
		raf.read(buf);
		int age = raf.readInt();
		String name = new String(buf);
		System.out.println(name);
		System.out.println(age);
		
		//��ȡָ���λ��
		System.out.println(raf.getFilePointer());
	}
	//ʹ��RandomAccessFile����д��һЩ��Ա��Ϣ
	public static void writeFile() throws IOException {
		//����ļ������ڣ��򴴽�������ļ����ڣ�������, rw ��д
		RandomAccessFile raf = new RandomAccessFile("C:\\Users\\ZOOL\\Desktop\\racc.r", "rw");
		raf.write("����".getBytes());
		raf.writeInt(97);
		raf.write("����".getBytes());
		raf.writeInt(99);
		raf.close();
	}
	
}
