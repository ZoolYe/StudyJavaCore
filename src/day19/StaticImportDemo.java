package day19;

import java.util.ArrayList;
import java.util.List;

//��̬���룬��ʵ����������еľ�̬��Ա
import static java.util.Collections.sort;
import static java.util.Collections.max;
import static java.lang.System.out;

public class StaticImportDemo {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("abc7");
		list.add("abc1");
		list.add("abc0");
		list.add("abc3");
		out.println(list);
		sort(list);
		out.println(list);
		
		out.println(max(list));
	}

}
