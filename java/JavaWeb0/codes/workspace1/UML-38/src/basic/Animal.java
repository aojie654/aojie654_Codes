package basic;

public abstract class Animal {
	//��������
	public boolean isAlive;
	public Animal(){
		isAlive =true;
		System.out.println("һ�������������ˣ�");
	}
	//�³´�л��������O2��Water�� ������ϵ��
	public void inAndOut(O2 o2,Water water){
		if(o2==null||water==null){
			isAlive= false;
			System.out.println("û��ˮ���������������ܴ�л��������");
		}
		System.out.println("��������ˮ�������������³´�л��");
	}
	
	public void breed(){
		if(isAlive){
			System.out.println("���������������з�ֳ");
		}else{
			System.out.println("�����������޷���ֳ��");
		}
	}
}
