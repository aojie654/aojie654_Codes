package basic;
public abstract class Bird extends Animal{
	//��Ա����
	public String feather="��ë";
	public String beak="�";
	private Wing wing1;//���1
	private Wing wing2;//���2
	public Bird(){
		super();//Ĭ��ϵͳ���ø���Ĺ��캯�����޲Ρ�
		wing1= new Wing();//�ڹ��캯�������ɳ��
		wing2= new Wing();
	}
	//�µ������ǳ��󷽷���
	public abstract void layEggs();
}
