package day25;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;

import day24.MergeFile;
import day24.SplitFileDemo;

public class FrameDemo {

	public static void main(String[] args) {

		Frame f = new Frame("�ļ��и�ϲ���");
		//���ô���Ŀ�͸�
		//f.setSize(500, 400);
		//���ô�������Ļ�е�λ�ã�����ߣ����ϱ�
		//f.setLocation(450, 200);
		//����1������ߣ����ϱߣ�����2������
		f.setBounds(450, 200, 500, 400);
		//����һ����ʽ����
		f.setLayout(new FlowLayout());
		//����һ����ť
		Button butSplitFile = new Button("�и��ļ�");
		//����һ����ť
		Button butMergeFile = new Button("�ϲ��ļ�");
		//����ť��ӵ�������
		f.add(butSplitFile);
		//����ť��ӵ�������
		f.add(butMergeFile);
		
		//���������һ���¼���������
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				//����û�����˴���رհ�ť�����˳������
				System.exit(0);
			}
		});
		
		butMergeFile .addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				File dir = new File("C:\\Users\\ZOOL\\Desktop\\files");
				MergeFile mf = new MergeFile();
				try {
					mf.mergeFile_2(dir);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		//����ť���һ���¼������������һ������������
		butSplitFile.addActionListener(new ActionListener() {
			//���û����°�ť֮��ᴥ�����¼�
			@Override
			public void actionPerformed(ActionEvent e) {
				SplitFileDemo sf = new SplitFileDemo();
				File file = new File("C:\\Users\\ZOOL\\Downloads\\�ͻ��ʼ���ѵ.exe");
				try {
					sf.splitFile_2(file);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				System.out.println("�û�����˰�ť");
			}
		});
		f.setVisible(true);
	}

}
