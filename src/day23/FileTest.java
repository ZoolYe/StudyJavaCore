package day23;

import java.io.File;

/* ���󣺶�ָ����Ŀ¼�����������ݵ��г���������Ŀ¼�е�����
 * Ҳ�������Ϊ��ȱ���
 * */
public class FileTest {

	public static void main(String[] args) {
		File dir = new File("D:\\ZOOL\\Java\\Flivver");
		listAll(dir);
	}

	public static void listAll(File dir) {
		//��ȡָ��Ŀ¼�µ�ǰ�������ļ��л����ļ�����
		File []files = dir.listFiles();
		
		for(int i=0; i<files.length; i++) {
			//�ж�File�����Ƿ���һ���ļ���
			if(files[i].isDirectory()) {
				//System.out.println("dir: "+files[i]);
				//������ļ��У��ٴε��ô˷���������File�����ٴ��������
				listAll(files[i]);
			}
			else
				System.out.println("file: "+files[i]);
		}
		/*for(File file : files) {
			System.out.println(file.getAbsolutePath());
		}*/
	}

}
