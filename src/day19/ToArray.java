package day19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ToArray {

	public static void main(String[] args) {
		
		/* ����ת����
		 * Collection�ӿ��е�toArray()����
		 * ����ת�����飬���ԶԼ����е�Ԫ�ز����ķ��������޶�����������������ɾ
		 * */
		
		List<String> list = new ArrayList<String>();
		list.add("avc1");
		list.add("avc2");
		list.add("avc3");
		
		/* toArray������Ҫ����һ��ָ�����͵�����
		 * ���ȸ���ζ����أ�
		 * �������С�ڸü��ϵ�size����ô�÷����ᴴ��һ��ͬ���Ͳ��ͼ�����ͬsize������
		 * ������ȴ��ڸü��ϵ�size����ô�÷����ͻ�ʹ��ָ�������飬�洢�����е�Ԫ�أ�����λ��Ĭ��Ϊnull
		 * ���Խ��飬��������ĳ���Ϊ���ϵ�size
		 * */
		String []str = list.toArray(new String[list.size()]);
		//Arrays.toString ������ת���ַ���
		System.out.println(Arrays.toString(str));
	}

}
