package day27.ie;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

public class MyBrowser {

	public static void main(String[] args) throws IOException {
		
		String url_str = "http://www.zoolye.com/";
		URL url = new URL(url_str);
		
		/*System.out.println("getProtocol:"+url.getProtocol());
		System.out.println("getHost:"+url.getHost());
		System.out.println("getPort:"+url.getPort());
		System.out.println("getFile:"+url.getFile());
		System.out.println("getPath:"+url.getPath());
		System.out.println("getQuery:"+url.getQuery());*/
		
		//获取URL对象的URL连接器对象，将连接封装成了对象
		URLConnection url_con = url.openConnection();
		System.out.println(url_con);
		/*BufferedInputStream bufIn = new BufferedInputStream(url.openStream());
		byte []buf = new byte[1024];
		int len = 0;
		while((len = bufIn.read(buf))!=-1) {
			String str = new String(buf,0,len);
			System.out.println(str);
		}*/
	}

}
