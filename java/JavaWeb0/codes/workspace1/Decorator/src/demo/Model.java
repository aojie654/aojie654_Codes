package demo;

public class Model implements Show{

	private String name;
	public Model(String name){
		this.name = name;
	}
	//װ��ģʽҪ��model��show��������װ�Σ�
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println(name+" ,���Ŵ��õ�ģ�أ�����ʱ����ǰ�أ�");
	}

}
