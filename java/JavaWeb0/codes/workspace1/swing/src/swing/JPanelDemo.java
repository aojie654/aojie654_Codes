package swing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JPanelDemo{
	private JFrame jframe;
	// ����һ��������
	private JPanel p;
	// ����������ť����
	private JButton btnOk, btnCancel;

	public JPanelDemo() {
		jframe = new JFrame("JPanelDemo");

		// ʵ����������p��Ĭ��Ϊ�����֣�
		p = new JPanel();

		// ʵ����һ����ť���󣬸ð�ť�ϵ��ı�Ϊ��ȷ�ϡ�
		btnOk = new JButton("ȷ��");
		// ʵ����һ����ť���󣬸ð�ť�ϵ��ı�Ϊ��ȡ����
		btnCancel = new JButton("ȡ��");

		// ����ť��ӵ������
		p.add(btnOk);
		p.add(btnCancel);

		// �������ӵ�������
		jframe.add(p);

		// �趨���ڴ�С�����400���أ��߶�300���أ�
		jframe.setSize(400, 300);
		// �趨�������Ͻ����꣨X��200���أ�Y��100���أ�
		jframe.setLocation(200, 100);
		// �趨����Ĭ�Ϲرշ�ʽΪ�˳�Ӧ�ó���
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// ���ô��ڿ��ӣ���ʾ��
		jframe.setVisible(true);
	}

	public static void main(String[] args) {
		new JPanelDemo();
	}

}
