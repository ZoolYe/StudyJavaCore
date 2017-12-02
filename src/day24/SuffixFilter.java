package day24;

import java.io.File;
import java.io.FilenameFilter;

public class SuffixFilter implements FilenameFilter {

	//要过滤的文件名称
	private String fileName;
	
	public SuffixFilter(String fileName) {
		this.fileName = fileName;
	}
	
	@Override
	public boolean accept(File dir, String name) {
		return name.endsWith(fileName);
	}

}
