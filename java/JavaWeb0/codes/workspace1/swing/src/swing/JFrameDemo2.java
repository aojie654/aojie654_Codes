package swing;

import javax.swing.JFrame;

public class JFrameDemo2 {
	private JFrame jframe;
	public JFrameDemo2() {
		// ���ø��๹�췽������ָ�����ڱ���
		jframe= new JFrame("frame");
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
		// ʵ����һ��JFrameDemo����
		new JFrameDemo2();
	}

}
