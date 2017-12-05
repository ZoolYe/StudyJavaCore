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
	
	//����һ������
	private Frame f;
	//����һ���ı���
	private TextField tf;
	
	//����һ����ť
	private Button but;
	
	public static void main(String[] args) {
		new MouseAndKeyDemo();
	}

	public MouseAndKeyDemo() {
		init();
		myEvent();
	}

	public void myEvent() {
		
		//���ı�����Ӽ��̼���
		tf.addKeyListener(new KeyAdapter() {
			//���̰��´������¼�
			@Override
			public void keyPressed(KeyEvent e) {
				//��ȡ������
				//String str = e.getKeyText(e.getKeyCode());
				//��ȡ�ڼ����ϰ��µ���
				int code = e.getKeyCode();
				/*if(!(e.VK_0 <= code && e.VK_9 >= code)) {
					System.out.println("��ֻ������0~9֮�������");
					//ȡ���¼�
					e.consume();
				}*/
				if(code == e.VK_ENTER) {
					System.out.println("�س���������");
				}
			}
		});
		
		//���һ�����������¼�
		f.addWindowListener(new WindowAdapter() {
			//���ڵ��˹رհ�ť���������¼�
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		//�ڰ�ť�����һ����������
		but.addMouseListener(new MouseAdapter() {
			private int count = 1;
			//���������¼�
			@Override
			public void mouseEntered(MouseEvent e) {
				//System.out.println("��������"+count++);
				String str = "��������"+count++;
				//tf.setText(str);
			}
			
			//��굥���������¼��������Ҫ˫��
			@Override
			public void mouseClicked(MouseEvent e) {
				//System.out.println("��ť�����");
				String str = "��������"+count++;
				//getClickCount��ȡ������Ĵ���
				if(e.getClickCount()==2) {
					System.out.println("��ť��������2��");
					tf.setText(str);
				}
			}
		});
		
		//��ť��������¼�
		but.addActionListener(new ActionListener() {
			
			//��ť�����£��������¼�
			@Override
			public void actionPerformed(ActionEvent e) {
				//System.out.println("��ť�ĵ���¼�");
			}
		});
	}

	private void init() {
		//ʵ����һ������
		f = new Frame("��ʾ�������¼�����");
		//���ô���Ĵ�С
		f.setBounds(450, 200, 500, 400);
		//����һ����ʽ����
		f.setLayout(new FlowLayout());
		//ʵ����һ���ı�����������
		tf = new TextField(25);
		//ʵ����һ����ť
		but = new Button("��ť");
		//���ı�����ӵ�������
		f.add(tf);
		
		f.add(but);
		//��������ʾ����
		f.setVisible(true);
	}
	
}
