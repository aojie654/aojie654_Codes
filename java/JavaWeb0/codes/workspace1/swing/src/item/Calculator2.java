package item;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
//1 �������Ľ� ��һ�ġ��е��Լ�����ɫ����������Ϣ��+ - GridBagLayout����
//2 �����ҽ������ 
//3 ���±����棡ʹ��Menu

public class Calculator2 extends JFrame {
	// ����һ���ı����ؼ���������ʾ������
	private JTextField txtResult;
	private JPanel p;
	// ����һ���ַ������飬���������а�ť�����ֶ����ڸ�������
	private String name[] = { "7", "8", "9", "+", "4", "5", "6", "-", "1", "2",
			"3", "*", "0", ".", "=", "/" ,"c","^","%","qrt"};
	// ����һ����ť���飬������ĳ������ַ�������ĳ���Ϊ׼
	private JButton button[] = new JButton[name.length];
	// ����һ����ż������ı�������ʼΪ0
	private double result = 0;
	// ������һ������������ʼΪ��=��
	private String lastCommand = "=";
	// ��ʶ�Ƿ��ǿ�ʼ
	private boolean start = true;

	public Calculator2() {
		super("������");
		// ʵ�����ı����ؼ�
		txtResult = new JTextField(20);
		// �����ı����ǽ���״̬
		txtResult.setFocusable(false);
		// ���ı����ؼ������ڴ����ܵ��Ϸ���������
		this.add(txtResult, BorderLayout.NORTH);
		// ʵ����������ͬʱ���ô���岼��Ϊ4��4�е����񲼾�
		p = new JPanel(new GridLayout(5, 4));
		// ѭ��ʵ������ť��������
		// ʵ������ť��������
		ButtonAction ba = new ButtonAction();
		// ʵ�������̼�������
		KeyAction ka = new KeyAction();
		for (int i = 0; i < button.length; i++) {
			button[i] = new JButton(name[i]);
			// ע�����
			button[i].addActionListener(ba);
			button[i].addKeyListener(ka);
			p.add(button[i]);
		}

		this.add(p, BorderLayout.CENTER);
		// �趨���ڴ�С
		this.setSize(300, 300);
		// �趨�������Ͻ�����
		this.setLocation(200, 100);
		// �趨����Ĭ�Ϲرշ�ʽΪ�˳�Ӧ�ó���
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// ���ô��ڿ��ӣ���ʾ��
		this.setVisible(true);
	}

	// ����
	public void calculate(double x) {
		if (lastCommand.equals("+"))
			result += x;
		else if (lastCommand.equals("-"))
			result -= x;
		else if (lastCommand.equals("*"))
			result *= x;
		else if (lastCommand.equals("/"))
			result /= x;
		else if (lastCommand.equals("="))
			result = x;
		// �������ʾ���ı���
		txtResult.setText("" + result);
	}

	// �����ť����
	private class ButtonAction implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String input = e.getActionCommand();
			if(input.equals("c")){
				lastCommand ="=";
				result = 0;
				txtResult.setText("");
			}else{
				// ����������Ű�ť
				if (input.equals("+") || input.equals("-") || input.equals("*")
						|| input.equals("/") || input.equals("=")) {
					if (start) {//���Ϊ�� ��¼�������=
						lastCommand = input;
					} else {//���Ϊ�� ���м��㣬 ��¼���startΪ��
						calculate(Double.parseDouble(txtResult.getText()));
						lastCommand = input;
						start = true;
					}
				} else {//���ǲ�������ť�����ְ�ť��
					if (start) {//���Ϊ�� �����г�ʼ����txtΪ�ա�startΪ��
						txtResult.setText("");
						start = false;
					}//�˵���Ϊ��������+�����롣
					txtResult.setText(txtResult.getText() + input);
				}
			}
		}
	}

	// ���̼���
	private class KeyAction extends KeyAdapter {
		public void keyTyped(KeyEvent e) {
			char key = e.getKeyChar();
			// �û��ļ���������
			if (key == '0' || key == '1' || key == '2' || key == '3'
					|| key == '4' || key == '5' || key == '6' || key == '7'
					|| key == '8' || key == '9' || key == '9') {
				if (start) {
					txtResult.setText("");
					start = false;
				}
				txtResult.setText(txtResult.getText() + key);
			}
			// �û��ļ����ǲ�������
			else if (key == '+' || key == '-' || key == '*' || key == '/'
					|| key == '=') {
				if (start) {
					if (key == '-') {
						txtResult.setText(String.valueOf(key));
						start = false;
					} else
						lastCommand = String.valueOf(key);
				} else {
					calculate(Double.parseDouble(txtResult.getText()));
					lastCommand = String.valueOf(key);
					start = true;
				}
			}
		}
	}

	public static void main(String[] args) {
		new Calculator2();
	}
}
