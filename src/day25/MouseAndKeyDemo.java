package day25;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MouseAndKeyDemo {
	
	//创建一个窗体
	private Frame f;
	//创建一个文本框
	private TextField tf;
	
	//定义一个按钮
	private Button but;
	
	public static void main(String[] args) {
		new MouseAndKeyDemo();
	}

	public MouseAndKeyDemo() {
		init();
		myEvent();
	}

	public void myEvent() {
		
		//给文本框添加键盘监听
		tf.addKeyListener(new KeyAdapter() {
			//键盘按下触发此事件
			@Override
			public void keyPressed(KeyEvent e) {
				//获取键盘码
				//String str = e.getKeyText(e.getKeyCode());
				//获取在键盘上按下的码
				int code = e.getKeyCode();
				/*if(!(e.VK_0 <= code && e.VK_9 >= code)) {
					System.out.println("你只能输入0~9之间的数字");
					//取消事件
					e.consume();
				}*/
				if(code == e.VK_ENTER) {
					System.out.println("回车键被按下");
				}
			}
		});
		
		//添加一个监听窗体事件
		f.addWindowListener(new WindowAdapter() {
			//窗口点了关闭按钮，触发此事件
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		//在按钮上添加一个鼠标监听器
		but.addMouseListener(new MouseAdapter() {
			private int count = 1;
			//监听进入事件
			@Override
			public void mouseEntered(MouseEvent e) {
				//System.out.println("鼠标进入了"+count++);
				String str = "鼠标进入了"+count++;
				//tf.setText(str);
			}
			
			//鼠标单击触发此事件，如果需要双击
			@Override
			public void mouseClicked(MouseEvent e) {
				//System.out.println("按钮点击了");
				String str = "鼠标进入了"+count++;
				//getClickCount获取鼠标点击的次数
				if(e.getClickCount()==2) {
					System.out.println("按钮被单击了2此");
					tf.setText(str);
				}
			}
		});
		
		//按钮点击触发事件
		but.addActionListener(new ActionListener() {
			
			//按钮被按下，触发此事件
			@Override
			public void actionPerformed(ActionEvent e) {
				//System.out.println("按钮的点击事件");
			}
		});
	}

	private void init() {
		//实例化一个窗体
		f = new Frame("演示鼠标键盘事件监听");
		//设置窗体的大小
		f.setBounds(450, 200, 500, 400);
		//设置一个流式布局
		f.setLayout(new FlowLayout());
		//实例化一个文本框，设置列数
		tf = new TextField(25);
		//实例化一个按钮
		but = new Button("按钮");
		//将文本框添加到窗体中
		f.add(tf);
		
		f.add(but);
		//将窗体显示出来
		f.setVisible(true);
	}
	
}
