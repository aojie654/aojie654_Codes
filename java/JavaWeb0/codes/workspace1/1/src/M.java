import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class M extends JFrame {

	public M() {
		// ���ô�С
		setSize(600, 300);
		// ��������λ��
		setLocation(300, 200);
		// �����˵���
		JMenuBar bar = new JMenuBar();
		// �����˵�
		JMenu m1 = new JMenu("�ļ�");
		JMenu m2 = new JMenu("�༭");
		JMenu m3 = new JMenu("��ʽ");
		JMenu m4 = new JMenu("����");
		JMenu m5 = new JMenu("�汾");
		// ���˵���ӵ��˵�����
		bar.add(m1);
		bar.add(m2);
		bar.add(m3);
		bar.add(m4);
		bar.add(m5);
		// �����˵���
		JMenuItem i1 = new JMenuItem("���к�");
		JMenuItem i2 = new JMenuItem("�˳�");
		JMenuItem i3 = new JMenuItem("��ɫ");
		JMenuItem i4 = new JMenuItem("��ɫ");
		JMenuItem i5 = new JMenuItem("��ɫ");
		// ���˵����ӵ��˵�����
		m1.add(i1);
		m1.add(i2);
		m2.add(i3);
		m2.add(i4);
		m2.add(i5);
		// ���˵�����ӵ�������
		getContentPane().add(bar, BorderLayout.NORTH);
		// ����һ���ı���
		final JTextArea a1 = new JTextArea();
		// ���ı�����ӵ�������
		getContentPane().add(a1);
		// ���i1�ļ����¼�
		i1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(getContentPane(), a1.getText());
			}
		});
		i2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		i3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				a1.setBackground(Color.PINK);
			}
		});
		i4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				a1.setBackground(Color.CYAN);
			}
		});
		i5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				a1.setBackground(Color.WHITE);
			}
		});

		// ������ʾ
		setVisible(true);
	}

	public static void main(String[] args) {
		new M();
	}

}
