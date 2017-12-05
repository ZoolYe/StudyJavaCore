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

		Frame f = new Frame("文件切割合并器");
		//设置窗体的宽和高
		//f.setSize(500, 400);
		//设置窗体在屏幕中的位置，距左边，距上边
		//f.setLocation(450, 200);
		//参数1，距左边，距上边，参数2，宽，高
		f.setBounds(450, 200, 500, 400);
		//设置一个流式布局
		f.setLayout(new FlowLayout());
		//创建一个按钮
		Button butSplitFile = new Button("切割文件");
		//创建一个按钮
		Button butMergeFile = new Button("合并文件");
		//将按钮添加到窗体中
		f.add(butSplitFile);
		//将按钮添加到窗体中
		f.add(butMergeFile);
		
		//将窗体添加一个事件监听器，
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				//如果用户点击了窗体关闭按钮，就退出虚拟机
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
		
		//将按钮添加一个事件监听器，添加一个动作监听器
		butSplitFile.addActionListener(new ActionListener() {
			//当用户按下按钮之后会触发此事件
			@Override
			public void actionPerformed(ActionEvent e) {
				SplitFileDemo sf = new SplitFileDemo();
				File file = new File("C:\\Users\\ZOOL\\Downloads\\客户邮件培训.exe");
				try {
					sf.splitFile_2(file);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				System.out.println("用户点击了按钮");
			}
		});
		f.setVisible(true);
	}

}
