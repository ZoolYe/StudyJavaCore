package day24;

import java.io.File;
import java.io.FilenameFilter;

public class SuffixFilter implements FilenameFilter {

	//Ҫ���˵��ļ�����
	private String fileName;
	
	public SuffixFilter(String fileName) {
		this.fileName = fileName;
	}
	
	@Override
	public boolean accept(File dir, String name) {
		return name.endsWith(fileName);
	}

}
