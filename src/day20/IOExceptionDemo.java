package day20;

import java.io.FileWriter;
import java.io.IOException;

public class IOExceptionDemo {

	public static void main(String[] args){
		
		FileWriter fw = null;
		
		try {
			
			fw = new FileWriter("k:\\demo.txt", true);

			fw.write("Ҷ��" + System.getProperty("line.separator") + "��");
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			
			try {
				if(fw != null) {
					fw.close();
				}
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
	}

}
