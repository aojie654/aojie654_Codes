package com;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyFrame1 extends JFrame {
	JTextArea textArea = new JTextArea(6, 30);
	JTextField textField = new JTextField(30);
	JPanel panel = new JPanel();
	JButton button = new JButton("����");

	public MyFrame1() {
		super("������");
		this.setLayout(null);
		this.setSize(500, 400);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(3);
		this.setResizable(false);
		this.setVisible(true);

		panel.setLayout(null);
		panel.setBounds(0, 0, 500, 400);
		panel.add(textField);
		panel.add(button);
		panel.add(textArea);
		this.add(panel);

		textArea.setBounds(0, 0, 500, 300);
		textField.setBounds(50, 320, 150, 20);
		button.setBounds(250, 320, 80, 20);

		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				textArea.append("��������˵��" + textField.getText() + "\n");
			}
		});
		// ��Ӽ��̼�������չKeyAdapter�ֻ࣬����д�Լ���Ҫ�ķ���
		

	}

	public static void main(String[] args) {
		new MyFrame1();
	}

}

