package adapter;

public class Adapter implements Target{
	private Adaptee adaptee;//Ҫ�����������3ͷ������
	
	public Adapter(Adaptee adaptee){
		this.adaptee = adaptee;//������������ʼ����
	}

	@Override
	public void plug2() {//���䷽�����й���Target�е�2ͷ������
		// Ҫʹ�ô�����������������3�ײ�����ת����2�ײ��������й���2ͷ��ͷ����ȥ��
		System.out.println("ʹ��ת����ͷ�����й���2ͷ��ͷת����3ͷ����������������");
		adaptee.socket3();
	}
}
