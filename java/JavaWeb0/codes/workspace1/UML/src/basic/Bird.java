package basic;

public abstract class Bird extends Animal{
	public String feather="��ë";
	public String beak="�";
	//wing1 wing2������������
	public Wing wing1;
	public Wing wing2;
	//��Ĺ��캯���������Լ��ĳ��
	public Bird(){
		super();//�ڹ��캯���жԳ����г�ʼ���������Ǵ��ݽ�����
		wing1 = new Wing();
		wing2 = new Wing();
	}
	
	public abstract void layEggs();
	
	
}
