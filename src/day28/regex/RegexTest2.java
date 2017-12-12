package day28.regex;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/* ��ҳ���棺��ʵ��һ�����������ڻ�������ȥ��ȡ����ָ�����������
 * ��ȡ�����ַ
 * */
public class RegexTest2 {

	public static void main(String[] args) throws IOException {
		/*List<String> list = getMails();
		*/
		
		List<String> list = getMailsByWeb();
		for(String str : list) {
			System.out.println(str);
		}
	}

	public static List<String> getMailsByWeb() throws IOException {
		
		URL url = new URL("http://www.zoolye.com/");
		BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
		String regex = "\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*";
		Pattern p = Pattern.compile(regex);
		List<String> list = new ArrayList<>();
		String line = null;
		while((line = br.readLine())!=null) {
			Matcher m = p.matcher(line);
			m.find();
			list.add(m.group());
		}
		
		return list;
	}

	public static List<String> getMails() throws IOException {
		
		//1����ȡԴ�ļ�
		File file = new File("c:\\users\\zool\\desktop\\�ʼ���ַ.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		//2���Զ�ȡ�����ݽ��й����ƥ�䣬���л�ȡ���Ϲ��������
		String regex = "\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*";
		Pattern p = Pattern.compile(regex);
		ArrayList<String> al = new ArrayList<>();
		String line = null;
		while((line = br.readLine())!=null) {
			Matcher m = p.matcher(line);
			m.find();
			al.add(m.group());
		}
		//3�������Ϲ�������ݴ洢��������
		return al;
	}
	
}
