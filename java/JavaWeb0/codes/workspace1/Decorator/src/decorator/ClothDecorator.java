package decorator;

public class ClothDecorator implements Show{
	//�ۺ�show����
	private Show component;
	//ͨ��װ�η�����component���г�ʼ����
	public void decorate(Show show){//���ô˷������ӵ���Լ���component��
		this.component = show;
	}
	@Override
	public void show() {
		if(component!=null){//������Լ������������������show������
			component.show();//����component��show������
		}
	}
}
