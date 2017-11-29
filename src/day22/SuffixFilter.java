package day22;

import java.io.File;
import java.io.FilenameFilter;

/**
 * @author ZOOL
 * @version 0.1
 * 文件名过滤器
 * */
public class SuffixFilter implements FilenameFilter {

	//记录需要被过过滤的文件名
	private String fileName;
	
	/** 
	 * @param 通过构造函数，传入你需要过滤的文件名名称
	 * */
	public SuffixFilter(String fileName) {
		this.fileName = fileName;
	}
	
	@Override
	public boolean accept(File dir, String name) {
		return name.endsWith(fileName);
	}

}
