package day23;

import java.io.File;

/* ɾ��һ�������ݵ�Ŀ¼
 * ԭ�����������������ɾ����Ҫ��ȱ���
 * */

public class RemoveDirTest {

	public static void main(String[] args) {
		File dir = new File("C:\\Users\\ZOOL\\Desktop\\Flivver");
		removerDir(dir);
	}

	public static void removerDir(File dir) {
		//dir·���µ������ļ����ļ��ж���
		File []files = dir.listFiles();
		for(File file : files) {
			//���file������Ŀ¼���Ǿͼ�����Ŀ¼��ȱ�������
			if(file.isDirectory()) {
				removerDir(file);
			}else {
				//�������Ŀ¼�Ǿ�ֱ��ɾ�����ļ�
				file.delete();
			}
		}
		//���ɾ���ļ���
		dir.delete();
	}
	
}
