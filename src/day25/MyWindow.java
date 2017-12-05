package day25;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Properties;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MyWindow extends JFrame {

	private static final String LINE_SEPARATOR = System.getProperty("line.separator");
	private JPanel contentPane;
	private JTextField textField;
	private JButton btnNewButton;
	private JTextArea textArea;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyWindow frame = new MyWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MyWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int keyCode = e.getKeyCode();
				if(keyCode==e.VK_ENTER) {
					fileList();
				}
			}
		});
		textField.setBounds(10, 10, 311, 29);
		contentPane.add(textField);
		textField.setColumns(10);
		
		btnNewButton = new JButton("\u8F6C\u5230");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//通过点击按钮获取文本框中的目录,将目录中的内容显示到文本区域中
				fileList();
			}
		});
		
		btnNewButton.setBounds(331, 10, 93, 29);
		contentPane.add(btnNewButton);
		
		textArea = new JTextArea();
		textArea.setBounds(10, 49, 414, 203);
		contentPane.add(textArea);
	}
	
	
	private void fileList() {
		
		String dir_str = textField.getText();
		File dir_file = new File(dir_str);
		if(dir_file.exists() && dir_file.isDirectory()) {
			textArea.setText("");
			String []files = dir_file.list();
			for(String file : files) {
				textArea.append(file+LINE_SEPARATOR);
			}
		}
		
	}
	
}
