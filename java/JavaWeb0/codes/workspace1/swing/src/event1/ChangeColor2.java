package event1;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ChangeColor2 extends JFrame {
	JPanel p;
	JButton btnRed, btnGreen, btnYellow;

	public ChangeColor2() {
		super("�¼�����-�ı���ɫ");

		// �������
		p = new JPanel();
		btnRed = new JButton("��ɫ");
		btnGreen = new JButton("��ɫ");
		btnYellow = new JButton("��ɫ");

		//2. ����һ����������
		Button1Listener btn1Listener = new Button1Listener();
		Button2Listener btn2Listener = new Button2Listener();
		Button3Listener btn3Listener = new Button3Listener();

		//3. ע�����
		btnRed.addActionListener(btn1Listener);
		btnGreen.addActionListener(btn2Listener);
		btnYellow.addActionListener(btn3Listener);

		// ����ť��ӵ������
		p.add(btnRed);
		p.add(btnGreen);
		p.add(btnYellow);

		// �������ӵ�������
		this.add(p);

		// �趨���ڴ�С
		this.setSize(300, 300);
		// �趨�������Ͻ�����
		this.setLocation(200, 100);
		// �趨����Ĭ�Ϲرշ�ʽΪ�˳�Ӧ�ó���
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// ���ô��ڿ��ӣ���ʾ��
		this.setVisible(true);
	}

	// 1. ������չActionListener�ļ�����
	// �ü�������һ���ڲ��࣬�Ա����ֱ�Ӷ��ⲿ���е���Դ���з���
	class Button1Listener implements ActionListener {
		// ��дActionListener�ӿ��е��¼�������actionPerformed()
		public void actionPerformed(ActionEvent e) {
		// �������ı�����ɫ�Ǻ�ɫColor.red
		p.setBackground(Color.red);	
		}
	}
	
	class Button2Listener implements ActionListener {
		// ��дActionListener�ӿ��е��¼�������actionPerformed()
		public void actionPerformed(ActionEvent e) {
		// �������ı�����ɫ�Ǻ�ɫColor.red
		p.setBackground(Color.GREEN);
		}
	}
	class Button3Listener implements ActionListener {
		// ��дActionListener�ӿ��е��¼�������actionPerformed()
		public void actionPerformed(ActionEvent e) {
		// �������ı�����ɫ�ǻ�ɫColor.yellow
		p.setBackground(Color.yellow);

		}
	}

	public static void main(String[] args) {
		new ChangeColor();
	}
}
