package basic;

public abstract class Animal {
	//�Ƿ���������
	public boolean isAlive;
	
	public Animal(){
		isAlive = true;
		System.out.println("���������ˣ�");
	}
	//��ֳ
	public void breed(){
		if(isAlive){
			System.out.println("��������������");
		}else{
			System.out.println("�����������޷���ֳ��");
		}
	}
	//�³´�л
	public void inAndOut(Air air,Water water){
		if(air==null||water==null){
			isAlive=false;
		}
		System.out.println("�����������³´�л��");
	}
}
