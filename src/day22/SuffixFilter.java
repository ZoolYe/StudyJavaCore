package day22;

import java.io.File;
import java.io.FilenameFilter;

/**
 * @author ZOOL
 * @version 0.1
 * �ļ���������
 * */
public class SuffixFilter implements FilenameFilter {

	//��¼��Ҫ�������˵��ļ���
	private String fileName;
	
	/** 
	 * @param ͨ�����캯������������Ҫ���˵��ļ�������
	 * */
	public SuffixFilter(String fileName) {
		this.fileName = fileName;
	}
	
	@Override
	public boolean accept(File dir, String name) {
		return name.endsWith(fileName);
	}

}
