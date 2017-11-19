package day21;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyTextTest2 {

	public static void main(String[] args) {
		
		FileReader fr = null;
		FileWriter fw = null;
		
		 try {
			//����һ���ַ���ȡ�����ļ������
			fr = new FileReader("k:\\�ĵ�\\��ͨ����.txt");
			
			//����һ���ַ�������������þ���·��
			fw = new FileWriter("k:\\�ĵ�\\�Ҳ�����Ƶ�.txt");
			
			//����һ����ʱ���������ڻ����ȡ�����ַ�
			char []chr = new char[1024];
			int len = 0;
			while((len = fr.read(chr))!=-1) {
				fw.write(chr,0,len);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		 finally {
			 
			 try {
			//�ر���Դ��������ص���Դ���ļ���ɾ������
			 if(fr!=null)
				 fr.close();
			 if(fw!=null)
				 fw.close();
			/*while(true) {
				fw.flush();
			}*/
			
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		 }
		 
		 
	}

}
