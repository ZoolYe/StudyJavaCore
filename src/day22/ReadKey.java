package day22;

import java.io.IOException;
import java.io.InputStream;

public class ReadKey {

	public static void main(String[] args) throws IOException {
		/* ��ȡһ������¼������ݣ�����ӡ�ڿ���̨��
		 * ���̱������һ����׼�������豸
		 * ����Java���ԣ��������������豸���ж�Ӧ�Ķ���
		 * */
		//readKey();
		readKey2();
	}

	public static void readKey2() throws IOException {
		/* ��ȡ�û�����¼�������
		 * �������ݱ�ɴ�д��ʾ�ڿ���̨��
		 * ����û��������over����������¼��
		 * */
		//��ȡ���̶�ȡ��
		InputStream in = System.in;
		//�������������ڴ洢�û����������
		StringBuilder sb = new StringBuilder();
		
		int ch = 0;
		while((ch = in.read())!=-1) {
			//�����ȡ����\r���ͺ��Դ��ַ�����Ϊ��win�»س�����\r\n��ɵ�
			if(ch=='\r')
				continue;
			//�����ȡ���˻س����Ǿ�Ҫ�жϻس�ǰ���ַ��Ƿ��������ַ�
			if(ch=='\n') {
				//����һ����ʱ������¼ס��ȡ�����ַ�
				String temp = sb.toString();
				//�ж������Ƿ����
				if(temp.equals("over"))
					//�������������ͽ���
					break;
				//���������������ȡ�����ַ�ת�ɴ�д
				System.out.println(temp.toUpperCase());
				//����Ҫ֮ǰ��ȡ���ַ�������Ҫ��ջ�����
				sb.delete(0, sb.length());
			}
			//���û�ж���\r\n�ͽ��������ַ����뵽������
			else {
				//��intת��char
				sb.append((char)ch);
			}
		}
			
	}

	public static void readKey() throws IOException {
		InputStream in = System.in;
		int ch = in.read();//����ʽ��ʽ
		System.out.println(ch);
		int ch1 = in.read();
		System.out.println(ch1);
		int ch2 = in.read();
		System.out.println(ch2);
	}

}
