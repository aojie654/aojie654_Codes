package event2;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ChangeColor {

	// Frame Panel Button

	public JFrame f;
	public JPanel p;
	public JButton b1, b2, b3;

	// ���캯��û�з���ֵ��
	public ChangeColor() {
		b1 = new JButton("��ɫ");
		b2 = new JButton("��ɫ");
		b3 = new JButton("��ɫ");
		p = new JPanel();
		f = new JFrame("����");
		p.add(b1);
		p.add(b2);
		p.add(b3);
		f.add(p);
		f.setSize(200, 300);
		f.setLocation(50, 200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);// ��ʼ���ú���ʾ���ڣ�
		// ���������ϼ�����
		addListener();
	}

	public static void main(String[] args) {
		new ChangeColor();
	}

	// ��Ӽ�����
	public void addListener() {
		this.b1.addActionListener(new b1Listener());// ��b1ע�������
		this.b2.addActionListener(new b2Listener());// ��b2ע�������
		this.b3.addActionListener(new b3Listener());// ��b3ע�������
	}

	// �ڲ��� �����������ʵ�ֽӿ�
	class b1Listener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			p.setBackground(Color.RED);
		}
	}

	class b2Listener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			p.setBackground(Color.GREEN);
		}
	}

	class b3Listener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			p.setBackground(Color.YELLOW);
		}
	}
}