package day24;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataSteamDemo {

	public static void main(String[] args) throws IOException {

		//writeData();
		readData();
	}

	public static void readData() throws IOException {
		DataInputStream dis = new DataInputStream(new FileInputStream("C:\\Users\\ZOOL\\Desktop\\data.txt"));
		String str = dis.readUTF();
		System.out.println(str);
	}

	public static void writeData() throws IOException {
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("C:\\Users\\ZOOL\\Desktop\\data.txt"));
		dos.writeUTF("ÄãºÃ");
		dos.close();
	}

}
