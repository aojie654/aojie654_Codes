package adapter1;

public class Adapter implements Target{
	//����������ģʽ��
	private Adaptee adaptee;
	//�ڹ��캯���г�ʼ����������
	public Adapter(Adaptee adaptee){
		this.adaptee=adaptee;
	}
	@Override
	public void socket2() {//ʹ����������װ��ԭ���ķ�����
		// TODO Auto-generated method stub
		System.out.println("ʹ�����������������ײ������ṩ��ϣ����2�ײ�����");
		adaptee.socket3();//ʹ����������3�ײ�����
		System.out.println("ʹ����������3�ײ�����");

	}
	@Override
	public int volt220() {
		// TODO Auto-generated method stub
		System.out.println("ʹ������������������110V��ѹ���ṩ��220����ѹ��");
		int volt = adaptee.volt110()*2;//ʹ����������110��ѹ��
		System.out.println("ʹ����������110V��ѹ,�������˱�ѹ�������õ�������ѹ"+volt+"����");
		return volt;
	}
}
